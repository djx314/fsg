package zsg.scala_tuple.tuple_support
import zsg.Application2
import zsg.Context2
import scala.language.higherKinds
trait ScalaTupleImplicits_9_2 {
         implicit def tupleTagApplicationImplicit_tagNum9_typeParamNum2  [
            F[_ , _],
            T <: Context2[F],
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9,
            Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9
        ]( implicit 
              t1: F[  Plus1_X1   ,  Plus2_X1 ],   t2: F[  Plus1_X2   ,  Plus2_X2 ],   t3: F[  Plus1_X3   ,  Plus2_X3 ],   t4: F[  Plus1_X4   ,  Plus2_X4 ],   t5: F[  Plus1_X5   ,  Plus2_X5 ],   t6: F[  Plus1_X6   ,  Plus2_X6 ],   t7: F[  Plus1_X7   ,  Plus2_X7 ],   t8: F[  Plus1_X8   ,  Plus2_X8 ],   t9: F[  Plus1_X9   ,  Plus2_X9 ], 
             context: T
        )  :  Application2[
            F,
            T,
            Tuple9[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9],
            Tuple9[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9]
        ] = new Application2[
            F,
            T,
            Tuple9[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9],
            Tuple9[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9]
        ](
            context.append(ApplicationFetchContent.app2[F, T, zsg.ZNode2[zsg.ZNode2[zsg.ZNode2[zsg.ZTuple2[Plus1_X1 , Plus1_X2] , zsg.ZTuple2[Plus1_X3 , Plus1_X4]] , zsg.ZNode2[zsg.ZTuple2[Plus1_X5 , Plus1_X6] , zsg.ZTuple2[Plus1_X7 , Plus1_X8]]] , zsg.ZNode1[zsg.ZNode1[zsg.ZTuple1[Plus1_X9]]]] , zsg.ZNode2[zsg.ZNode2[zsg.ZNode2[zsg.ZTuple2[Plus2_X1 , Plus2_X2] , zsg.ZTuple2[Plus2_X3 , Plus2_X4]] , zsg.ZNode2[zsg.ZTuple2[Plus2_X5 , Plus2_X6] , zsg.ZTuple2[Plus2_X7 , Plus2_X8]]] , zsg.ZNode1[zsg.ZNode1[zsg.ZTuple1[Plus2_X9]]]]], context.start)(PlusToTuple2.plus2WithTypeParameter9)
        )
}
object ScalaTupleImplicits_9_2 extends ScalaTupleImplicits_9_2
