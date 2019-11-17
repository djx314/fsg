package asuna.scala_tuple.tuple_support
import asuna.Plus3
import asuna.support.heterogeneous._
trait PlusToTuple_7_3 {
  final def plusWithTypeParameter7[
    X1_C1,
    X1_C2,
    X1_C3,
    X1_C4,
    X1_C5,
    X1_C6,
    X1_C7,
    X2_C1,
    X2_C2,
    X2_C3,
    X2_C4,
    X2_C5,
    X2_C6,
    X2_C7,
    X3_C1,
    X3_C2,
    X3_C3,
    X3_C4,
    X3_C5,
    X3_C6,
    X3_C7,
    Y1,
    Y2,
    Y3
  ]: Plus3[
    X1_C1 :: X1_C2 :: X1_C3 :: X1_C4 :: X1_C5 :: X1_C6 :: X1_C7 :: HNil,
    X2_C1 :: X2_C2 :: X2_C3 :: X2_C4 :: X2_C5 :: X2_C6 :: X2_C7 :: HNil,
    X3_C1 :: X3_C2 :: X3_C3 :: X3_C4 :: X3_C5 :: X3_C6 :: X3_C7 :: HNil,
    Y1,
    Y2,
    Y3,
    (Y1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7),
    (Y2, X2_C1, X2_C2, X2_C3, X2_C4, X2_C5, X2_C6, X2_C7),
    (Y3, X3_C1, X3_C2, X3_C3, X3_C4, X3_C5, X3_C6, X3_C7)
  ] =
    new Plus3[
      X1_C1 :: X1_C2 :: X1_C3 :: X1_C4 :: X1_C5 :: X1_C6 :: X1_C7 :: HNil,
      X2_C1 :: X2_C2 :: X2_C3 :: X2_C4 :: X2_C5 :: X2_C6 :: X2_C7 :: HNil,
      X3_C1 :: X3_C2 :: X3_C3 :: X3_C4 :: X3_C5 :: X3_C6 :: X3_C7 :: HNil,
      Y1,
      Y2,
      Y3,
      (Y1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7),
      (Y2, X2_C1, X2_C2, X2_C3, X2_C4, X2_C5, X2_C6, X2_C7),
      (Y3, X3_C1, X3_C2, X3_C3, X3_C4, X3_C5, X3_C6, X3_C7)
    ] {
      final override def takeHead1(z: (Y1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7)): X1_C1 :: X1_C2 :: X1_C3 :: X1_C4 :: X1_C5 :: X1_C6 :: X1_C7 :: HNil =
        z._2 :: z._3 :: z._4 :: z._5 :: z._6 :: z._7 :: z._8 :: HNil.value
      final override def takeTail1(z: (Y1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7)): Y1 = z._1
      final override def plus1(x: X1_C1 :: X1_C2 :: X1_C3 :: X1_C4 :: X1_C5 :: X1_C6 :: X1_C7 :: HNil, y: Y1): (Y1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7) =
        (
          y,
          x.head,
          x.tail.head,
          x.tail.tail.head,
          x.tail.tail.tail.head,
          x.tail.tail.tail.tail.head,
          x.tail.tail.tail.tail.tail.head,
          x.tail.tail.tail.tail.tail.tail.head
        )
      final override def takeHead2(z: (Y2, X2_C1, X2_C2, X2_C3, X2_C4, X2_C5, X2_C6, X2_C7)): X2_C1 :: X2_C2 :: X2_C3 :: X2_C4 :: X2_C5 :: X2_C6 :: X2_C7 :: HNil =
        z._2 :: z._3 :: z._4 :: z._5 :: z._6 :: z._7 :: z._8 :: HNil.value
      final override def takeTail2(z: (Y2, X2_C1, X2_C2, X2_C3, X2_C4, X2_C5, X2_C6, X2_C7)): Y2 = z._1
      final override def plus2(x: X2_C1 :: X2_C2 :: X2_C3 :: X2_C4 :: X2_C5 :: X2_C6 :: X2_C7 :: HNil, y: Y2): (Y2, X2_C1, X2_C2, X2_C3, X2_C4, X2_C5, X2_C6, X2_C7) =
        (
          y,
          x.head,
          x.tail.head,
          x.tail.tail.head,
          x.tail.tail.tail.head,
          x.tail.tail.tail.tail.head,
          x.tail.tail.tail.tail.tail.head,
          x.tail.tail.tail.tail.tail.tail.head
        )
      final override def takeHead3(z: (Y3, X3_C1, X3_C2, X3_C3, X3_C4, X3_C5, X3_C6, X3_C7)): X3_C1 :: X3_C2 :: X3_C3 :: X3_C4 :: X3_C5 :: X3_C6 :: X3_C7 :: HNil =
        z._2 :: z._3 :: z._4 :: z._5 :: z._6 :: z._7 :: z._8 :: HNil.value
      final override def takeTail3(z: (Y3, X3_C1, X3_C2, X3_C3, X3_C4, X3_C5, X3_C6, X3_C7)): Y3 = z._1
      final override def plus3(x: X3_C1 :: X3_C2 :: X3_C3 :: X3_C4 :: X3_C5 :: X3_C6 :: X3_C7 :: HNil, y: Y3): (Y3, X3_C1, X3_C2, X3_C3, X3_C4, X3_C5, X3_C6, X3_C7) =
        (
          y,
          x.head,
          x.tail.head,
          x.tail.tail.head,
          x.tail.tail.tail.head,
          x.tail.tail.tail.tail.head,
          x.tail.tail.tail.tail.tail.head,
          x.tail.tail.tail.tail.tail.tail.head
        )
    }
}