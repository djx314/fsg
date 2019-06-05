package org.scalax.asuna.mapper.item
class NodeTag3[T1 <: org.scalax.asuna.mapper.item.ItemTag, T2 <: org.scalax.asuna.mapper.item.ItemTag, T3 <: org.scalax.asuna.mapper.item.ItemTag]
    extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem   = org.scalax.asuna.mapper.item.NotUseItem
  override type HeadItem  = T1
  override type TailItem  = NodeTag2[T2, T3]
  override type Sub       = NodeTag3[T1#Sub, T2#Sub, T3#Sub]
  override type NoMessage = NodeTag3[T1#NoMessage, T2#NoMessage, T3#NoMessage]
  override type Pull[I <: org.scalax.asuna.mapper.item.ItemTag] = NodeTag3[
    HeadItem#Sub#Pull[I#HeadItem#Sub],
    TailItem#HeadItem#Sub#Pull[I#TailItem#HeadItem#Sub],
    TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#HeadItem#Sub]
  ]
  override type InputMessage[I <: org.scalax.asuna.mapper.item.MessageContent] = ({
    type Type1 = T1#InputMessage[I];
    type Type2 = T2#InputMessage[Type1#Left];
    type Type3 = T3#InputMessage[Type2#Left];
    type II    = org.scalax.asuna.mapper.item.MessageResultImpl[NodeTag3[Type1#Result, Type2#Result, Type3#Result], Type3#Left]
  })#II
  override type XyyItemType = XyyItem3[T1#XyyItemType, T2#XyyItemType, T3#XyyItemType]
  def find1: T1 = throw new Exception("debugging...")
  def find2: T2 = throw new Exception("debugging...")
  def find3: T3 = throw new Exception("debugging...")
  def debug[
    K <: org.scalax.asuna.mapper.KindContext,
    I1 <: org.scalax.asuna.mapper.TypeParam,
    I2 <: org.scalax.asuna.mapper.TypeParam,
    I3 <: org.scalax.asuna.mapper.TypeParam
  ](c: org.scalax.asuna.mapper.Context[K])(
    implicit
    dapp1: org.scalax.asuna.mapper.DebugApplication[K, T1, I1, `Please change .debug(context) to .find1.debug(context).`],
    dapp2: org.scalax.asuna.mapper.DebugApplication[K, T2, I2, `Please change .debug(context) to .find2.debug(context).`],
    dapp3: org.scalax.asuna.mapper.DebugApplication[K, T3, I3, `Please change .debug(context) to .find3.debug(context).`]
  ): org.scalax.asuna.mapper.Application[K, org.scalax.asuna.mapper.item.NodeTag3[T1, T2, T3], EatXyyType3[I1, I2, I3]] =
    NodeTag3.appendNodeTagEatXyy3(dapp1, dapp2, dapp3)
}
object NodeTag3 {
  implicit def appendNodeTagEatXyy3[
    K <: org.scalax.asuna.mapper.KindContext,
    H1 <: org.scalax.asuna.mapper.item.ItemTag,
    H2 <: org.scalax.asuna.mapper.item.ItemTag,
    H3 <: org.scalax.asuna.mapper.item.ItemTag,
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam
  ](
    implicit t1: org.scalax.asuna.mapper.Application[K, H1, T1],
    t2: org.scalax.asuna.mapper.Application[K, H2, T2],
    t3: org.scalax.asuna.mapper.Application[K, H3, T3]
  ): org.scalax.asuna.mapper.Application[K, org.scalax.asuna.mapper.item.NodeTag3[H1, H2, H3], EatXyyType3[T1, T2, T3]] =
    new org.scalax.asuna.mapper.Application[K, org.scalax.asuna.mapper.item.NodeTag3[H1, H2, H3], EatXyyType3[T1, T2, T3]] {
      override def application(context: org.scalax.asuna.mapper.Context[K]): K#M[EatXyyType3[T1, T2, T3]] = {
        if (context.isReverse) {
          context.append(NodeTag2.appendNodeTagEatXyy2(t2, t3).application(context), t1.application(context), ArticleXyyPlus3.put3)
        } else {
          context.append(NodeTag2.appendNodeTagEatXyy2(t1, t2).application(context), t3.application(context), ArticleXyyPlus3.plus3)
        }
      }
    }
}
class `Please change .debug(context) to .find3.debug(context).` extends org.scalax.asuna.mapper.item.Message