package asuna.scala_tuple.tuple_support
import asuna.Plus1
import asuna.AsunaTuple0
import asuna.AsunaTuple1
import asuna.AsunaTuple2
import asuna.BuildContent
trait PlusToTuple_13_1 {
        final def plus1WithTypeParameter13[
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13
        ]: Plus1[
            AsunaTuple2[AsunaTuple2[AsunaTuple2[AsunaTuple2[Plus1_X1 , Plus1_X2] , AsunaTuple2[Plus1_X3 , Plus1_X4]] , AsunaTuple2[AsunaTuple2[Plus1_X5 , Plus1_X6] , AsunaTuple2[Plus1_X7 , Plus1_X8]]] , AsunaTuple2[AsunaTuple2[AsunaTuple2[Plus1_X9 , Plus1_X10] , AsunaTuple2[Plus1_X11 , Plus1_X12]] , AsunaTuple1[AsunaTuple1[Plus1_X13]]]],
            ZsgTuple0,
            Tuple13[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13]
        ] = new Plus1[
            AsunaTuple2[AsunaTuple2[AsunaTuple2[AsunaTuple2[Plus1_X1 , Plus1_X2] , AsunaTuple2[Plus1_X3 , Plus1_X4]] , AsunaTuple2[AsunaTuple2[Plus1_X5 , Plus1_X6] , AsunaTuple2[Plus1_X7 , Plus1_X8]]] , AsunaTuple2[AsunaTuple2[AsunaTuple2[Plus1_X9 , Plus1_X10] , AsunaTuple2[Plus1_X11 , Plus1_X12]] , AsunaTuple1[AsunaTuple1[Plus1_X13]]]],
            ZsgTuple0,
            Tuple13[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13]
        ] {
                final override def takeHead1(z: Tuple13[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13]): AsunaTuple2[AsunaTuple2[AsunaTuple2[AsunaTuple2[Plus1_X1 , Plus1_X2] , AsunaTuple2[Plus1_X3 , Plus1_X4]] , AsunaTuple2[AsunaTuple2[Plus1_X5 , Plus1_X6] , AsunaTuple2[Plus1_X7 , Plus1_X8]]] , AsunaTuple2[AsunaTuple2[AsunaTuple2[Plus1_X9 , Plus1_X10] , AsunaTuple2[Plus1_X11 , Plus1_X12]] , AsunaTuple1[AsunaTuple1[Plus1_X13]]]] =
                    BuildContent.tuple2(BuildContent.tuple2(BuildContent.tuple2(BuildContent.tuple2(z._1 , z._2) , BuildContent.tuple2(z._3 , z._4)) , BuildContent.tuple2(BuildContent.tuple2(z._5 , z._6) , BuildContent.tuple2(z._7 , z._8))) , BuildContent.tuple2(BuildContent.tuple2(BuildContent.tuple2(z._9 , z._10) , BuildContent.tuple2(z._11 , z._12)) , BuildContent.tuple1(BuildContent.tuple1(z._13))))
                final override def takeTail1(z: Tuple13[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13]): AsunaTuple0 = AsunaTuple0.value
                final override def plus1(x: AsunaTuple2[AsunaTuple2[AsunaTuple2[AsunaTuple2[Plus1_X1 , Plus1_X2] , AsunaTuple2[Plus1_X3 , Plus1_X4]] , AsunaTuple2[AsunaTuple2[Plus1_X5 , Plus1_X6] , AsunaTuple2[Plus1_X7 , Plus1_X8]]] , AsunaTuple2[AsunaTuple2[AsunaTuple2[Plus1_X9 , Plus1_X10] , AsunaTuple2[Plus1_X11 , Plus1_X12]] , AsunaTuple1[AsunaTuple1[Plus1_X13]]]], y: AsunaTuple0): Tuple13[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13] =
                    Tuple13(x.i1.i1.i1.i1 , x.i1.i1.i1.i2 , x.i1.i1.i2.i1 , x.i1.i1.i2.i2 , x.i1.i2.i1.i1 , x.i1.i2.i1.i2 , x.i1.i2.i2.i1 , x.i1.i2.i2.i2 , x.i2.i1.i1.i1 , x.i2.i1.i1.i2 , x.i2.i1.i2.i1 , x.i2.i1.i2.i2 , x.i2.i2.i1.i1)
        }
}
