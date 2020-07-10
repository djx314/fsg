package zsg.scala_tuple.tuple_support
import zsg.Application2
import zsg.Context2
import scala.language.higherKinds
trait ScalaTupleImplicits_11_2 {
         inline given  [
            F[_ , _],
            T <: Context2[F],
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11,
            Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11
        ]( using 
              inline  t1: F[  Plus1_X1   ,  Plus2_X1 ],   inline  t2: F[  Plus1_X2   ,  Plus2_X2 ],   inline  t3: F[  Plus1_X3   ,  Plus2_X3 ],   inline  t4: F[  Plus1_X4   ,  Plus2_X4 ],   inline  t5: F[  Plus1_X5   ,  Plus2_X5 ],   inline  t6: F[  Plus1_X6   ,  Plus2_X6 ],   inline  t7: F[  Plus1_X7   ,  Plus2_X7 ],   inline  t8: F[  Plus1_X8   ,  Plus2_X8 ],   inline  t9: F[  Plus1_X9   ,  Plus2_X9 ],   inline  t10: F[  Plus1_X10   ,  Plus2_X10 ],   inline  t11: F[  Plus1_X11   ,  Plus2_X11 ], 
             inline  context: T
        )  as  Application2[
            F,
            T,
            Tuple11[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11],
            Tuple11[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11]
        ] = new Application2[
            F,
            T,
            Tuple11[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11],
            Tuple11[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11]
        ](
            context.append(ApplicationFetchContent.app2[F, T, zsg.ZNode2[zsg.ZNode2[zsg.ZNode2[zsg.ZTuple2[Plus1_X1 , Plus1_X2] , zsg.ZTuple2[Plus1_X3 , Plus1_X4]] , zsg.ZNode2[zsg.ZTuple2[Plus1_X5 , Plus1_X6] , zsg.ZTuple2[Plus1_X7 , Plus1_X8]]] , zsg.ZNode1[zsg.ZNode2[zsg.ZTuple2[Plus1_X9 , Plus1_X10] , zsg.ZTuple1[Plus1_X11]]]] , zsg.ZNode2[zsg.ZNode2[zsg.ZNode2[zsg.ZTuple2[Plus2_X1 , Plus2_X2] , zsg.ZTuple2[Plus2_X3 , Plus2_X4]] , zsg.ZNode2[zsg.ZTuple2[Plus2_X5 , Plus2_X6] , zsg.ZTuple2[Plus2_X7 , Plus2_X8]]] , zsg.ZNode1[zsg.ZNode2[zsg.ZTuple2[Plus2_X9 , Plus2_X10] , zsg.ZTuple1[Plus2_X11]]]]], context.start)(PlusToTuple2.plus2WithTypeParameter11)
        )
}
object ScalaTupleImplicits_11_2 extends ScalaTupleImplicits_11_2
