package asuna.macros

import scala.language.experimental.macros

trait AsunaLabelledGeneric[H, NameType] {
  def names(): NameType
}

object AsunaLabelledGeneric extends AsunaLabelledGenericMacroPoly

trait AsunaLabelledGenericMacroPoly {

  implicit def macroImpl[H, II]: AsunaLabelledGeneric[H, II] = macro AsunaLabelledGenericMacroApply.MacroImpl.generic[H, II]

}

object AsunaLabelledGenericMacroApply {

  class MacroImpl(val c: scala.reflect.macros.blackbox.Context) {
    self =>

    import c.universe._

    def generic[H: c.WeakTypeTag, M: c.WeakTypeTag]: c.Expr[AsunaLabelledGeneric[H, M]] = {
      try {
        val h     = c.weakTypeOf[H]
        val hType = h.resultType

        val props = hType.members.toList
          .filter { s =>
            s.isTerm && s.asTerm.isVal && s.asTerm.isCaseAccessor
          }
          .map(s => (s.name, s))
          .collect {
            case (TermName(n), s) =>
              val proName = n.trim
              proName
          }
          .reverse

        val nameTag = props.map { name =>
          q"""${Literal(Constant(name))}"""
        }
        def nameTagGen(tree: List[Tree]): Tree =
          if (tree.length <= 8) {
            q"""asuna.BuildContent.${TermName("tuple" + tree.length)}(..${tree})"""
          } else {
            val groupedTree = tree.grouped(8).toList
            nameTagGen(groupedTree.map(s => q"""asuna.BuildContent.${TermName("tuple" + s.length)}(..${s})"""))
          }

        c.Expr[AsunaLabelledGeneric[H, M]] {
          q"""{ () => ${nameTagGen(nameTag)} }"""
        }

      } catch {
        case e: Exception =>
          e.printStackTrace
          throw e
      }
    }
  }

}