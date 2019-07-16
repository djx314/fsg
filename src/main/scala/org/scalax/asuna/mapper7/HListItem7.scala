package org.scalax.asuna.mapper.item
import shapeless._
class HListItem7[E1, E2, E3, E4, E5, E6, E7](val head: E7 :: E6 :: E5 :: E4 :: E3 :: E2 :: E1 :: HNil) extends AnyVal with Item7[E1, E2, E3, E4, E5, E6, E7] {
  override def eat[T](xyy: T): HListItem8[E1, E2, E3, E4, E5, E6, E7, T] = new HListItem8[E1, E2, E3, E4, E5, E6, E7, T](xyy :: head)
  override def rightHead: E7                                             = head.head
  override def rightTail: HListItem6[E1, E2, E3, E4, E5, E6]             = new HListItem6(head.tail)
  override def i1: E1                                                    = head.tail.tail.tail.tail.tail.tail.head
  override def i2: E2                                                    = head.tail.tail.tail.tail.tail.head
  override def i3: E3                                                    = head.tail.tail.tail.tail.head
  override def i4: E4                                                    = head.tail.tail.tail.head
  override def i5: E5                                                    = head.tail.tail.head
  override def i6: E6                                                    = head.tail.head
  override def i7: E7                                                    = head.head
}