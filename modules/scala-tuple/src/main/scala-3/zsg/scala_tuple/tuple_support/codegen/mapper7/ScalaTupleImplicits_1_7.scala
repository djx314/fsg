package zsg.scala_tuple.tuple_support
import zsg.Application7
import zsg.Context7
import scala.language.higherKinds
trait ScalaTupleImplicits_1_7 {
         given  [
            F[_ , _ , _ , _ , _ , _ , _],
            T <: Context7[F],
            Plus1_X1,
            Plus2_X1,
            Plus3_X1,
            Plus4_X1,
            Plus5_X1,
            Plus6_X1,
            Plus7_X1
        ]( using 
            t1: F[Plus1_X1 , Plus2_X1 , Plus3_X1 , Plus4_X1 , Plus5_X1 , Plus6_X1 , Plus7_X1],
            context: T
        )  as  Application7[
            F,
            T,
            Tuple1[Plus1_X1],
            Tuple1[Plus2_X1],
            Tuple1[Plus3_X1],
            Tuple1[Plus4_X1],
            Tuple1[Plus5_X1],
            Tuple1[Plus6_X1],
            Tuple1[Plus7_X1]
        ] = new Application7[
            F,
            T,
            Tuple1[Plus1_X1],
            Tuple1[Plus2_X1],
            Tuple1[Plus3_X1],
            Tuple1[Plus4_X1],
            Tuple1[Plus5_X1],
            Tuple1[Plus6_X1],
            Tuple1[Plus7_X1]
        ](context.append(context.start, t1)(PlusToTuple7.plus7WithTypeParameter1))
}
object ScalaTupleImplicits_1_7 extends ScalaTupleImplicits_1_7
