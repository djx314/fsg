package zsg.scala_tuple.tuple_support
import zsg.Application4
import zsg.Context4
import scala.language.higherKinds
trait ScalaTupleImplicits_13_4 {
         given  tupleTagApplicationImplicit_tagNum13_typeParamNum4[
            F[_ , _ , _ , _],
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13,
            Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11 , Plus2_X12 , Plus2_X13,
            Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7 , Plus3_X8 , Plus3_X9 , Plus3_X10 , Plus3_X11 , Plus3_X12 , Plus3_X13,
            Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4 , Plus4_X5 , Plus4_X6 , Plus4_X7 , Plus4_X8 , Plus4_X9 , Plus4_X10 , Plus4_X11 , Plus4_X12 , Plus4_X13
        ]( using 
            t1: F[Plus1_X1 , Plus2_X1 , Plus3_X1 , Plus4_X1] , t2: F[Plus1_X2 , Plus2_X2 , Plus3_X2 , Plus4_X2] , t3: F[Plus1_X3 , Plus2_X3 , Plus3_X3 , Plus4_X3] , t4: F[Plus1_X4 , Plus2_X4 , Plus3_X4 , Plus4_X4] , t5: F[Plus1_X5 , Plus2_X5 , Plus3_X5 , Plus4_X5] , t6: F[Plus1_X6 , Plus2_X6 , Plus3_X6 , Plus4_X6] , t7: F[Plus1_X7 , Plus2_X7 , Plus3_X7 , Plus4_X7] , t8: F[Plus1_X8 , Plus2_X8 , Plus3_X8 , Plus4_X8] , t9: F[Plus1_X9 , Plus2_X9 , Plus3_X9 , Plus4_X9] , t10: F[Plus1_X10 , Plus2_X10 , Plus3_X10 , Plus4_X10] , t11: F[Plus1_X11 , Plus2_X11 , Plus3_X11 , Plus4_X11] , t12: F[Plus1_X12 , Plus2_X12 , Plus3_X12 , Plus4_X12] , t13: F[Plus1_X13 , Plus2_X13 , Plus3_X13 , Plus4_X13],
            context: Context4[F]
        )  as  Application4[
            F,
            Tuple13[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13],
            Tuple13[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11 , Plus2_X12 , Plus2_X13],
            Tuple13[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7 , Plus3_X8 , Plus3_X9 , Plus3_X10 , Plus3_X11 , Plus3_X12 , Plus3_X13],
            Tuple13[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4 , Plus4_X5 , Plus4_X6 , Plus4_X7 , Plus4_X8 , Plus4_X9 , Plus4_X10 , Plus4_X11 , Plus4_X12 , Plus4_X13]
        ] = new Application4[
            F,
            Tuple13[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13],
            Tuple13[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11 , Plus2_X12 , Plus2_X13],
            Tuple13[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7 , Plus3_X8 , Plus3_X9 , Plus3_X10 , Plus3_X11 , Plus3_X12 , Plus3_X13],
            Tuple13[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4 , Plus4_X5 , Plus4_X6 , Plus4_X7 , Plus4_X8 , Plus4_X9 , Plus4_X10 , Plus4_X11 , Plus4_X12 , Plus4_X13]
        ]({
            val implicitApplication = implicitly[Application4[F, zsg.NodeTuple2[zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[Plus1_X1 , Plus1_X2] , zsg.ZsgTuple2[Plus1_X3 , Plus1_X4]] , zsg.NodeTuple2[zsg.ZsgTuple2[Plus1_X5 , Plus1_X6] , zsg.ZsgTuple2[Plus1_X7 , Plus1_X8]]] , zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[Plus1_X9 , Plus1_X10] , zsg.ZsgTuple2[Plus1_X11 , Plus1_X12]] , zsg.NodeTuple1[zsg.ZsgTuple1[Plus1_X13]]]] , zsg.NodeTuple2[zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[Plus2_X1 , Plus2_X2] , zsg.ZsgTuple2[Plus2_X3 , Plus2_X4]] , zsg.NodeTuple2[zsg.ZsgTuple2[Plus2_X5 , Plus2_X6] , zsg.ZsgTuple2[Plus2_X7 , Plus2_X8]]] , zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[Plus2_X9 , Plus2_X10] , zsg.ZsgTuple2[Plus2_X11 , Plus2_X12]] , zsg.NodeTuple1[zsg.ZsgTuple1[Plus2_X13]]]] , zsg.NodeTuple2[zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[Plus3_X1 , Plus3_X2] , zsg.ZsgTuple2[Plus3_X3 , Plus3_X4]] , zsg.NodeTuple2[zsg.ZsgTuple2[Plus3_X5 , Plus3_X6] , zsg.ZsgTuple2[Plus3_X7 , Plus3_X8]]] , zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[Plus3_X9 , Plus3_X10] , zsg.ZsgTuple2[Plus3_X11 , Plus3_X12]] , zsg.NodeTuple1[zsg.ZsgTuple1[Plus3_X13]]]] , zsg.NodeTuple2[zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[Plus4_X1 , Plus4_X2] , zsg.ZsgTuple2[Plus4_X3 , Plus4_X4]] , zsg.NodeTuple2[zsg.ZsgTuple2[Plus4_X5 , Plus4_X6] , zsg.ZsgTuple2[Plus4_X7 , Plus4_X8]]] , zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[Plus4_X9 , Plus4_X10] , zsg.ZsgTuple2[Plus4_X11 , Plus4_X12]] , zsg.NodeTuple1[zsg.ZsgTuple1[Plus4_X13]]]]
            ]]
            context.append(implicitApplication.application, context.start)(PlusToTuple4.plus4WithTypeParameter13)
        })
}
object ScalaTupleImplicits_13_4 extends ScalaTupleImplicits_13_4
