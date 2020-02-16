package asuna.scala_tuple.tuple_support
import asuna.Application5
import asuna.Context5
import asuna.support.heterogeneous._
import scala.language.higherKinds
trait ScalaTupleImplicits_20_5 {
given tupleTagApplicationImplicit_tagNum20_typeParamNum5[
F[_  , _  , _  , _  , _ ]
, H1  , H2  , H3  , H4  , H5  , H6  , H7  , H8  , H9  , H10  , H11  , H12  , H13  , H14  , H15  , H16  , H17  , H18  , H19  , H20
, X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5
, X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5
, X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5
, X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5
, X5_C1  , X5_C2  , X5_C3  , X5_C4  , X5_C5
, X6_C1  , X6_C2  , X6_C3  , X6_C4  , X6_C5
, X7_C1  , X7_C2  , X7_C3  , X7_C4  , X7_C5
, X8_C1  , X8_C2  , X8_C3  , X8_C4  , X8_C5
, X9_C1  , X9_C2  , X9_C3  , X9_C4  , X9_C5
, X10_C1  , X10_C2  , X10_C3  , X10_C4  , X10_C5
, X11_C1  , X11_C2  , X11_C3  , X11_C4  , X11_C5
, X12_C1  , X12_C2  , X12_C3  , X12_C4  , X12_C5
, X13_C1  , X13_C2  , X13_C3  , X13_C4  , X13_C5
, X14_C1  , X14_C2  , X14_C3  , X14_C4  , X14_C5
, X15_C1  , X15_C2  , X15_C3  , X15_C4  , X15_C5
, X16_C1  , X16_C2  , X16_C3  , X16_C4  , X16_C5
, X17_C1  , X17_C2  , X17_C3  , X17_C4  , X17_C5
, X18_C1  , X18_C2  , X18_C3  , X18_C4  , X18_C5
, X19_C1  , X19_C2  , X19_C3  , X19_C4  , X19_C5
, X20_C1  , X20_C2  , X20_C3  , X20_C4  , X20_C5
](given t1: Application5[F, H1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5 ]
, t2: Application5[F, H2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5 ]  , t3: Application5[F, H3  , X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5 ]  , t4: Application5[F, H4  , X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5 ]  , t5: Application5[F, H5  , X5_C1  , X5_C2  , X5_C3  , X5_C4  , X5_C5 ]  , t6: Application5[F, H6  , X6_C1  , X6_C2  , X6_C3  , X6_C4  , X6_C5 ]  , t7: Application5[F, H7  , X7_C1  , X7_C2  , X7_C3  , X7_C4  , X7_C5 ]  , t8: Application5[F, H8  , X8_C1  , X8_C2  , X8_C3  , X8_C4  , X8_C5 ]  , t9: Application5[F, H9  , X9_C1  , X9_C2  , X9_C3  , X9_C4  , X9_C5 ]  , t10: Application5[F, H10  , X10_C1  , X10_C2  , X10_C3  , X10_C4  , X10_C5 ]  , t11: Application5[F, H11  , X11_C1  , X11_C2  , X11_C3  , X11_C4  , X11_C5 ]  , t12: Application5[F, H12  , X12_C1  , X12_C2  , X12_C3  , X12_C4  , X12_C5 ]  , t13: Application5[F, H13  , X13_C1  , X13_C2  , X13_C3  , X13_C4  , X13_C5 ]  , t14: Application5[F, H14  , X14_C1  , X14_C2  , X14_C3  , X14_C4  , X14_C5 ]  , t15: Application5[F, H15  , X15_C1  , X15_C2  , X15_C3  , X15_C4  , X15_C5 ]  , t16: Application5[F, H16  , X16_C1  , X16_C2  , X16_C3  , X16_C4  , X16_C5 ]  , t17: Application5[F, H17  , X17_C1  , X17_C2  , X17_C3  , X17_C4  , X17_C5 ]  , t18: Application5[F, H18  , X18_C1  , X18_C2  , X18_C3  , X18_C4  , X18_C5 ]  , t19: Application5[F, H19  , X19_C1  , X19_C2  , X19_C3  , X19_C4  , X19_C5 ]  , t20: Application5[F, H20  , X20_C1  , X20_C2  , X20_C3  , X20_C4  , X20_C5 ] )
: Application5[
F,
(H1  , H2  , H3  , H4  , H5  , H6  , H7  , H8  , H9  , H10  , H11  , H12  , H13  , H14  , H15  , H16  , H17  , H18  , H19  , H20 )  , (X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1  , X7_C1  , X8_C1  , X9_C1  , X10_C1  , X11_C1  , X12_C1  , X13_C1  , X14_C1  , X15_C1  , X16_C1  , X17_C1  , X18_C1  , X19_C1  , X20_C1 )  , (X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2  , X7_C2  , X8_C2  , X9_C2  , X10_C2  , X11_C2  , X12_C2  , X13_C2  , X14_C2  , X15_C2  , X16_C2  , X17_C2  , X18_C2  , X19_C2  , X20_C2 )  , (X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3  , X7_C3  , X8_C3  , X9_C3  , X10_C3  , X11_C3  , X12_C3  , X13_C3  , X14_C3  , X15_C3  , X16_C3  , X17_C3  , X18_C3  , X19_C3  , X20_C3 )  , (X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4  , X6_C4  , X7_C4  , X8_C4  , X9_C4  , X10_C4  , X11_C4  , X12_C4  , X13_C4  , X14_C4  , X15_C4  , X16_C4  , X17_C4  , X18_C4  , X19_C4  , X20_C4 )  , (X1_C5  , X2_C5  , X3_C5  , X4_C5  , X5_C5  , X6_C5  , X7_C5  , X8_C5  , X9_C5  , X10_C5  , X11_C5  , X12_C5  , X13_C5  , X14_C5  , X15_C5  , X16_C5  , X17_C5  , X18_C5  , X19_C5  , X20_C5 ) ] =
new Application5[
F,
(H1  , H2  , H3  , H4  , H5  , H6  , H7  , H8  , H9  , H10  , H11  , H12  , H13  , H14  , H15  , H16  , H17  , H18  , H19  , H20 )  , (X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1  , X7_C1  , X8_C1  , X9_C1  , X10_C1  , X11_C1  , X12_C1  , X13_C1  , X14_C1  , X15_C1  , X16_C1  , X17_C1  , X18_C1  , X19_C1  , X20_C1 )  , (X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2  , X7_C2  , X8_C2  , X9_C2  , X10_C2  , X11_C2  , X12_C2  , X13_C2  , X14_C2  , X15_C2  , X16_C2  , X17_C2  , X18_C2  , X19_C2  , X20_C2 )  , (X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3  , X7_C3  , X8_C3  , X9_C3  , X10_C3  , X11_C3  , X12_C3  , X13_C3  , X14_C3  , X15_C3  , X16_C3  , X17_C3  , X18_C3  , X19_C3  , X20_C3 )  , (X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4  , X6_C4  , X7_C4  , X8_C4  , X9_C4  , X10_C4  , X11_C4  , X12_C4  , X13_C4  , X14_C4  , X15_C4  , X16_C4  , X17_C4  , X18_C4  , X19_C4  , X20_C4 )  , (X1_C5  , X2_C5  , X3_C5  , X4_C5  , X5_C5  , X6_C5  , X7_C5  , X8_C5  , X9_C5  , X10_C5  , X11_C5  , X12_C5  , X13_C5  , X14_C5  , X15_C5  , X16_C5  , X17_C5  , X18_C5  , X19_C5  , X20_C5 ) ] {
override def application(context: Context5[F]) = {
context.append(
ScalaTupleImplicits_19_5.tupleTagApplicationImplicit_tagNum19_typeParamNum5[
F
, H2  , H3  , H4  , H5  , H6  , H7  , H8  , H9  , H10  , H11  , H12  , H13  , H14  , H15  , H16  , H17  , H18  , H19  , H20
, X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5
, X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5
, X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5
, X5_C1  , X5_C2  , X5_C3  , X5_C4  , X5_C5
, X6_C1  , X6_C2  , X6_C3  , X6_C4  , X6_C5
, X7_C1  , X7_C2  , X7_C3  , X7_C4  , X7_C5
, X8_C1  , X8_C2  , X8_C3  , X8_C4  , X8_C5
, X9_C1  , X9_C2  , X9_C3  , X9_C4  , X9_C5
, X10_C1  , X10_C2  , X10_C3  , X10_C4  , X10_C5
, X11_C1  , X11_C2  , X11_C3  , X11_C4  , X11_C5
, X12_C1  , X12_C2  , X12_C3  , X12_C4  , X12_C5
, X13_C1  , X13_C2  , X13_C3  , X13_C4  , X13_C5
, X14_C1  , X14_C2  , X14_C3  , X14_C4  , X14_C5
, X15_C1  , X15_C2  , X15_C3  , X15_C4  , X15_C5
, X16_C1  , X16_C2  , X16_C3  , X16_C4  , X16_C5
, X17_C1  , X17_C2  , X17_C3  , X17_C4  , X17_C5
, X18_C1  , X18_C2  , X18_C3  , X18_C4  , X18_C5
, X19_C1  , X19_C2  , X19_C3  , X19_C4  , X19_C5
, X20_C1  , X20_C2  , X20_C3  , X20_C4  , X20_C5
].application(context),
t1.application(context)
)(PlusToTuple5.plusWithTypeParameter19)
}
}
}
object ScalaTupleImplicits_20_5 extends ScalaTupleImplicits_20_5
