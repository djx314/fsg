package asuna
import asuna.support.TypeHListPlus1
import asuna.support.TypeHListPlus2
import asuna.support.TypeHListPlus3
import asuna.support.TypeHListPlus4
import asuna.support.TypeHListPlus5
import asuna.support.TypeHListPlus6
import impl._
final class TupleTag6[T1, M1 <: Message, T2, M2 <: Message, T3, M3 <: Message, T4, M4 <: Message, T5, M5 <: Message, T6, M6 <: Message] extends TupleTag {
  override final type M[M <: Message] = TupleTag6[T1, M :-<>-: M1, T2, M :-<>-: M2, T3, M :-<>-: M3, T4, M :-<>-: M4, T5, M :-<>-: M5, T6, M :-<>-: M6]
  def debug[K <: KindContext, I1 <: TypeHList, I2 <: TypeHList, I3 <: TypeHList, I4 <: TypeHList, I5 <: TypeHList, I6 <: TypeHList](c: Context[K])(
    implicit
    dapp1: DebugItemApplication[K, T1, I1, M1],
    dapp2: DebugItemApplication[K, T2, I2, M2],
    dapp3: DebugItemApplication[K, T3, I3, M3],
    dapp4: DebugItemApplication[K, T4, I4, M4],
    dapp5: DebugItemApplication[K, T5, I5, M5],
    dapp6: DebugItemApplication[K, T6, I6, M6]
  ): Application[K, TupleTag6[T1, M1, T2, M2, T3, M3, T4, M4, T5, M5, T6, M6], TupleTypeHList6[I1, I2, I3, I4, I5, I6]] =
    TupleTag6.tupleTagApplicationImplicit6(dapp1, dapp2, dapp3, dapp4, dapp5, dapp6)
}
final object TupleTag6 {
  final implicit def tupleTagApplicationImplicit6[
    K <: KindContext,
    H1,
    H2,
    H3,
    H4,
    H5,
    H6,
    T1 <: TypeHList,
    T2 <: TypeHList,
    T3 <: TypeHList,
    T4 <: TypeHList,
    T5 <: TypeHList,
    T6 <: TypeHList,
    M1 <: Message,
    M2 <: Message,
    M3 <: Message,
    M4 <: Message,
    M5 <: Message,
    M6 <: Message
  ](
    implicit t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4],
    t5: Application[K, H5, T5],
    t6: Application[K, H6, T6]
  ): Application[K, TupleTag6[H1, M1, H2, M2, H3, M3, H4, M4, H5, M5, H6, M6], TupleTypeHList6[T1, T2, T3, T4, T5, T6]] = { context =>
    context.append[TupleTypeHList5[T2, T3, T4, T5, T6], T1, TupleTypeHList6[T1, T2, T3, T4, T5, T6]](
      context.append[TupleTypeHList4[T3, T4, T5, T6], T2, TupleTypeHList5[T2, T3, T4, T5, T6]](
        context.append[TupleTypeHList3[T4, T5, T6], T3, TupleTypeHList4[T3, T4, T5, T6]](
          context.append[TupleTypeHList2[T5, T6], T4, TupleTypeHList3[T4, T5, T6]](
            context.append[TupleTypeHList1[T6], T5, TupleTypeHList2[T5, T6]](
              context.append[TupleTypeHList0, T6, TupleTypeHList1[T6]](context.start, t6.application(context), TypeHListPlus1.plus1),
              t5.application(context),
              TypeHListPlus2.plus2
            ),
            t4.application(context),
            TypeHListPlus3.plus3
          ),
          t3.application(context),
          TypeHListPlus4.plus4
        ),
        t2.application(context),
        TypeHListPlus5.plus5
      ),
      t1.application(context),
      TypeHListPlus6.plus6
    )
  }
}