package zsg.scala_tuple.tuple_support
import zsg.Application5
import zsg.Context5
import scala.language.higherKinds
trait ScalaTupleImplicits_19_5 {
         inline given  [
            F[_ , _ , _ , _ , _],
            T <: Context5[F],
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14 , Plus1_X15 , Plus1_X16 , Plus1_X17 , Plus1_X18 , Plus1_X19,
            Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11 , Plus2_X12 , Plus2_X13 , Plus2_X14 , Plus2_X15 , Plus2_X16 , Plus2_X17 , Plus2_X18 , Plus2_X19,
            Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7 , Plus3_X8 , Plus3_X9 , Plus3_X10 , Plus3_X11 , Plus3_X12 , Plus3_X13 , Plus3_X14 , Plus3_X15 , Plus3_X16 , Plus3_X17 , Plus3_X18 , Plus3_X19,
            Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4 , Plus4_X5 , Plus4_X6 , Plus4_X7 , Plus4_X8 , Plus4_X9 , Plus4_X10 , Plus4_X11 , Plus4_X12 , Plus4_X13 , Plus4_X14 , Plus4_X15 , Plus4_X16 , Plus4_X17 , Plus4_X18 , Plus4_X19,
            Plus5_X1 , Plus5_X2 , Plus5_X3 , Plus5_X4 , Plus5_X5 , Plus5_X6 , Plus5_X7 , Plus5_X8 , Plus5_X9 , Plus5_X10 , Plus5_X11 , Plus5_X12 , Plus5_X13 , Plus5_X14 , Plus5_X15 , Plus5_X16 , Plus5_X17 , Plus5_X18 , Plus5_X19
        ]( using 
              inline  t1: F[  Plus1_X1   ,  Plus2_X1   ,  Plus3_X1   ,  Plus4_X1   ,  Plus5_X1 ],   inline  t2: F[  Plus1_X2   ,  Plus2_X2   ,  Plus3_X2   ,  Plus4_X2   ,  Plus5_X2 ],   inline  t3: F[  Plus1_X3   ,  Plus2_X3   ,  Plus3_X3   ,  Plus4_X3   ,  Plus5_X3 ],   inline  t4: F[  Plus1_X4   ,  Plus2_X4   ,  Plus3_X4   ,  Plus4_X4   ,  Plus5_X4 ],   inline  t5: F[  Plus1_X5   ,  Plus2_X5   ,  Plus3_X5   ,  Plus4_X5   ,  Plus5_X5 ],   inline  t6: F[  Plus1_X6   ,  Plus2_X6   ,  Plus3_X6   ,  Plus4_X6   ,  Plus5_X6 ],   inline  t7: F[  Plus1_X7   ,  Plus2_X7   ,  Plus3_X7   ,  Plus4_X7   ,  Plus5_X7 ],   inline  t8: F[  Plus1_X8   ,  Plus2_X8   ,  Plus3_X8   ,  Plus4_X8   ,  Plus5_X8 ],   inline  t9: F[  Plus1_X9   ,  Plus2_X9   ,  Plus3_X9   ,  Plus4_X9   ,  Plus5_X9 ],   inline  t10: F[  Plus1_X10   ,  Plus2_X10   ,  Plus3_X10   ,  Plus4_X10   ,  Plus5_X10 ],   inline  t11: F[  Plus1_X11   ,  Plus2_X11   ,  Plus3_X11   ,  Plus4_X11   ,  Plus5_X11 ],   inline  t12: F[  Plus1_X12   ,  Plus2_X12   ,  Plus3_X12   ,  Plus4_X12   ,  Plus5_X12 ],   inline  t13: F[  Plus1_X13   ,  Plus2_X13   ,  Plus3_X13   ,  Plus4_X13   ,  Plus5_X13 ],   inline  t14: F[  Plus1_X14   ,  Plus2_X14   ,  Plus3_X14   ,  Plus4_X14   ,  Plus5_X14 ],   inline  t15: F[  Plus1_X15   ,  Plus2_X15   ,  Plus3_X15   ,  Plus4_X15   ,  Plus5_X15 ],   inline  t16: F[  Plus1_X16   ,  Plus2_X16   ,  Plus3_X16   ,  Plus4_X16   ,  Plus5_X16 ],   inline  t17: F[  Plus1_X17   ,  Plus2_X17   ,  Plus3_X17   ,  Plus4_X17   ,  Plus5_X17 ],   inline  t18: F[  Plus1_X18   ,  Plus2_X18   ,  Plus3_X18   ,  Plus4_X18   ,  Plus5_X18 ],   inline  t19: F[  Plus1_X19   ,  Plus2_X19   ,  Plus3_X19   ,  Plus4_X19   ,  Plus5_X19 ], 
             inline  context: T
        )  as  Application5[
            F,
            T,
            Tuple19[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14 , Plus1_X15 , Plus1_X16 , Plus1_X17 , Plus1_X18 , Plus1_X19],
            Tuple19[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11 , Plus2_X12 , Plus2_X13 , Plus2_X14 , Plus2_X15 , Plus2_X16 , Plus2_X17 , Plus2_X18 , Plus2_X19],
            Tuple19[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7 , Plus3_X8 , Plus3_X9 , Plus3_X10 , Plus3_X11 , Plus3_X12 , Plus3_X13 , Plus3_X14 , Plus3_X15 , Plus3_X16 , Plus3_X17 , Plus3_X18 , Plus3_X19],
            Tuple19[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4 , Plus4_X5 , Plus4_X6 , Plus4_X7 , Plus4_X8 , Plus4_X9 , Plus4_X10 , Plus4_X11 , Plus4_X12 , Plus4_X13 , Plus4_X14 , Plus4_X15 , Plus4_X16 , Plus4_X17 , Plus4_X18 , Plus4_X19],
            Tuple19[Plus5_X1 , Plus5_X2 , Plus5_X3 , Plus5_X4 , Plus5_X5 , Plus5_X6 , Plus5_X7 , Plus5_X8 , Plus5_X9 , Plus5_X10 , Plus5_X11 , Plus5_X12 , Plus5_X13 , Plus5_X14 , Plus5_X15 , Plus5_X16 , Plus5_X17 , Plus5_X18 , Plus5_X19]
        ] = new Application5[
            F,
            T,
            Tuple19[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14 , Plus1_X15 , Plus1_X16 , Plus1_X17 , Plus1_X18 , Plus1_X19],
            Tuple19[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11 , Plus2_X12 , Plus2_X13 , Plus2_X14 , Plus2_X15 , Plus2_X16 , Plus2_X17 , Plus2_X18 , Plus2_X19],
            Tuple19[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7 , Plus3_X8 , Plus3_X9 , Plus3_X10 , Plus3_X11 , Plus3_X12 , Plus3_X13 , Plus3_X14 , Plus3_X15 , Plus3_X16 , Plus3_X17 , Plus3_X18 , Plus3_X19],
            Tuple19[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4 , Plus4_X5 , Plus4_X6 , Plus4_X7 , Plus4_X8 , Plus4_X9 , Plus4_X10 , Plus4_X11 , Plus4_X12 , Plus4_X13 , Plus4_X14 , Plus4_X15 , Plus4_X16 , Plus4_X17 , Plus4_X18 , Plus4_X19],
            Tuple19[Plus5_X1 , Plus5_X2 , Plus5_X3 , Plus5_X4 , Plus5_X5 , Plus5_X6 , Plus5_X7 , Plus5_X8 , Plus5_X9 , Plus5_X10 , Plus5_X11 , Plus5_X12 , Plus5_X13 , Plus5_X14 , Plus5_X15 , Plus5_X16 , Plus5_X17 , Plus5_X18 , Plus5_X19]
        ](
            context.append(implicitly[Application5[F, T, zsg.NodeTuple2[zsg.NodeTuple2[zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[Plus1_X1 , Plus1_X2] , zsg.ZsgTuple2[Plus1_X3 , Plus1_X4]] , zsg.NodeTuple2[zsg.ZsgTuple2[Plus1_X5 , Plus1_X6] , zsg.ZsgTuple2[Plus1_X7 , Plus1_X8]]] , zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[Plus1_X9 , Plus1_X10] , zsg.ZsgTuple2[Plus1_X11 , Plus1_X12]] , zsg.NodeTuple2[zsg.ZsgTuple2[Plus1_X13 , Plus1_X14] , zsg.ZsgTuple2[Plus1_X15 , Plus1_X16]]]] , zsg.NodeTuple1[zsg.NodeTuple1[zsg.NodeTuple2[zsg.ZsgTuple2[Plus1_X17 , Plus1_X18] , zsg.ZsgTuple1[Plus1_X19]]]]] , zsg.NodeTuple2[zsg.NodeTuple2[zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[Plus2_X1 , Plus2_X2] , zsg.ZsgTuple2[Plus2_X3 , Plus2_X4]] , zsg.NodeTuple2[zsg.ZsgTuple2[Plus2_X5 , Plus2_X6] , zsg.ZsgTuple2[Plus2_X7 , Plus2_X8]]] , zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[Plus2_X9 , Plus2_X10] , zsg.ZsgTuple2[Plus2_X11 , Plus2_X12]] , zsg.NodeTuple2[zsg.ZsgTuple2[Plus2_X13 , Plus2_X14] , zsg.ZsgTuple2[Plus2_X15 , Plus2_X16]]]] , zsg.NodeTuple1[zsg.NodeTuple1[zsg.NodeTuple2[zsg.ZsgTuple2[Plus2_X17 , Plus2_X18] , zsg.ZsgTuple1[Plus2_X19]]]]] , zsg.NodeTuple2[zsg.NodeTuple2[zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[Plus3_X1 , Plus3_X2] , zsg.ZsgTuple2[Plus3_X3 , Plus3_X4]] , zsg.NodeTuple2[zsg.ZsgTuple2[Plus3_X5 , Plus3_X6] , zsg.ZsgTuple2[Plus3_X7 , Plus3_X8]]] , zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[Plus3_X9 , Plus3_X10] , zsg.ZsgTuple2[Plus3_X11 , Plus3_X12]] , zsg.NodeTuple2[zsg.ZsgTuple2[Plus3_X13 , Plus3_X14] , zsg.ZsgTuple2[Plus3_X15 , Plus3_X16]]]] , zsg.NodeTuple1[zsg.NodeTuple1[zsg.NodeTuple2[zsg.ZsgTuple2[Plus3_X17 , Plus3_X18] , zsg.ZsgTuple1[Plus3_X19]]]]] , zsg.NodeTuple2[zsg.NodeTuple2[zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[Plus4_X1 , Plus4_X2] , zsg.ZsgTuple2[Plus4_X3 , Plus4_X4]] , zsg.NodeTuple2[zsg.ZsgTuple2[Plus4_X5 , Plus4_X6] , zsg.ZsgTuple2[Plus4_X7 , Plus4_X8]]] , zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[Plus4_X9 , Plus4_X10] , zsg.ZsgTuple2[Plus4_X11 , Plus4_X12]] , zsg.NodeTuple2[zsg.ZsgTuple2[Plus4_X13 , Plus4_X14] , zsg.ZsgTuple2[Plus4_X15 , Plus4_X16]]]] , zsg.NodeTuple1[zsg.NodeTuple1[zsg.NodeTuple2[zsg.ZsgTuple2[Plus4_X17 , Plus4_X18] , zsg.ZsgTuple1[Plus4_X19]]]]] , zsg.NodeTuple2[zsg.NodeTuple2[zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[Plus5_X1 , Plus5_X2] , zsg.ZsgTuple2[Plus5_X3 , Plus5_X4]] , zsg.NodeTuple2[zsg.ZsgTuple2[Plus5_X5 , Plus5_X6] , zsg.ZsgTuple2[Plus5_X7 , Plus5_X8]]] , zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[Plus5_X9 , Plus5_X10] , zsg.ZsgTuple2[Plus5_X11 , Plus5_X12]] , zsg.NodeTuple2[zsg.ZsgTuple2[Plus5_X13 , Plus5_X14] , zsg.ZsgTuple2[Plus5_X15 , Plus5_X16]]]] , zsg.NodeTuple1[zsg.NodeTuple1[zsg.NodeTuple2[zsg.ZsgTuple2[Plus5_X17 , Plus5_X18] , zsg.ZsgTuple1[Plus5_X19]]]]]]].application, context.start)(PlusToTuple5.plus5WithTypeParameter19)
        )
}
object ScalaTupleImplicits_19_5 extends ScalaTupleImplicits_19_5
