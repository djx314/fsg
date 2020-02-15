package asuna.support
import scala.language.higherKinds
import asuna.TupleTag
import asuna.NodeTag6
import asuna.AsunaTuple0
import asuna.AsunaTuple1
import asuna.AsunaTuple2
import asuna.AsunaTuple3
import asuna.AsunaTuple4
import asuna.AsunaTuple5
import asuna.AsunaTuple6
import asuna.Application1
import asuna.Plus1
import asuna.Context1
import asuna.Application2
import asuna.Plus2
import asuna.Context2
import asuna.Application3
import asuna.Plus3
import asuna.Context3
import asuna.Application4
import asuna.Plus4
import asuna.Context4
import asuna.Application5
import asuna.Plus5
import asuna.Context5
import asuna.Application6
import asuna.Plus6
import asuna.Context6
class NodeTag6ApplicationCompanion {
inline given noteTagApplicationImplicit_tagNum6_typeParamNum1[
F[_ ]
, H1 <: TupleTag  , H2 <: TupleTag  , H3 <: TupleTag  , H4 <: TupleTag  , H5 <: TupleTag  , H6 <: TupleTag
, X1_C1
, X2_C1
, X3_C1
, X4_C1
, X5_C1
, X6_C1
](given
t1: Application1[F, H1  , X1_C1 ]
, t2: Application1[F, H2  , X2_C1 ]  , t3: Application1[F, H3  , X3_C1 ]  , t4: Application1[F, H4  , X4_C1 ]  , t5: Application1[F, H5  , X5_C1 ]  , t6: Application1[F, H6  , X6_C1 ] )
: Application1[
F,
NodeTag6[H1  , H2  , H3  , H4  , H5  , H6 ]  , AsunaTuple6[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1 ] ] = {
val plus1_parameter0: Plus1[
AsunaTuple0
, X6_C1
, AsunaTuple1[X6_C1]
] = Plus1.cachePlusWithTypeParameter0
val plus1_parameter1: Plus1[
AsunaTuple1[X6_C1 ]
, X5_C1
, AsunaTuple2[X5_C1  , X6_C1 ]
] = Plus1.cachePlusWithTypeParameter1
val plus1_parameter2: Plus1[
AsunaTuple2[X5_C1  , X6_C1 ]
, X4_C1
, AsunaTuple3[X4_C1  , X5_C1  , X6_C1 ]
] = Plus1.cachePlusWithTypeParameter2
val plus1_parameter3: Plus1[
AsunaTuple3[X4_C1  , X5_C1  , X6_C1 ]
, X3_C1
, AsunaTuple4[X3_C1  , X4_C1  , X5_C1  , X6_C1 ]
] = Plus1.cachePlusWithTypeParameter3
val plus1_parameter4: Plus1[
AsunaTuple4[X3_C1  , X4_C1  , X5_C1  , X6_C1 ]
, X2_C1
, AsunaTuple5[X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1 ]
] = Plus1.cachePlusWithTypeParameter4
val plus1_parameter5: Plus1[
AsunaTuple5[X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1 ]
, X1_C1
, AsunaTuple6[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1 ]
] = Plus1.cachePlusWithTypeParameter5
new Application1[
F,
NodeTag6[H1  , H2  , H3  , H4  , H5  , H6 ]  , AsunaTuple6[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1 ] ]
{
override final def application(context: Context1[F]): F[AsunaTuple6[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1 ]
] = {
context.append(
context.append(
context.append(
context.append(
context.append(
context.append(context.start, t6.application(context))(plus1_parameter0)
, t5.application(context))(plus1_parameter1)
, t4.application(context))(plus1_parameter2)
, t3.application(context))(plus1_parameter3)
, t2.application(context))(plus1_parameter4)
, t1.application(context))(plus1_parameter5)
}
}
}
inline given noteTagApplicationImplicit_tagNum6_typeParamNum2[
F[_  , _ ]
, H1 <: TupleTag  , H2 <: TupleTag  , H3 <: TupleTag  , H4 <: TupleTag  , H5 <: TupleTag  , H6 <: TupleTag
, X1_C1  , X1_C2
, X2_C1  , X2_C2
, X3_C1  , X3_C2
, X4_C1  , X4_C2
, X5_C1  , X5_C2
, X6_C1  , X6_C2
](given
t1: Application2[F, H1  , X1_C1  , X1_C2 ]
, t2: Application2[F, H2  , X2_C1  , X2_C2 ]  , t3: Application2[F, H3  , X3_C1  , X3_C2 ]  , t4: Application2[F, H4  , X4_C1  , X4_C2 ]  , t5: Application2[F, H5  , X5_C1  , X5_C2 ]  , t6: Application2[F, H6  , X6_C1  , X6_C2 ] )
: Application2[
F,
NodeTag6[H1  , H2  , H3  , H4  , H5  , H6 ]  , AsunaTuple6[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1 ]  , AsunaTuple6[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2 ] ] = {
val plus2_parameter0: Plus2[
AsunaTuple0
, AsunaTuple0
, X6_C1  , X6_C2
, AsunaTuple1[X6_C1]  , AsunaTuple1[X6_C2]
] = Plus2.cachePlusWithTypeParameter0
val plus2_parameter1: Plus2[
AsunaTuple1[X6_C1 ]
, AsunaTuple1[X6_C2 ]
, X5_C1  , X5_C2
, AsunaTuple2[X5_C1  , X6_C1 ]  , AsunaTuple2[X5_C2  , X6_C2 ]
] = Plus2.cachePlusWithTypeParameter1
val plus2_parameter2: Plus2[
AsunaTuple2[X5_C1  , X6_C1 ]
, AsunaTuple2[X5_C2  , X6_C2 ]
, X4_C1  , X4_C2
, AsunaTuple3[X4_C1  , X5_C1  , X6_C1 ]  , AsunaTuple3[X4_C2  , X5_C2  , X6_C2 ]
] = Plus2.cachePlusWithTypeParameter2
val plus2_parameter3: Plus2[
AsunaTuple3[X4_C1  , X5_C1  , X6_C1 ]
, AsunaTuple3[X4_C2  , X5_C2  , X6_C2 ]
, X3_C1  , X3_C2
, AsunaTuple4[X3_C1  , X4_C1  , X5_C1  , X6_C1 ]  , AsunaTuple4[X3_C2  , X4_C2  , X5_C2  , X6_C2 ]
] = Plus2.cachePlusWithTypeParameter3
val plus2_parameter4: Plus2[
AsunaTuple4[X3_C1  , X4_C1  , X5_C1  , X6_C1 ]
, AsunaTuple4[X3_C2  , X4_C2  , X5_C2  , X6_C2 ]
, X2_C1  , X2_C2
, AsunaTuple5[X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1 ]  , AsunaTuple5[X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2 ]
] = Plus2.cachePlusWithTypeParameter4
val plus2_parameter5: Plus2[
AsunaTuple5[X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1 ]
, AsunaTuple5[X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2 ]
, X1_C1  , X1_C2
, AsunaTuple6[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1 ]  , AsunaTuple6[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2 ]
] = Plus2.cachePlusWithTypeParameter5
new Application2[
F,
NodeTag6[H1  , H2  , H3  , H4  , H5  , H6 ]  , AsunaTuple6[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1 ]  , AsunaTuple6[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2 ] ]
{
override final def application(context: Context2[F]): F[AsunaTuple6[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1 ]
, AsunaTuple6[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2 ] ] = {
context.append(
context.append(
context.append(
context.append(
context.append(
context.append(context.start, t6.application(context))(plus2_parameter0)
, t5.application(context))(plus2_parameter1)
, t4.application(context))(plus2_parameter2)
, t3.application(context))(plus2_parameter3)
, t2.application(context))(plus2_parameter4)
, t1.application(context))(plus2_parameter5)
}
}
}
inline given noteTagApplicationImplicit_tagNum6_typeParamNum3[
F[_  , _  , _ ]
, H1 <: TupleTag  , H2 <: TupleTag  , H3 <: TupleTag  , H4 <: TupleTag  , H5 <: TupleTag  , H6 <: TupleTag
, X1_C1  , X1_C2  , X1_C3
, X2_C1  , X2_C2  , X2_C3
, X3_C1  , X3_C2  , X3_C3
, X4_C1  , X4_C2  , X4_C3
, X5_C1  , X5_C2  , X5_C3
, X6_C1  , X6_C2  , X6_C3
](given
t1: Application3[F, H1  , X1_C1  , X1_C2  , X1_C3 ]
, t2: Application3[F, H2  , X2_C1  , X2_C2  , X2_C3 ]  , t3: Application3[F, H3  , X3_C1  , X3_C2  , X3_C3 ]  , t4: Application3[F, H4  , X4_C1  , X4_C2  , X4_C3 ]  , t5: Application3[F, H5  , X5_C1  , X5_C2  , X5_C3 ]  , t6: Application3[F, H6  , X6_C1  , X6_C2  , X6_C3 ] )
: Application3[
F,
NodeTag6[H1  , H2  , H3  , H4  , H5  , H6 ]  , AsunaTuple6[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1 ]  , AsunaTuple6[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2 ]  , AsunaTuple6[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3 ] ] = {
val plus3_parameter0: Plus3[
AsunaTuple0
, AsunaTuple0  , AsunaTuple0
, X6_C1  , X6_C2  , X6_C3
, AsunaTuple1[X6_C1]  , AsunaTuple1[X6_C2]  , AsunaTuple1[X6_C3]
] = Plus3.cachePlusWithTypeParameter0
val plus3_parameter1: Plus3[
AsunaTuple1[X6_C1 ]
, AsunaTuple1[X6_C2 ]  , AsunaTuple1[X6_C3 ]
, X5_C1  , X5_C2  , X5_C3
, AsunaTuple2[X5_C1  , X6_C1 ]  , AsunaTuple2[X5_C2  , X6_C2 ]  , AsunaTuple2[X5_C3  , X6_C3 ]
] = Plus3.cachePlusWithTypeParameter1
val plus3_parameter2: Plus3[
AsunaTuple2[X5_C1  , X6_C1 ]
, AsunaTuple2[X5_C2  , X6_C2 ]  , AsunaTuple2[X5_C3  , X6_C3 ]
, X4_C1  , X4_C2  , X4_C3
, AsunaTuple3[X4_C1  , X5_C1  , X6_C1 ]  , AsunaTuple3[X4_C2  , X5_C2  , X6_C2 ]  , AsunaTuple3[X4_C3  , X5_C3  , X6_C3 ]
] = Plus3.cachePlusWithTypeParameter2
val plus3_parameter3: Plus3[
AsunaTuple3[X4_C1  , X5_C1  , X6_C1 ]
, AsunaTuple3[X4_C2  , X5_C2  , X6_C2 ]  , AsunaTuple3[X4_C3  , X5_C3  , X6_C3 ]
, X3_C1  , X3_C2  , X3_C3
, AsunaTuple4[X3_C1  , X4_C1  , X5_C1  , X6_C1 ]  , AsunaTuple4[X3_C2  , X4_C2  , X5_C2  , X6_C2 ]  , AsunaTuple4[X3_C3  , X4_C3  , X5_C3  , X6_C3 ]
] = Plus3.cachePlusWithTypeParameter3
val plus3_parameter4: Plus3[
AsunaTuple4[X3_C1  , X4_C1  , X5_C1  , X6_C1 ]
, AsunaTuple4[X3_C2  , X4_C2  , X5_C2  , X6_C2 ]  , AsunaTuple4[X3_C3  , X4_C3  , X5_C3  , X6_C3 ]
, X2_C1  , X2_C2  , X2_C3
, AsunaTuple5[X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1 ]  , AsunaTuple5[X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2 ]  , AsunaTuple5[X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3 ]
] = Plus3.cachePlusWithTypeParameter4
val plus3_parameter5: Plus3[
AsunaTuple5[X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1 ]
, AsunaTuple5[X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2 ]  , AsunaTuple5[X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3 ]
, X1_C1  , X1_C2  , X1_C3
, AsunaTuple6[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1 ]  , AsunaTuple6[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2 ]  , AsunaTuple6[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3 ]
] = Plus3.cachePlusWithTypeParameter5
new Application3[
F,
NodeTag6[H1  , H2  , H3  , H4  , H5  , H6 ]  , AsunaTuple6[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1 ]  , AsunaTuple6[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2 ]  , AsunaTuple6[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3 ] ]
{
override final def application(context: Context3[F]): F[AsunaTuple6[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1 ]
, AsunaTuple6[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2 ]  , AsunaTuple6[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3 ] ] = {
context.append(
context.append(
context.append(
context.append(
context.append(
context.append(context.start, t6.application(context))(plus3_parameter0)
, t5.application(context))(plus3_parameter1)
, t4.application(context))(plus3_parameter2)
, t3.application(context))(plus3_parameter3)
, t2.application(context))(plus3_parameter4)
, t1.application(context))(plus3_parameter5)
}
}
}
inline given noteTagApplicationImplicit_tagNum6_typeParamNum4[
F[_  , _  , _  , _ ]
, H1 <: TupleTag  , H2 <: TupleTag  , H3 <: TupleTag  , H4 <: TupleTag  , H5 <: TupleTag  , H6 <: TupleTag
, X1_C1  , X1_C2  , X1_C3  , X1_C4
, X2_C1  , X2_C2  , X2_C3  , X2_C4
, X3_C1  , X3_C2  , X3_C3  , X3_C4
, X4_C1  , X4_C2  , X4_C3  , X4_C4
, X5_C1  , X5_C2  , X5_C3  , X5_C4
, X6_C1  , X6_C2  , X6_C3  , X6_C4
](given
t1: Application4[F, H1  , X1_C1  , X1_C2  , X1_C3  , X1_C4 ]
, t2: Application4[F, H2  , X2_C1  , X2_C2  , X2_C3  , X2_C4 ]  , t3: Application4[F, H3  , X3_C1  , X3_C2  , X3_C3  , X3_C4 ]  , t4: Application4[F, H4  , X4_C1  , X4_C2  , X4_C3  , X4_C4 ]  , t5: Application4[F, H5  , X5_C1  , X5_C2  , X5_C3  , X5_C4 ]  , t6: Application4[F, H6  , X6_C1  , X6_C2  , X6_C3  , X6_C4 ] )
: Application4[
F,
NodeTag6[H1  , H2  , H3  , H4  , H5  , H6 ]  , AsunaTuple6[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1 ]  , AsunaTuple6[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2 ]  , AsunaTuple6[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3 ]  , AsunaTuple6[X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4  , X6_C4 ] ] = {
val plus4_parameter0: Plus4[
AsunaTuple0
, AsunaTuple0  , AsunaTuple0  , AsunaTuple0
, X6_C1  , X6_C2  , X6_C3  , X6_C4
, AsunaTuple1[X6_C1]  , AsunaTuple1[X6_C2]  , AsunaTuple1[X6_C3]  , AsunaTuple1[X6_C4]
] = Plus4.cachePlusWithTypeParameter0
val plus4_parameter1: Plus4[
AsunaTuple1[X6_C1 ]
, AsunaTuple1[X6_C2 ]  , AsunaTuple1[X6_C3 ]  , AsunaTuple1[X6_C4 ]
, X5_C1  , X5_C2  , X5_C3  , X5_C4
, AsunaTuple2[X5_C1  , X6_C1 ]  , AsunaTuple2[X5_C2  , X6_C2 ]  , AsunaTuple2[X5_C3  , X6_C3 ]  , AsunaTuple2[X5_C4  , X6_C4 ]
] = Plus4.cachePlusWithTypeParameter1
val plus4_parameter2: Plus4[
AsunaTuple2[X5_C1  , X6_C1 ]
, AsunaTuple2[X5_C2  , X6_C2 ]  , AsunaTuple2[X5_C3  , X6_C3 ]  , AsunaTuple2[X5_C4  , X6_C4 ]
, X4_C1  , X4_C2  , X4_C3  , X4_C4
, AsunaTuple3[X4_C1  , X5_C1  , X6_C1 ]  , AsunaTuple3[X4_C2  , X5_C2  , X6_C2 ]  , AsunaTuple3[X4_C3  , X5_C3  , X6_C3 ]  , AsunaTuple3[X4_C4  , X5_C4  , X6_C4 ]
] = Plus4.cachePlusWithTypeParameter2
val plus4_parameter3: Plus4[
AsunaTuple3[X4_C1  , X5_C1  , X6_C1 ]
, AsunaTuple3[X4_C2  , X5_C2  , X6_C2 ]  , AsunaTuple3[X4_C3  , X5_C3  , X6_C3 ]  , AsunaTuple3[X4_C4  , X5_C4  , X6_C4 ]
, X3_C1  , X3_C2  , X3_C3  , X3_C4
, AsunaTuple4[X3_C1  , X4_C1  , X5_C1  , X6_C1 ]  , AsunaTuple4[X3_C2  , X4_C2  , X5_C2  , X6_C2 ]  , AsunaTuple4[X3_C3  , X4_C3  , X5_C3  , X6_C3 ]  , AsunaTuple4[X3_C4  , X4_C4  , X5_C4  , X6_C4 ]
] = Plus4.cachePlusWithTypeParameter3
val plus4_parameter4: Plus4[
AsunaTuple4[X3_C1  , X4_C1  , X5_C1  , X6_C1 ]
, AsunaTuple4[X3_C2  , X4_C2  , X5_C2  , X6_C2 ]  , AsunaTuple4[X3_C3  , X4_C3  , X5_C3  , X6_C3 ]  , AsunaTuple4[X3_C4  , X4_C4  , X5_C4  , X6_C4 ]
, X2_C1  , X2_C2  , X2_C3  , X2_C4
, AsunaTuple5[X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1 ]  , AsunaTuple5[X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2 ]  , AsunaTuple5[X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3 ]  , AsunaTuple5[X2_C4  , X3_C4  , X4_C4  , X5_C4  , X6_C4 ]
] = Plus4.cachePlusWithTypeParameter4
val plus4_parameter5: Plus4[
AsunaTuple5[X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1 ]
, AsunaTuple5[X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2 ]  , AsunaTuple5[X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3 ]  , AsunaTuple5[X2_C4  , X3_C4  , X4_C4  , X5_C4  , X6_C4 ]
, X1_C1  , X1_C2  , X1_C3  , X1_C4
, AsunaTuple6[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1 ]  , AsunaTuple6[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2 ]  , AsunaTuple6[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3 ]  , AsunaTuple6[X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4  , X6_C4 ]
] = Plus4.cachePlusWithTypeParameter5
new Application4[
F,
NodeTag6[H1  , H2  , H3  , H4  , H5  , H6 ]  , AsunaTuple6[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1 ]  , AsunaTuple6[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2 ]  , AsunaTuple6[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3 ]  , AsunaTuple6[X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4  , X6_C4 ] ]
{
override final def application(context: Context4[F]): F[AsunaTuple6[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1 ]
, AsunaTuple6[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2 ]  , AsunaTuple6[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3 ]  , AsunaTuple6[X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4  , X6_C4 ] ] = {
context.append(
context.append(
context.append(
context.append(
context.append(
context.append(context.start, t6.application(context))(plus4_parameter0)
, t5.application(context))(plus4_parameter1)
, t4.application(context))(plus4_parameter2)
, t3.application(context))(plus4_parameter3)
, t2.application(context))(plus4_parameter4)
, t1.application(context))(plus4_parameter5)
}
}
}
inline given noteTagApplicationImplicit_tagNum6_typeParamNum5[
F[_  , _  , _  , _  , _ ]
, H1 <: TupleTag  , H2 <: TupleTag  , H3 <: TupleTag  , H4 <: TupleTag  , H5 <: TupleTag  , H6 <: TupleTag
, X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5
, X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5
, X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5
, X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5
, X5_C1  , X5_C2  , X5_C3  , X5_C4  , X5_C5
, X6_C1  , X6_C2  , X6_C3  , X6_C4  , X6_C5
](given
t1: Application5[F, H1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5 ]
, t2: Application5[F, H2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5 ]  , t3: Application5[F, H3  , X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5 ]  , t4: Application5[F, H4  , X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5 ]  , t5: Application5[F, H5  , X5_C1  , X5_C2  , X5_C3  , X5_C4  , X5_C5 ]  , t6: Application5[F, H6  , X6_C1  , X6_C2  , X6_C3  , X6_C4  , X6_C5 ] )
: Application5[
F,
NodeTag6[H1  , H2  , H3  , H4  , H5  , H6 ]  , AsunaTuple6[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1 ]  , AsunaTuple6[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2 ]  , AsunaTuple6[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3 ]  , AsunaTuple6[X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4  , X6_C4 ]  , AsunaTuple6[X1_C5  , X2_C5  , X3_C5  , X4_C5  , X5_C5  , X6_C5 ] ] = {
val plus5_parameter0: Plus5[
AsunaTuple0
, AsunaTuple0  , AsunaTuple0  , AsunaTuple0  , AsunaTuple0
, X6_C1  , X6_C2  , X6_C3  , X6_C4  , X6_C5
, AsunaTuple1[X6_C1]  , AsunaTuple1[X6_C2]  , AsunaTuple1[X6_C3]  , AsunaTuple1[X6_C4]  , AsunaTuple1[X6_C5]
] = Plus5.cachePlusWithTypeParameter0
val plus5_parameter1: Plus5[
AsunaTuple1[X6_C1 ]
, AsunaTuple1[X6_C2 ]  , AsunaTuple1[X6_C3 ]  , AsunaTuple1[X6_C4 ]  , AsunaTuple1[X6_C5 ]
, X5_C1  , X5_C2  , X5_C3  , X5_C4  , X5_C5
, AsunaTuple2[X5_C1  , X6_C1 ]  , AsunaTuple2[X5_C2  , X6_C2 ]  , AsunaTuple2[X5_C3  , X6_C3 ]  , AsunaTuple2[X5_C4  , X6_C4 ]  , AsunaTuple2[X5_C5  , X6_C5 ]
] = Plus5.cachePlusWithTypeParameter1
val plus5_parameter2: Plus5[
AsunaTuple2[X5_C1  , X6_C1 ]
, AsunaTuple2[X5_C2  , X6_C2 ]  , AsunaTuple2[X5_C3  , X6_C3 ]  , AsunaTuple2[X5_C4  , X6_C4 ]  , AsunaTuple2[X5_C5  , X6_C5 ]
, X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5
, AsunaTuple3[X4_C1  , X5_C1  , X6_C1 ]  , AsunaTuple3[X4_C2  , X5_C2  , X6_C2 ]  , AsunaTuple3[X4_C3  , X5_C3  , X6_C3 ]  , AsunaTuple3[X4_C4  , X5_C4  , X6_C4 ]  , AsunaTuple3[X4_C5  , X5_C5  , X6_C5 ]
] = Plus5.cachePlusWithTypeParameter2
val plus5_parameter3: Plus5[
AsunaTuple3[X4_C1  , X5_C1  , X6_C1 ]
, AsunaTuple3[X4_C2  , X5_C2  , X6_C2 ]  , AsunaTuple3[X4_C3  , X5_C3  , X6_C3 ]  , AsunaTuple3[X4_C4  , X5_C4  , X6_C4 ]  , AsunaTuple3[X4_C5  , X5_C5  , X6_C5 ]
, X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5
, AsunaTuple4[X3_C1  , X4_C1  , X5_C1  , X6_C1 ]  , AsunaTuple4[X3_C2  , X4_C2  , X5_C2  , X6_C2 ]  , AsunaTuple4[X3_C3  , X4_C3  , X5_C3  , X6_C3 ]  , AsunaTuple4[X3_C4  , X4_C4  , X5_C4  , X6_C4 ]  , AsunaTuple4[X3_C5  , X4_C5  , X5_C5  , X6_C5 ]
] = Plus5.cachePlusWithTypeParameter3
val plus5_parameter4: Plus5[
AsunaTuple4[X3_C1  , X4_C1  , X5_C1  , X6_C1 ]
, AsunaTuple4[X3_C2  , X4_C2  , X5_C2  , X6_C2 ]  , AsunaTuple4[X3_C3  , X4_C3  , X5_C3  , X6_C3 ]  , AsunaTuple4[X3_C4  , X4_C4  , X5_C4  , X6_C4 ]  , AsunaTuple4[X3_C5  , X4_C5  , X5_C5  , X6_C5 ]
, X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5
, AsunaTuple5[X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1 ]  , AsunaTuple5[X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2 ]  , AsunaTuple5[X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3 ]  , AsunaTuple5[X2_C4  , X3_C4  , X4_C4  , X5_C4  , X6_C4 ]  , AsunaTuple5[X2_C5  , X3_C5  , X4_C5  , X5_C5  , X6_C5 ]
] = Plus5.cachePlusWithTypeParameter4
val plus5_parameter5: Plus5[
AsunaTuple5[X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1 ]
, AsunaTuple5[X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2 ]  , AsunaTuple5[X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3 ]  , AsunaTuple5[X2_C4  , X3_C4  , X4_C4  , X5_C4  , X6_C4 ]  , AsunaTuple5[X2_C5  , X3_C5  , X4_C5  , X5_C5  , X6_C5 ]
, X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5
, AsunaTuple6[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1 ]  , AsunaTuple6[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2 ]  , AsunaTuple6[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3 ]  , AsunaTuple6[X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4  , X6_C4 ]  , AsunaTuple6[X1_C5  , X2_C5  , X3_C5  , X4_C5  , X5_C5  , X6_C5 ]
] = Plus5.cachePlusWithTypeParameter5
new Application5[
F,
NodeTag6[H1  , H2  , H3  , H4  , H5  , H6 ]  , AsunaTuple6[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1 ]  , AsunaTuple6[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2 ]  , AsunaTuple6[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3 ]  , AsunaTuple6[X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4  , X6_C4 ]  , AsunaTuple6[X1_C5  , X2_C5  , X3_C5  , X4_C5  , X5_C5  , X6_C5 ] ]
{
override final def application(context: Context5[F]): F[AsunaTuple6[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1 ]
, AsunaTuple6[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2 ]  , AsunaTuple6[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3 ]  , AsunaTuple6[X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4  , X6_C4 ]  , AsunaTuple6[X1_C5  , X2_C5  , X3_C5  , X4_C5  , X5_C5  , X6_C5 ] ] = {
context.append(
context.append(
context.append(
context.append(
context.append(
context.append(context.start, t6.application(context))(plus5_parameter0)
, t5.application(context))(plus5_parameter1)
, t4.application(context))(plus5_parameter2)
, t3.application(context))(plus5_parameter3)
, t2.application(context))(plus5_parameter4)
, t1.application(context))(plus5_parameter5)
}
}
}
inline given noteTagApplicationImplicit_tagNum6_typeParamNum6[
F[_  , _  , _  , _  , _  , _ ]
, H1 <: TupleTag  , H2 <: TupleTag  , H3 <: TupleTag  , H4 <: TupleTag  , H5 <: TupleTag  , H6 <: TupleTag
, X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6
, X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6
, X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6
, X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6
, X5_C1  , X5_C2  , X5_C3  , X5_C4  , X5_C5  , X5_C6
, X6_C1  , X6_C2  , X6_C3  , X6_C4  , X6_C5  , X6_C6
](given
t1: Application6[F, H1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6 ]
, t2: Application6[F, H2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6 ]  , t3: Application6[F, H3  , X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6 ]  , t4: Application6[F, H4  , X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6 ]  , t5: Application6[F, H5  , X5_C1  , X5_C2  , X5_C3  , X5_C4  , X5_C5  , X5_C6 ]  , t6: Application6[F, H6  , X6_C1  , X6_C2  , X6_C3  , X6_C4  , X6_C5  , X6_C6 ] )
: Application6[
F,
NodeTag6[H1  , H2  , H3  , H4  , H5  , H6 ]  , AsunaTuple6[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1 ]  , AsunaTuple6[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2 ]  , AsunaTuple6[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3 ]  , AsunaTuple6[X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4  , X6_C4 ]  , AsunaTuple6[X1_C5  , X2_C5  , X3_C5  , X4_C5  , X5_C5  , X6_C5 ]  , AsunaTuple6[X1_C6  , X2_C6  , X3_C6  , X4_C6  , X5_C6  , X6_C6 ] ] = {
val plus6_parameter0: Plus6[
AsunaTuple0
, AsunaTuple0  , AsunaTuple0  , AsunaTuple0  , AsunaTuple0  , AsunaTuple0
, X6_C1  , X6_C2  , X6_C3  , X6_C4  , X6_C5  , X6_C6
, AsunaTuple1[X6_C1]  , AsunaTuple1[X6_C2]  , AsunaTuple1[X6_C3]  , AsunaTuple1[X6_C4]  , AsunaTuple1[X6_C5]  , AsunaTuple1[X6_C6]
] = Plus6.cachePlusWithTypeParameter0
val plus6_parameter1: Plus6[
AsunaTuple1[X6_C1 ]
, AsunaTuple1[X6_C2 ]  , AsunaTuple1[X6_C3 ]  , AsunaTuple1[X6_C4 ]  , AsunaTuple1[X6_C5 ]  , AsunaTuple1[X6_C6 ]
, X5_C1  , X5_C2  , X5_C3  , X5_C4  , X5_C5  , X5_C6
, AsunaTuple2[X5_C1  , X6_C1 ]  , AsunaTuple2[X5_C2  , X6_C2 ]  , AsunaTuple2[X5_C3  , X6_C3 ]  , AsunaTuple2[X5_C4  , X6_C4 ]  , AsunaTuple2[X5_C5  , X6_C5 ]  , AsunaTuple2[X5_C6  , X6_C6 ]
] = Plus6.cachePlusWithTypeParameter1
val plus6_parameter2: Plus6[
AsunaTuple2[X5_C1  , X6_C1 ]
, AsunaTuple2[X5_C2  , X6_C2 ]  , AsunaTuple2[X5_C3  , X6_C3 ]  , AsunaTuple2[X5_C4  , X6_C4 ]  , AsunaTuple2[X5_C5  , X6_C5 ]  , AsunaTuple2[X5_C6  , X6_C6 ]
, X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6
, AsunaTuple3[X4_C1  , X5_C1  , X6_C1 ]  , AsunaTuple3[X4_C2  , X5_C2  , X6_C2 ]  , AsunaTuple3[X4_C3  , X5_C3  , X6_C3 ]  , AsunaTuple3[X4_C4  , X5_C4  , X6_C4 ]  , AsunaTuple3[X4_C5  , X5_C5  , X6_C5 ]  , AsunaTuple3[X4_C6  , X5_C6  , X6_C6 ]
] = Plus6.cachePlusWithTypeParameter2
val plus6_parameter3: Plus6[
AsunaTuple3[X4_C1  , X5_C1  , X6_C1 ]
, AsunaTuple3[X4_C2  , X5_C2  , X6_C2 ]  , AsunaTuple3[X4_C3  , X5_C3  , X6_C3 ]  , AsunaTuple3[X4_C4  , X5_C4  , X6_C4 ]  , AsunaTuple3[X4_C5  , X5_C5  , X6_C5 ]  , AsunaTuple3[X4_C6  , X5_C6  , X6_C6 ]
, X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6
, AsunaTuple4[X3_C1  , X4_C1  , X5_C1  , X6_C1 ]  , AsunaTuple4[X3_C2  , X4_C2  , X5_C2  , X6_C2 ]  , AsunaTuple4[X3_C3  , X4_C3  , X5_C3  , X6_C3 ]  , AsunaTuple4[X3_C4  , X4_C4  , X5_C4  , X6_C4 ]  , AsunaTuple4[X3_C5  , X4_C5  , X5_C5  , X6_C5 ]  , AsunaTuple4[X3_C6  , X4_C6  , X5_C6  , X6_C6 ]
] = Plus6.cachePlusWithTypeParameter3
val plus6_parameter4: Plus6[
AsunaTuple4[X3_C1  , X4_C1  , X5_C1  , X6_C1 ]
, AsunaTuple4[X3_C2  , X4_C2  , X5_C2  , X6_C2 ]  , AsunaTuple4[X3_C3  , X4_C3  , X5_C3  , X6_C3 ]  , AsunaTuple4[X3_C4  , X4_C4  , X5_C4  , X6_C4 ]  , AsunaTuple4[X3_C5  , X4_C5  , X5_C5  , X6_C5 ]  , AsunaTuple4[X3_C6  , X4_C6  , X5_C6  , X6_C6 ]
, X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6
, AsunaTuple5[X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1 ]  , AsunaTuple5[X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2 ]  , AsunaTuple5[X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3 ]  , AsunaTuple5[X2_C4  , X3_C4  , X4_C4  , X5_C4  , X6_C4 ]  , AsunaTuple5[X2_C5  , X3_C5  , X4_C5  , X5_C5  , X6_C5 ]  , AsunaTuple5[X2_C6  , X3_C6  , X4_C6  , X5_C6  , X6_C6 ]
] = Plus6.cachePlusWithTypeParameter4
val plus6_parameter5: Plus6[
AsunaTuple5[X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1 ]
, AsunaTuple5[X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2 ]  , AsunaTuple5[X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3 ]  , AsunaTuple5[X2_C4  , X3_C4  , X4_C4  , X5_C4  , X6_C4 ]  , AsunaTuple5[X2_C5  , X3_C5  , X4_C5  , X5_C5  , X6_C5 ]  , AsunaTuple5[X2_C6  , X3_C6  , X4_C6  , X5_C6  , X6_C6 ]
, X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6
, AsunaTuple6[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1 ]  , AsunaTuple6[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2 ]  , AsunaTuple6[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3 ]  , AsunaTuple6[X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4  , X6_C4 ]  , AsunaTuple6[X1_C5  , X2_C5  , X3_C5  , X4_C5  , X5_C5  , X6_C5 ]  , AsunaTuple6[X1_C6  , X2_C6  , X3_C6  , X4_C6  , X5_C6  , X6_C6 ]
] = Plus6.cachePlusWithTypeParameter5
new Application6[
F,
NodeTag6[H1  , H2  , H3  , H4  , H5  , H6 ]  , AsunaTuple6[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1 ]  , AsunaTuple6[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2 ]  , AsunaTuple6[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3 ]  , AsunaTuple6[X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4  , X6_C4 ]  , AsunaTuple6[X1_C5  , X2_C5  , X3_C5  , X4_C5  , X5_C5  , X6_C5 ]  , AsunaTuple6[X1_C6  , X2_C6  , X3_C6  , X4_C6  , X5_C6  , X6_C6 ] ]
{
override final def application(context: Context6[F]): F[AsunaTuple6[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1 ]
, AsunaTuple6[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2 ]  , AsunaTuple6[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3 ]  , AsunaTuple6[X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4  , X6_C4 ]  , AsunaTuple6[X1_C5  , X2_C5  , X3_C5  , X4_C5  , X5_C5  , X6_C5 ]  , AsunaTuple6[X1_C6  , X2_C6  , X3_C6  , X4_C6  , X5_C6  , X6_C6 ] ] = {
context.append(
context.append(
context.append(
context.append(
context.append(
context.append(context.start, t6.application(context))(plus6_parameter0)
, t5.application(context))(plus6_parameter1)
, t4.application(context))(plus6_parameter2)
, t3.application(context))(plus6_parameter3)
, t2.application(context))(plus6_parameter4)
, t1.application(context))(plus6_parameter5)
}
}
}
}
