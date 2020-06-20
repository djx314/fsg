package zsg.scala_tuple.tuple_support
import zsg.Plus2
import zsg.ZsgTuple0
import zsg.ZsgTuple1
import zsg.ZsgTuple2
import zsg.NodeTuple1
import zsg.NodeTuple2
import zsg.BuildContent
trait PlusToTuple_5_2 {
        final def plus2WithTypeParameter5[
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5,
            Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5
        ]: Plus2[
            NodeTuple2[NodeTuple2[ZsgTuple2[Plus1_X1 , Plus1_X2] , ZsgTuple2[Plus1_X3 , Plus1_X4]] , NodeTuple1[ZsgTuple1[Plus1_X5]]],
            NodeTuple2[NodeTuple2[ZsgTuple2[Plus2_X1 , Plus2_X2] , ZsgTuple2[Plus2_X3 , Plus2_X4]] , NodeTuple1[ZsgTuple1[Plus2_X5]]],
            ZsgTuple0 , ZsgTuple0,
            Tuple5[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5],
            Tuple5[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5]
        ] = new Plus2[
            NodeTuple2[NodeTuple2[ZsgTuple2[Plus1_X1 , Plus1_X2] , ZsgTuple2[Plus1_X3 , Plus1_X4]] , NodeTuple1[ZsgTuple1[Plus1_X5]]],
            NodeTuple2[NodeTuple2[ZsgTuple2[Plus2_X1 , Plus2_X2] , ZsgTuple2[Plus2_X3 , Plus2_X4]] , NodeTuple1[ZsgTuple1[Plus2_X5]]],
            ZsgTuple0 , ZsgTuple0,
            Tuple5[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5],
            Tuple5[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5]
        ] {
                final override def takeHead1(z: Tuple5[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5]): NodeTuple2[NodeTuple2[ZsgTuple2[Plus1_X1 , Plus1_X2] , ZsgTuple2[Plus1_X3 , Plus1_X4]] , NodeTuple1[ZsgTuple1[Plus1_X5]]] =
                    BuildContent.nodeTuple2(BuildContent.nodeTuple2(BuildContent.tuple2(z._1 , z._2) , BuildContent.tuple2(z._3 , z._4)) , BuildContent.nodeTuple1(BuildContent.tuple1(z._5)))
                final override def takeTail1(z: Tuple5[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5]): ZsgTuple0 = ZsgTuple0.value
                final override def plus1(x: NodeTuple2[NodeTuple2[ZsgTuple2[Plus1_X1 , Plus1_X2] , ZsgTuple2[Plus1_X3 , Plus1_X4]] , NodeTuple1[ZsgTuple1[Plus1_X5]]], y: ZsgTuple0): Tuple5[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5] =
                    Tuple5(x.i1.i1.i1 , x.i1.i1.i2 , x.i1.i2.i1 , x.i1.i2.i2 , x.i2.i1.i1)
                final override def takeHead2(z: Tuple5[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5]): NodeTuple2[NodeTuple2[ZsgTuple2[Plus2_X1 , Plus2_X2] , ZsgTuple2[Plus2_X3 , Plus2_X4]] , NodeTuple1[ZsgTuple1[Plus2_X5]]] =
                    BuildContent.nodeTuple2(BuildContent.nodeTuple2(BuildContent.tuple2(z._1 , z._2) , BuildContent.tuple2(z._3 , z._4)) , BuildContent.nodeTuple1(BuildContent.tuple1(z._5)))
                final override def takeTail2(z: Tuple5[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5]): ZsgTuple0 = ZsgTuple0.value
                final override def plus2(x: NodeTuple2[NodeTuple2[ZsgTuple2[Plus2_X1 , Plus2_X2] , ZsgTuple2[Plus2_X3 , Plus2_X4]] , NodeTuple1[ZsgTuple1[Plus2_X5]]], y: ZsgTuple0): Tuple5[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5] =
                    Tuple5(x.i1.i1.i1 , x.i1.i1.i2 , x.i1.i2.i1 , x.i1.i2.i2 , x.i2.i1.i1)
        }
}