package asuna.scala_tuple.tuple_support
import asuna.Plus1
import asuna.AsunaTuple0
import asuna.AsunaTuple1
import asuna.AsunaTuple2
import asuna.BuildContent
trait PlusToTuple_2_1 {
        final def plus1WithTypeParameter2[
            Plus1_X1 , Plus1_X2
        ]: Plus1[
            AsunaTuple2[Plus1_X1 , Plus1_X2],
            AsunaTuple0,
            Tuple2[Plus1_X1 , Plus1_X2]
        ] = new Plus1[
            AsunaTuple2[Plus1_X1 , Plus1_X2],
            AsunaTuple0,
            Tuple2[Plus1_X1 , Plus1_X2]
        ] {
                final override def takeHead1(z: Tuple2[Plus1_X1 , Plus1_X2]): AsunaTuple2[Plus1_X1 , Plus1_X2] =
                    BuildContent.tuple2(z._1 , z._2)
                final override def takeTail1(z: Tuple2[Plus1_X1 , Plus1_X2]): AsunaTuple0 = AsunaTuple0.value
                final override def plus1(x: AsunaTuple2[Plus1_X1 , Plus1_X2], y: AsunaTuple0): Tuple2[Plus1_X1 , Plus1_X2] =
                    Tuple2(x.i1 , x.i2)
        }
}
