package asuna.scala_tuple.tuple_support
import asuna.Application8
import asuna.Context8
import scala.language.higherKinds
trait ScalaTupleImplicits_3_8 {
given tupleTagApplicationImplicit_tagNum3_typeParamNum8[
F[_  , _  , _  , _  , _  , _  , _  , _ ]
, H1  , H2  , H3
, X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8
, X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  , X2_C8
, X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7  , X3_C8
](given t1: Application8[F, H1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8 ]
, t2: Application8[F, H2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  , X2_C8 ]  , t3: Application8[F, H3  , X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7  , X3_C8 ] )
: Application8[
F,
(H1  , H2  , H3 )  , (X1_C1  , X2_C1  , X3_C1 )  , (X1_C2  , X2_C2  , X3_C2 )  , (X1_C3  , X2_C3  , X3_C3 )  , (X1_C4  , X2_C4  , X3_C4 )  , (X1_C5  , X2_C5  , X3_C5 )  , (X1_C6  , X2_C6  , X3_C6 )  , (X1_C7  , X2_C7  , X3_C7 )  , (X1_C8  , X2_C8  , X3_C8 ) ] =
{ (context: Context8[F]) =>
context.append(
context.append(t3.application(context), t2.application(context))(HListPlus8.plusWithTypeParameter1)
, t1.application(context))(PlusToTuple8.plusWithTypeParameter2)
}
}