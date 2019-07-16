package org.scalax.asuna.mapper.item
import shapeless._
class ReverseHListItem16[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16](
  val head: E1 :: E2 :: E3 :: E4 :: E5 :: E6 :: E7 :: E8 :: E9 :: E10 :: E11 :: E12 :: E13 :: E14 :: E15 :: E16 :: HNil
) extends AnyVal
    with Item16[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16] {
  override def pudao[T](xyy: T): ReverseHListItem17[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16] =
    new ReverseHListItem17[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16](xyy :: head)
  override def leftHead: E1                                                                                    = head.head
  override def leftTail: ReverseHListItem15[E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16] = new ReverseHListItem15(head.tail)
  override def i1: E1                                                                                          = head.head
  override def i2: E2                                                                                          = head.tail.head
  override def i3: E3                                                                                          = head.tail.tail.head
  override def i4: E4                                                                                          = head.tail.tail.tail.head
  override def i5: E5                                                                                          = head.tail.tail.tail.tail.head
  override def i6: E6                                                                                          = head.tail.tail.tail.tail.tail.head
  override def i7: E7                                                                                          = head.tail.tail.tail.tail.tail.tail.head
  override def i8: E8                                                                                          = head.tail.tail.tail.tail.tail.tail.tail.head
  override def i9: E9                                                                                          = head.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i10: E10                                                                                        = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i11: E11                                                                                        = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i12: E12                                                                                        = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i13: E13                                                                                        = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i14: E14                                                                                        = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i15: E15                                                                                        = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i16: E16                                                                                        = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
}