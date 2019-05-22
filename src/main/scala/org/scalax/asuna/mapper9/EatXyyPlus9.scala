package org.scalax.asuna.ii.item
object ArticleXyyPlus9 {
  def plus9[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], T9, EatXyyType9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], T9, EatXyyType9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] {
      override def plus(p: XyyItem8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], item: T9#H): XyyItem9[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H] =
        p.eat(item)
      override def takeHead(t: XyyItem9[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H]): T9#H                                                     = t.rightHead
      override def takeTail(t: XyyItem9[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H]): XyyItem8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H] = t.rightTail
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8]#T, T9#T, EatXyyType9[T1, T2, T3, T4, T5, T6, T7, T8, T9]#T] =
        plus9[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T]
    }
  def put9[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], T9, EatXyyType9[T9, T1, T2, T3, T4, T5, T6, T7, T8]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], T9, EatXyyType9[T9, T1, T2, T3, T4, T5, T6, T7, T8]] {
      override def plus(p: XyyItem8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], item: T9#H): XyyItem9[T9#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H] =
        p.pudao(item)
      override def takeHead(t: XyyItem9[T9#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H]): T9#H                                                     = t.leftHead
      override def takeTail(t: XyyItem9[T9#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H]): XyyItem8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H] = t.leftTail
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8]#T, T9#T, EatXyyType9[T9, T1, T2, T3, T4, T5, T6, T7, T8]#T] =
        put9[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T]
    }
}
