package zsg.scala_tuple.tuple_support
import zsg.Application1
import zsg.Context1
import scala.language.higherKinds
trait ScalaTupleImplicits_7_1 {
         implicit def tupleTagApplicationImplicit_tagNum7_typeParamNum1  [
            F[_],
            T <: Context1[F],
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7
        ]( implicit 
              t1: F[  Plus1_X1 ],   t2: F[  Plus1_X2 ],   t3: F[  Plus1_X3 ],   t4: F[  Plus1_X4 ],   t5: F[  Plus1_X5 ],   t6: F[  Plus1_X6 ],   t7: F[  Plus1_X7 ], 
             context: T
        )  :  Application1[
            F,
            T,
            Tuple7[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7]
        ] = new Application1[
            F,
            T,
            Tuple7[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7]
        ](
            context.append(ApplicationFetchContent.app1[F, T, zsg.ZNode2[zsg.ZNode2[zsg.ZTuple2[Plus1_X1 , Plus1_X2] , zsg.ZTuple2[Plus1_X3 , Plus1_X4]] , zsg.ZNode2[zsg.ZTuple2[Plus1_X5 , Plus1_X6] , zsg.ZTuple1[Plus1_X7]]]], context.start)(PlusToTuple1.plus1WithTypeParameter7)
        )
}
object ScalaTupleImplicits_7_1 extends ScalaTupleImplicits_7_1
