package org.scalax.asuna.ii.item
object ArticleXyyPlus {
  def miaomiaomiao1[T0 <: EatXyyType0, T1 <: org.scalax.asuna.mapper.item.TypeParam]: org.scalax.asuna.mapper.item.Plus[T0, T1, EatXyyType1[T1]] =
    new org.scalax.asuna.mapper.item.Plus[T0, T1, EatXyyType1[T1]] {
      override def plus(p: T0#H, item: T1#H): XyyItem1[T1#H]                             = ArticleXyy0.eat(item)
      override def takeHead(t: XyyItem1[T1#H]): T1#H                                     = t.i1
      override def takeTail(t: XyyItem1[T1#H]): T0#H                                     = ArticleXyy0
      override def sub: org.scalax.asuna.mapper.item.Plus[T0#T, T1#T, EatXyyType1[T1#T]] = miaomiaomiao1[T0#T, T1#T]
    }
  def miaomiaomiao2[T0 <: EatXyyType0, T1 <: org.scalax.asuna.mapper.item.TypeParam]: org.scalax.asuna.mapper.item.Plus[T0, T1, EatXyyType1[T1]] =
    new org.scalax.asuna.mapper.item.Plus[T0, T1, EatXyyType1[T1]] {
      override def plus(p: T0#H, item: T1#H): XyyItem1[T1#H]                             = ArticleXyyReverse0.pudao(item)
      override def takeHead(t: XyyItem1[T1#H]): T1#H                                     = t.i1
      override def takeTail(t: XyyItem1[T1#H]): T0#H                                     = ArticleXyyReverse0
      override def sub: org.scalax.asuna.mapper.item.Plus[T0#T, T1#T, EatXyyType1[T1#T]] = miaomiaomiao2[T0#T, T1#T]
    }
  def miaomiaomiao3[T0 <: EatXyyType0, T1 <: org.scalax.asuna.mapper.item.TypeParam]: org.scalax.asuna.mapper.item.Plus[T0, T1, EatXyyType1[T1]] =
    new org.scalax.asuna.mapper.item.Plus[T0, T1, EatXyyType1[T1]] {
      override def plus(p: T0#H, item: T1#H): XyyItem1[T1#H]                             = Item2Xyy0.eat(item)
      override def takeHead(t: XyyItem1[T1#H]): T1#H                                     = t.i1
      override def takeTail(t: XyyItem1[T1#H]): T0#H                                     = Item2Xyy0
      override def sub: org.scalax.asuna.mapper.item.Plus[T0#T, T1#T, EatXyyType1[T1#T]] = miaomiaomiao3[T0#T, T1#T]
    }
  def miaomiaomiao4[T0 <: EatXyyType0, T1 <: org.scalax.asuna.mapper.item.TypeParam]: org.scalax.asuna.mapper.item.Plus[T0, T1, EatXyyType1[T1]] =
    new org.scalax.asuna.mapper.item.Plus[T0, T1, EatXyyType1[T1]] {
      override def plus(p: T0#H, item: T1#H): XyyItem1[T1#H]                             = Item2XyyReverse0.pudao(item)
      override def takeHead(t: XyyItem1[T1#H]): T1#H                                     = t.i1
      override def takeTail(t: XyyItem1[T1#H]): T0#H                                     = Item2XyyReverse0
      override def sub: org.scalax.asuna.mapper.item.Plus[T0#T, T1#T, EatXyyType1[T1#T]] = miaomiaomiao4[T0#T, T1#T]
    }
  def hlistPlus1[T1 <: org.scalax.asuna.mapper.item.TypeParam] = miaomiaomiao1[EatXyyType0, T1]
  def hlistPut1[T1 <: org.scalax.asuna.mapper.item.TypeParam]  = miaomiaomiao2[EatXyyType0, T1]
  def item2Plus1[T1 <: org.scalax.asuna.mapper.item.TypeParam] = miaomiaomiao3[EatXyyType0, T1]
  def item2Put1[T1 <: org.scalax.asuna.mapper.item.TypeParam]  = miaomiaomiao4[EatXyyType0, T1]

}
