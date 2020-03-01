package asuna.scala_tuple.tuple_support
import asuna.Application6
import asuna.Context6
import asuna.AppendTag
import asuna.BuildTag
import scala.language.higherKinds
trait ScalaTupleImplicits_19_6 {
     given  tupleTagApplicationImplicit_tagNum19_typeParamNum6[
        F[_ , _ , _ , _ , _ , _],
        Tag1 , Tag2 , Tag3 , Tag4 , Tag5 , Tag6 , Tag7 , Tag8 , Tag9 , Tag10 , Tag11 , Tag12 , Tag13 , Tag14 , Tag15 , Tag16 , Tag17 , Tag18 , Tag19,
        Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14 , Plus1_X15 , Plus1_X16 , Plus1_X17 , Plus1_X18 , Plus1_X19,
        Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11 , Plus2_X12 , Plus2_X13 , Plus2_X14 , Plus2_X15 , Plus2_X16 , Plus2_X17 , Plus2_X18 , Plus2_X19,
        Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7 , Plus3_X8 , Plus3_X9 , Plus3_X10 , Plus3_X11 , Plus3_X12 , Plus3_X13 , Plus3_X14 , Plus3_X15 , Plus3_X16 , Plus3_X17 , Plus3_X18 , Plus3_X19,
        Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4 , Plus4_X5 , Plus4_X6 , Plus4_X7 , Plus4_X8 , Plus4_X9 , Plus4_X10 , Plus4_X11 , Plus4_X12 , Plus4_X13 , Plus4_X14 , Plus4_X15 , Plus4_X16 , Plus4_X17 , Plus4_X18 , Plus4_X19,
        Plus5_X1 , Plus5_X2 , Plus5_X3 , Plus5_X4 , Plus5_X5 , Plus5_X6 , Plus5_X7 , Plus5_X8 , Plus5_X9 , Plus5_X10 , Plus5_X11 , Plus5_X12 , Plus5_X13 , Plus5_X14 , Plus5_X15 , Plus5_X16 , Plus5_X17 , Plus5_X18 , Plus5_X19,
        Plus6_X1 , Plus6_X2 , Plus6_X3 , Plus6_X4 , Plus6_X5 , Plus6_X6 , Plus6_X7 , Plus6_X8 , Plus6_X9 , Plus6_X10 , Plus6_X11 , Plus6_X12 , Plus6_X13 , Plus6_X14 , Plus6_X15 , Plus6_X16 , Plus6_X17 , Plus6_X18 , Plus6_X19
    ]( given 
    t1: Application6[F, Tag1, Plus1_X1 , Plus2_X1 , Plus3_X1 , Plus4_X1 , Plus5_X1 , Plus6_X1] , t2: Application6[F, Tag2, Plus1_X2 , Plus2_X2 , Plus3_X2 , Plus4_X2 , Plus5_X2 , Plus6_X2] , t3: Application6[F, Tag3, Plus1_X3 , Plus2_X3 , Plus3_X3 , Plus4_X3 , Plus5_X3 , Plus6_X3] , t4: Application6[F, Tag4, Plus1_X4 , Plus2_X4 , Plus3_X4 , Plus4_X4 , Plus5_X4 , Plus6_X4] , t5: Application6[F, Tag5, Plus1_X5 , Plus2_X5 , Plus3_X5 , Plus4_X5 , Plus5_X5 , Plus6_X5] , t6: Application6[F, Tag6, Plus1_X6 , Plus2_X6 , Plus3_X6 , Plus4_X6 , Plus5_X6 , Plus6_X6] , t7: Application6[F, Tag7, Plus1_X7 , Plus2_X7 , Plus3_X7 , Plus4_X7 , Plus5_X7 , Plus6_X7] , t8: Application6[F, Tag8, Plus1_X8 , Plus2_X8 , Plus3_X8 , Plus4_X8 , Plus5_X8 , Plus6_X8] , t9: Application6[F, Tag9, Plus1_X9 , Plus2_X9 , Plus3_X9 , Plus4_X9 , Plus5_X9 , Plus6_X9] , t10: Application6[F, Tag10, Plus1_X10 , Plus2_X10 , Plus3_X10 , Plus4_X10 , Plus5_X10 , Plus6_X10] , t11: Application6[F, Tag11, Plus1_X11 , Plus2_X11 , Plus3_X11 , Plus4_X11 , Plus5_X11 , Plus6_X11] , t12: Application6[F, Tag12, Plus1_X12 , Plus2_X12 , Plus3_X12 , Plus4_X12 , Plus5_X12 , Plus6_X12] , t13: Application6[F, Tag13, Plus1_X13 , Plus2_X13 , Plus3_X13 , Plus4_X13 , Plus5_X13 , Plus6_X13] , t14: Application6[F, Tag14, Plus1_X14 , Plus2_X14 , Plus3_X14 , Plus4_X14 , Plus5_X14 , Plus6_X14] , t15: Application6[F, Tag15, Plus1_X15 , Plus2_X15 , Plus3_X15 , Plus4_X15 , Plus5_X15 , Plus6_X15] , t16: Application6[F, Tag16, Plus1_X16 , Plus2_X16 , Plus3_X16 , Plus4_X16 , Plus5_X16 , Plus6_X16] , t17: Application6[F, Tag17, Plus1_X17 , Plus2_X17 , Plus3_X17 , Plus4_X17 , Plus5_X17 , Plus6_X17] , t18: Application6[F, Tag18, Plus1_X18 , Plus2_X18 , Plus3_X18 , Plus4_X18 , Plus5_X18 , Plus6_X18] , t19: Application6[F, Tag19, Plus1_X19 , Plus2_X19 , Plus3_X19 , Plus4_X19 , Plus5_X19 , Plus6_X19]): Application6[
        F,
        Tuple19[Tag1 , Tag2 , Tag3 , Tag4 , Tag5 , Tag6 , Tag7 , Tag8 , Tag9 , Tag10 , Tag11 , Tag12 , Tag13 , Tag14 , Tag15 , Tag16 , Tag17 , Tag18 , Tag19],
        Tuple19[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14 , Plus1_X15 , Plus1_X16 , Plus1_X17 , Plus1_X18 , Plus1_X19],
        Tuple19[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11 , Plus2_X12 , Plus2_X13 , Plus2_X14 , Plus2_X15 , Plus2_X16 , Plus2_X17 , Plus2_X18 , Plus2_X19],
        Tuple19[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7 , Plus3_X8 , Plus3_X9 , Plus3_X10 , Plus3_X11 , Plus3_X12 , Plus3_X13 , Plus3_X14 , Plus3_X15 , Plus3_X16 , Plus3_X17 , Plus3_X18 , Plus3_X19],
        Tuple19[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4 , Plus4_X5 , Plus4_X6 , Plus4_X7 , Plus4_X8 , Plus4_X9 , Plus4_X10 , Plus4_X11 , Plus4_X12 , Plus4_X13 , Plus4_X14 , Plus4_X15 , Plus4_X16 , Plus4_X17 , Plus4_X18 , Plus4_X19],
        Tuple19[Plus5_X1 , Plus5_X2 , Plus5_X3 , Plus5_X4 , Plus5_X5 , Plus5_X6 , Plus5_X7 , Plus5_X8 , Plus5_X9 , Plus5_X10 , Plus5_X11 , Plus5_X12 , Plus5_X13 , Plus5_X14 , Plus5_X15 , Plus5_X16 , Plus5_X17 , Plus5_X18 , Plus5_X19],
        Tuple19[Plus6_X1 , Plus6_X2 , Plus6_X3 , Plus6_X4 , Plus6_X5 , Plus6_X6 , Plus6_X7 , Plus6_X8 , Plus6_X9 , Plus6_X10 , Plus6_X11 , Plus6_X12 , Plus6_X13 , Plus6_X14 , Plus6_X15 , Plus6_X16 , Plus6_X17 , Plus6_X18 , Plus6_X19]
    ] = new Application6[
        F,
        Tuple19[Tag1 , Tag2 , Tag3 , Tag4 , Tag5 , Tag6 , Tag7 , Tag8 , Tag9 , Tag10 , Tag11 , Tag12 , Tag13 , Tag14 , Tag15 , Tag16 , Tag17 , Tag18 , Tag19],
        Tuple19[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14 , Plus1_X15 , Plus1_X16 , Plus1_X17 , Plus1_X18 , Plus1_X19],
        Tuple19[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11 , Plus2_X12 , Plus2_X13 , Plus2_X14 , Plus2_X15 , Plus2_X16 , Plus2_X17 , Plus2_X18 , Plus2_X19],
        Tuple19[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7 , Plus3_X8 , Plus3_X9 , Plus3_X10 , Plus3_X11 , Plus3_X12 , Plus3_X13 , Plus3_X14 , Plus3_X15 , Plus3_X16 , Plus3_X17 , Plus3_X18 , Plus3_X19],
        Tuple19[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4 , Plus4_X5 , Plus4_X6 , Plus4_X7 , Plus4_X8 , Plus4_X9 , Plus4_X10 , Plus4_X11 , Plus4_X12 , Plus4_X13 , Plus4_X14 , Plus4_X15 , Plus4_X16 , Plus4_X17 , Plus4_X18 , Plus4_X19],
        Tuple19[Plus5_X1 , Plus5_X2 , Plus5_X3 , Plus5_X4 , Plus5_X5 , Plus5_X6 , Plus5_X7 , Plus5_X8 , Plus5_X9 , Plus5_X10 , Plus5_X11 , Plus5_X12 , Plus5_X13 , Plus5_X14 , Plus5_X15 , Plus5_X16 , Plus5_X17 , Plus5_X18 , Plus5_X19],
        Tuple19[Plus6_X1 , Plus6_X2 , Plus6_X3 , Plus6_X4 , Plus6_X5 , Plus6_X6 , Plus6_X7 , Plus6_X8 , Plus6_X9 , Plus6_X10 , Plus6_X11 , Plus6_X12 , Plus6_X13 , Plus6_X14 , Plus6_X15 , Plus6_X16 , Plus6_X17 , Plus6_X18 , Plus6_X19]
    ] {
        override def application(context: Context6[F]): F[
            Tuple19[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14 , Plus1_X15 , Plus1_X16 , Plus1_X17 , Plus1_X18 , Plus1_X19],
            Tuple19[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11 , Plus2_X12 , Plus2_X13 , Plus2_X14 , Plus2_X15 , Plus2_X16 , Plus2_X17 , Plus2_X18 , Plus2_X19],
            Tuple19[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7 , Plus3_X8 , Plus3_X9 , Plus3_X10 , Plus3_X11 , Plus3_X12 , Plus3_X13 , Plus3_X14 , Plus3_X15 , Plus3_X16 , Plus3_X17 , Plus3_X18 , Plus3_X19],
            Tuple19[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4 , Plus4_X5 , Plus4_X6 , Plus4_X7 , Plus4_X8 , Plus4_X9 , Plus4_X10 , Plus4_X11 , Plus4_X12 , Plus4_X13 , Plus4_X14 , Plus4_X15 , Plus4_X16 , Plus4_X17 , Plus4_X18 , Plus4_X19],
            Tuple19[Plus5_X1 , Plus5_X2 , Plus5_X3 , Plus5_X4 , Plus5_X5 , Plus5_X6 , Plus5_X7 , Plus5_X8 , Plus5_X9 , Plus5_X10 , Plus5_X11 , Plus5_X12 , Plus5_X13 , Plus5_X14 , Plus5_X15 , Plus5_X16 , Plus5_X17 , Plus5_X18 , Plus5_X19],
            Tuple19[Plus6_X1 , Plus6_X2 , Plus6_X3 , Plus6_X4 , Plus6_X5 , Plus6_X6 , Plus6_X7 , Plus6_X8 , Plus6_X9 , Plus6_X10 , Plus6_X11 , Plus6_X12 , Plus6_X13 , Plus6_X14 , Plus6_X15 , Plus6_X16 , Plus6_X17 , Plus6_X18 , Plus6_X19]
        ] = {
            val asunaTuple2F = Application6.lift(BuildTag.nodeTag(BuildTag.nodeTag(BuildTag.nodeTag(BuildTag.nodeTag(BuildTag.tag(AppendTag[Tag1] , AppendTag[Tag2]) , BuildTag.tag(AppendTag[Tag3] , AppendTag[Tag4])) , BuildTag.nodeTag(BuildTag.tag(AppendTag[Tag5] , AppendTag[Tag6]) , BuildTag.tag(AppendTag[Tag7] , AppendTag[Tag8]))) , BuildTag.nodeTag(BuildTag.nodeTag(BuildTag.tag(AppendTag[Tag9] , AppendTag[Tag10]) , BuildTag.tag(AppendTag[Tag11] , AppendTag[Tag12])) , BuildTag.nodeTag(BuildTag.tag(AppendTag[Tag13] , AppendTag[Tag14]) , BuildTag.tag(AppendTag[Tag15] , AppendTag[Tag16])))) , BuildTag.nodeTag(BuildTag.nodeTag(BuildTag.nodeTag(BuildTag.tag(AppendTag[Tag17] , AppendTag[Tag18]) , BuildTag.tag(AppendTag[Tag19])))))).application(context)
            context.append(asunaTuple2F, context.start)(PlusToTuple6.plus6WithTypeParameter19)
        }
    }
}
object ScalaTupleImplicits_19_6 extends ScalaTupleImplicits_19_6