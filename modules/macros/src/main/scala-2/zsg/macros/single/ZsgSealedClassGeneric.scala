package zsg.macros.single

import zsg.macros.ZsgParameters
import zsg.macros.single.utils.SealedHelper

import scala.language.experimental.macros
import scala.collection.compat._

trait ZsgSealedClassGeneric[H, NameType] {
  def names: NameType
}

object ZsgSealedClassGeneric {

  def value[T, Model](name: T): ZsgSealedClassGeneric[Model, T] =
    new ZsgSealedClassGeneric[Model, T] {
      override def names: T = name
    }

  implicit def macroImpl[H, II]: ZsgSealedClassGeneric[H, II] = macro ZsgSealedClassGenericMacroApply.MacroImpl1.generic[H, II]

}

object ZsgSealedClassGenericMacroApply {

  class MacroImpl1(override val c: scala.reflect.macros.blackbox.Context) extends SealedHelper {
    self =>

    import c.universe._

    def generic[H: c.WeakTypeTag, M: c.WeakTypeTag]: c.Expr[ZsgSealedClassGeneric[H, M]] = {
      try {
        val h     = c.weakTypeOf[H]
        val hType = h.resultType

        val props = fleshedOutSubtypes(hType).to(List)

        val nameTag = props.map { subType => q"""classOf[${subType}]""" }
        def nameTagGen(tree: List[Tree]): Tree = if (tree.length == 1) q"""..${tree}"""
        else {
          val groupedTree = tree.grouped(ZsgParameters.maxPropertyNum).to(List)
          nameTagGen(groupedTree.map(s => if (s.size > 1) q"""new _root_.zsg.ZsgTuple2(..${s})""" else q"""..$s"""))
        }

        c.Expr[ZsgSealedClassGeneric[H, M]] {
          q"""_root_.zsg.macros.single.ZsgSealedClassGeneric.value(${nameTagGen(nameTag)})"""
        }

      } catch {
        case e: Exception =>
          e.printStackTrace
          throw e
      }
    }
  }

}
