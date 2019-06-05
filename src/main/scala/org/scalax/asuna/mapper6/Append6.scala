package org.scalax.asuna.mapper.item
class ItemTag6[T1, T2, T3, T4, T5, T6] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem     = T1
  override type HeadItem    = org.scalax.asuna.mapper.item.EndItemTag
  override type TailItem    = ItemTag5[T2, T3, T4, T5, T6]
  override type Sub         = org.scalax.asuna.mapper.item.EndItemTag
  override type NoMessage   = ItemTag6[T1, T2, T3, T4, T5, T6]
  override type XyyItemType = XyyItem6[T1, T2, T3, T4, T5, T6]
  override type Pull[I <: org.scalax.asuna.mapper.item.ItemTag] = ItemTag6[
    (RawItem, I#RawItem),
    (TailItem#RawItem, I#TailItem#RawItem),
    (TailItem#TailItem#RawItem, I#TailItem#TailItem#RawItem),
    (TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#RawItem),
    (TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#RawItem),
    (TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem)
  ]
  override type InputMessage[I <: org.scalax.asuna.mapper.item.MessageContent] = org.scalax.asuna.mapper.item.MessageResultImpl[ItemTagWithMessage6[
    T1,
    I#HeadItem,
    T2,
    I#TailItem#HeadItem,
    T3,
    I#TailItem#TailItem#HeadItem,
    T4,
    I#TailItem#TailItem#TailItem#HeadItem,
    T5,
    I#TailItem#TailItem#TailItem#TailItem#HeadItem,
    T6,
    I#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
  ], I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem]
  def debug[
    K <: org.scalax.asuna.mapper.KindContext,
    I1 <: org.scalax.asuna.mapper.TypeParam,
    I2 <: org.scalax.asuna.mapper.TypeParam,
    I3 <: org.scalax.asuna.mapper.TypeParam,
    I4 <: org.scalax.asuna.mapper.TypeParam,
    I5 <: org.scalax.asuna.mapper.TypeParam,
    I6 <: org.scalax.asuna.mapper.TypeParam
  ](c: org.scalax.asuna.mapper.Context[K])(
    implicit
    dapp1: org.scalax.asuna.mapper.DebugItemApplication[K, T1, I1, `Please change .debug(context) to .find1.debug(context).`],
    dapp2: org.scalax.asuna.mapper.DebugItemApplication[K, T2, I2, `Please change .debug(context) to .find2.debug(context).`],
    dapp3: org.scalax.asuna.mapper.DebugItemApplication[K, T3, I3, `Please change .debug(context) to .find3.debug(context).`],
    dapp4: org.scalax.asuna.mapper.DebugItemApplication[K, T4, I4, `Please change .debug(context) to .find4.debug(context).`],
    dapp5: org.scalax.asuna.mapper.DebugItemApplication[K, T5, I5, `Please change .debug(context) to .find5.debug(context).`],
    dapp6: org.scalax.asuna.mapper.DebugItemApplication[K, T6, I6, `Please change .debug(context) to .find6.debug(context).`]
  ): org.scalax.asuna.mapper.Application[K, org.scalax.asuna.mapper.item.ItemTag6[T1, T2, T3, T4, T5, T6], EatXyyType6[I1, I2, I3, I4, I5, I6]] =
    ItemTag6.appendEatXyy6(dapp1, dapp2, dapp3, dapp4, dapp5, dapp6)
}
object ItemTag6 {
  implicit def appendEatXyy6[
    K <: org.scalax.asuna.mapper.KindContext,
    H1,
    H2,
    H3,
    H4,
    H5,
    H6,
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    T4 <: org.scalax.asuna.mapper.TypeParam,
    T5 <: org.scalax.asuna.mapper.TypeParam,
    T6 <: org.scalax.asuna.mapper.TypeParam
  ](
    implicit t1: org.scalax.asuna.mapper.Application[K, H1, T1],
    t2: org.scalax.asuna.mapper.Application[K, H2, T2],
    t3: org.scalax.asuna.mapper.Application[K, H3, T3],
    t4: org.scalax.asuna.mapper.Application[K, H4, T4],
    t5: org.scalax.asuna.mapper.Application[K, H5, T5],
    t6: org.scalax.asuna.mapper.Application[K, H6, T6]
  ): org.scalax.asuna.mapper.Application[K, org.scalax.asuna.mapper.item.ItemTag6[H1, H2, H3, H4, H5, H6], EatXyyType6[T1, T2, T3, T4, T5, T6]] =
    new org.scalax.asuna.mapper.Application[K, org.scalax.asuna.mapper.item.ItemTag6[H1, H2, H3, H4, H5, H6], EatXyyType6[T1, T2, T3, T4, T5, T6]] {
      override def application(context: org.scalax.asuna.mapper.Context[K]): K#M[EatXyyType6[T1, T2, T3, T4, T5, T6]] = {
        if (context.isReverse) {
          context.append(ItemTag5.appendEatXyy5(t2, t3, t4, t5, t6).application(context), t1.application(context), ArticleXyyPlus6.put6)
        } else {
          context.append(ItemTag5.appendEatXyy5(t1, t2, t3, t4, t5).application(context), t6.application(context), ArticleXyyPlus6.plus6)
        }
      }
    }
}
