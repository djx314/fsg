package asuna
class Merge6[I1 <: TupleTag  , I2 <: TupleTag  , I3 <: TupleTag  , I4 <: TupleTag  , I5 <: TupleTag  , I6 <: TupleTag  , Target <: TupleTag]
object Merge6 {
given nodetag1_merge6_implicit[X1_C1 <: TupleTag  , X1_C2 <: TupleTag  , X1_C3 <: TupleTag  , X1_C4 <: TupleTag  , X1_C5 <: TupleTag  , X1_C6 <: TupleTag
, Target1 <: TupleTag ](given
nodeTagImplicit1: Merge6[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , Target1]
): Merge6[
NodeTag1[X1_C1 ]
, NodeTag1[X1_C2 ]
, NodeTag1[X1_C3 ]
, NodeTag1[X1_C4 ]
, NodeTag1[X1_C5 ]
, NodeTag1[X1_C6 ]
, NodeTag1[Target1 ]
] = {
new Merge6[
NodeTag1[X1_C1 ]
, NodeTag1[X1_C2 ]
, NodeTag1[X1_C3 ]
, NodeTag1[X1_C4 ]
, NodeTag1[X1_C5 ]
, NodeTag1[X1_C6 ]
, NodeTag1[Target1 ]
]
}
given tupletag1_merge6_implicit[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6
, X1
]
: Merge6[
TupleTag1[PropertyTag1[X1_C1, X1] ]
, TupleTag1[PropertyTag1[X1_C2, X1] ]
, TupleTag1[PropertyTag1[X1_C3, X1] ]
, TupleTag1[PropertyTag1[X1_C4, X1] ]
, TupleTag1[PropertyTag1[X1_C5, X1] ]
, TupleTag1[PropertyTag1[X1_C6, X1] ]
, TupleTag1[
PropertyTag6[ X1_C1 ,  X1_C2 ,  X1_C3 ,  X1_C4 ,  X1_C5 ,  X1_C6 ,  X1]
]
] = {
new Merge6[
TupleTag1[PropertyTag1[X1_C1, X1] ]
, TupleTag1[PropertyTag1[X1_C2, X1] ]
, TupleTag1[PropertyTag1[X1_C3, X1] ]
, TupleTag1[PropertyTag1[X1_C4, X1] ]
, TupleTag1[PropertyTag1[X1_C5, X1] ]
, TupleTag1[PropertyTag1[X1_C6, X1] ]
, TupleTag1[
PropertyTag6[ X1_C1 ,  X1_C2 ,  X1_C3 ,  X1_C4 ,  X1_C5 ,  X1_C6 ,  X1]
]
]
}
given nodetag2_merge6_implicit[X1_C1 <: TupleTag  , X1_C2 <: TupleTag  , X1_C3 <: TupleTag  , X1_C4 <: TupleTag  , X1_C5 <: TupleTag  , X1_C6 <: TupleTag    , X2_C1 <: TupleTag  , X2_C2 <: TupleTag  , X2_C3 <: TupleTag  , X2_C4 <: TupleTag  , X2_C5 <: TupleTag  , X2_C6 <: TupleTag
, Target1 <: TupleTag  , Target2 <: TupleTag ](given
nodeTagImplicit1: Merge6[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , Target1]
, nodeTagImplicit2: Merge6[X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , Target2 ]  ): Merge6[
NodeTag2[X1_C1  , X2_C1 ]
, NodeTag2[X1_C2  , X2_C2 ]
, NodeTag2[X1_C3  , X2_C3 ]
, NodeTag2[X1_C4  , X2_C4 ]
, NodeTag2[X1_C5  , X2_C5 ]
, NodeTag2[X1_C6  , X2_C6 ]
, NodeTag2[Target1  , Target2 ]
] = {
new Merge6[
NodeTag2[X1_C1  , X2_C1 ]
, NodeTag2[X1_C2  , X2_C2 ]
, NodeTag2[X1_C3  , X2_C3 ]
, NodeTag2[X1_C4  , X2_C4 ]
, NodeTag2[X1_C5  , X2_C5 ]
, NodeTag2[X1_C6  , X2_C6 ]
, NodeTag2[Target1  , Target2 ]
]
}
given tupletag2_merge6_implicit[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6    , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6
, X1  , X2
]
: Merge6[
TupleTag2[PropertyTag1[X1_C1, X1]  , PropertyTag1[X2_C1, X2] ]
, TupleTag2[PropertyTag1[X1_C2, X1]  , PropertyTag1[X2_C2, X2] ]
, TupleTag2[PropertyTag1[X1_C3, X1]  , PropertyTag1[X2_C3, X2] ]
, TupleTag2[PropertyTag1[X1_C4, X1]  , PropertyTag1[X2_C4, X2] ]
, TupleTag2[PropertyTag1[X1_C5, X1]  , PropertyTag1[X2_C5, X2] ]
, TupleTag2[PropertyTag1[X1_C6, X1]  , PropertyTag1[X2_C6, X2] ]
, TupleTag2[
PropertyTag6[ X1_C1 ,  X1_C2 ,  X1_C3 ,  X1_C4 ,  X1_C5 ,  X1_C6 ,  X1]
, PropertyTag6[ X2_C1 ,  X2_C2 ,  X2_C3 ,  X2_C4 ,  X2_C5 ,  X2_C6 ,  X2]
]
] = {
new Merge6[
TupleTag2[PropertyTag1[X1_C1, X1]  , PropertyTag1[X2_C1, X2] ]
, TupleTag2[PropertyTag1[X1_C2, X1]  , PropertyTag1[X2_C2, X2] ]
, TupleTag2[PropertyTag1[X1_C3, X1]  , PropertyTag1[X2_C3, X2] ]
, TupleTag2[PropertyTag1[X1_C4, X1]  , PropertyTag1[X2_C4, X2] ]
, TupleTag2[PropertyTag1[X1_C5, X1]  , PropertyTag1[X2_C5, X2] ]
, TupleTag2[PropertyTag1[X1_C6, X1]  , PropertyTag1[X2_C6, X2] ]
, TupleTag2[
PropertyTag6[ X1_C1 ,  X1_C2 ,  X1_C3 ,  X1_C4 ,  X1_C5 ,  X1_C6 ,  X1]
, PropertyTag6[ X2_C1 ,  X2_C2 ,  X2_C3 ,  X2_C4 ,  X2_C5 ,  X2_C6 ,  X2]
]
]
}
given nodetag3_merge6_implicit[X1_C1 <: TupleTag  , X1_C2 <: TupleTag  , X1_C3 <: TupleTag  , X1_C4 <: TupleTag  , X1_C5 <: TupleTag  , X1_C6 <: TupleTag    , X2_C1 <: TupleTag  , X2_C2 <: TupleTag  , X2_C3 <: TupleTag  , X2_C4 <: TupleTag  , X2_C5 <: TupleTag  , X2_C6 <: TupleTag    , X3_C1 <: TupleTag  , X3_C2 <: TupleTag  , X3_C3 <: TupleTag  , X3_C4 <: TupleTag  , X3_C5 <: TupleTag  , X3_C6 <: TupleTag
, Target1 <: TupleTag  , Target2 <: TupleTag  , Target3 <: TupleTag ](given
nodeTagImplicit1: Merge6[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , Target1]
, nodeTagImplicit2: Merge6[X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , Target2 ]  , nodeTagImplicit3: Merge6[X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , Target3 ]  ): Merge6[
NodeTag3[X1_C1  , X2_C1  , X3_C1 ]
, NodeTag3[X1_C2  , X2_C2  , X3_C2 ]
, NodeTag3[X1_C3  , X2_C3  , X3_C3 ]
, NodeTag3[X1_C4  , X2_C4  , X3_C4 ]
, NodeTag3[X1_C5  , X2_C5  , X3_C5 ]
, NodeTag3[X1_C6  , X2_C6  , X3_C6 ]
, NodeTag3[Target1  , Target2  , Target3 ]
] = {
new Merge6[
NodeTag3[X1_C1  , X2_C1  , X3_C1 ]
, NodeTag3[X1_C2  , X2_C2  , X3_C2 ]
, NodeTag3[X1_C3  , X2_C3  , X3_C3 ]
, NodeTag3[X1_C4  , X2_C4  , X3_C4 ]
, NodeTag3[X1_C5  , X2_C5  , X3_C5 ]
, NodeTag3[X1_C6  , X2_C6  , X3_C6 ]
, NodeTag3[Target1  , Target2  , Target3 ]
]
}
given tupletag3_merge6_implicit[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6    , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6    , X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6
, X1  , X2  , X3
]
: Merge6[
TupleTag3[PropertyTag1[X1_C1, X1]  , PropertyTag1[X2_C1, X2]  , PropertyTag1[X3_C1, X3] ]
, TupleTag3[PropertyTag1[X1_C2, X1]  , PropertyTag1[X2_C2, X2]  , PropertyTag1[X3_C2, X3] ]
, TupleTag3[PropertyTag1[X1_C3, X1]  , PropertyTag1[X2_C3, X2]  , PropertyTag1[X3_C3, X3] ]
, TupleTag3[PropertyTag1[X1_C4, X1]  , PropertyTag1[X2_C4, X2]  , PropertyTag1[X3_C4, X3] ]
, TupleTag3[PropertyTag1[X1_C5, X1]  , PropertyTag1[X2_C5, X2]  , PropertyTag1[X3_C5, X3] ]
, TupleTag3[PropertyTag1[X1_C6, X1]  , PropertyTag1[X2_C6, X2]  , PropertyTag1[X3_C6, X3] ]
, TupleTag3[
PropertyTag6[ X1_C1 ,  X1_C2 ,  X1_C3 ,  X1_C4 ,  X1_C5 ,  X1_C6 ,  X1]
, PropertyTag6[ X2_C1 ,  X2_C2 ,  X2_C3 ,  X2_C4 ,  X2_C5 ,  X2_C6 ,  X2]  , PropertyTag6[ X3_C1 ,  X3_C2 ,  X3_C3 ,  X3_C4 ,  X3_C5 ,  X3_C6 ,  X3]
]
] = {
new Merge6[
TupleTag3[PropertyTag1[X1_C1, X1]  , PropertyTag1[X2_C1, X2]  , PropertyTag1[X3_C1, X3] ]
, TupleTag3[PropertyTag1[X1_C2, X1]  , PropertyTag1[X2_C2, X2]  , PropertyTag1[X3_C2, X3] ]
, TupleTag3[PropertyTag1[X1_C3, X1]  , PropertyTag1[X2_C3, X2]  , PropertyTag1[X3_C3, X3] ]
, TupleTag3[PropertyTag1[X1_C4, X1]  , PropertyTag1[X2_C4, X2]  , PropertyTag1[X3_C4, X3] ]
, TupleTag3[PropertyTag1[X1_C5, X1]  , PropertyTag1[X2_C5, X2]  , PropertyTag1[X3_C5, X3] ]
, TupleTag3[PropertyTag1[X1_C6, X1]  , PropertyTag1[X2_C6, X2]  , PropertyTag1[X3_C6, X3] ]
, TupleTag3[
PropertyTag6[ X1_C1 ,  X1_C2 ,  X1_C3 ,  X1_C4 ,  X1_C5 ,  X1_C6 ,  X1]
, PropertyTag6[ X2_C1 ,  X2_C2 ,  X2_C3 ,  X2_C4 ,  X2_C5 ,  X2_C6 ,  X2]  , PropertyTag6[ X3_C1 ,  X3_C2 ,  X3_C3 ,  X3_C4 ,  X3_C5 ,  X3_C6 ,  X3]
]
]
}
given nodetag4_merge6_implicit[X1_C1 <: TupleTag  , X1_C2 <: TupleTag  , X1_C3 <: TupleTag  , X1_C4 <: TupleTag  , X1_C5 <: TupleTag  , X1_C6 <: TupleTag    , X2_C1 <: TupleTag  , X2_C2 <: TupleTag  , X2_C3 <: TupleTag  , X2_C4 <: TupleTag  , X2_C5 <: TupleTag  , X2_C6 <: TupleTag    , X3_C1 <: TupleTag  , X3_C2 <: TupleTag  , X3_C3 <: TupleTag  , X3_C4 <: TupleTag  , X3_C5 <: TupleTag  , X3_C6 <: TupleTag    , X4_C1 <: TupleTag  , X4_C2 <: TupleTag  , X4_C3 <: TupleTag  , X4_C4 <: TupleTag  , X4_C5 <: TupleTag  , X4_C6 <: TupleTag
, Target1 <: TupleTag  , Target2 <: TupleTag  , Target3 <: TupleTag  , Target4 <: TupleTag ](given
nodeTagImplicit1: Merge6[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , Target1]
, nodeTagImplicit2: Merge6[X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , Target2 ]  , nodeTagImplicit3: Merge6[X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , Target3 ]  , nodeTagImplicit4: Merge6[X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6  , Target4 ]  ): Merge6[
NodeTag4[X1_C1  , X2_C1  , X3_C1  , X4_C1 ]
, NodeTag4[X1_C2  , X2_C2  , X3_C2  , X4_C2 ]
, NodeTag4[X1_C3  , X2_C3  , X3_C3  , X4_C3 ]
, NodeTag4[X1_C4  , X2_C4  , X3_C4  , X4_C4 ]
, NodeTag4[X1_C5  , X2_C5  , X3_C5  , X4_C5 ]
, NodeTag4[X1_C6  , X2_C6  , X3_C6  , X4_C6 ]
, NodeTag4[Target1  , Target2  , Target3  , Target4 ]
] = {
new Merge6[
NodeTag4[X1_C1  , X2_C1  , X3_C1  , X4_C1 ]
, NodeTag4[X1_C2  , X2_C2  , X3_C2  , X4_C2 ]
, NodeTag4[X1_C3  , X2_C3  , X3_C3  , X4_C3 ]
, NodeTag4[X1_C4  , X2_C4  , X3_C4  , X4_C4 ]
, NodeTag4[X1_C5  , X2_C5  , X3_C5  , X4_C5 ]
, NodeTag4[X1_C6  , X2_C6  , X3_C6  , X4_C6 ]
, NodeTag4[Target1  , Target2  , Target3  , Target4 ]
]
}
given tupletag4_merge6_implicit[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6    , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6    , X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6    , X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6
, X1  , X2  , X3  , X4
]
: Merge6[
TupleTag4[PropertyTag1[X1_C1, X1]  , PropertyTag1[X2_C1, X2]  , PropertyTag1[X3_C1, X3]  , PropertyTag1[X4_C1, X4] ]
, TupleTag4[PropertyTag1[X1_C2, X1]  , PropertyTag1[X2_C2, X2]  , PropertyTag1[X3_C2, X3]  , PropertyTag1[X4_C2, X4] ]
, TupleTag4[PropertyTag1[X1_C3, X1]  , PropertyTag1[X2_C3, X2]  , PropertyTag1[X3_C3, X3]  , PropertyTag1[X4_C3, X4] ]
, TupleTag4[PropertyTag1[X1_C4, X1]  , PropertyTag1[X2_C4, X2]  , PropertyTag1[X3_C4, X3]  , PropertyTag1[X4_C4, X4] ]
, TupleTag4[PropertyTag1[X1_C5, X1]  , PropertyTag1[X2_C5, X2]  , PropertyTag1[X3_C5, X3]  , PropertyTag1[X4_C5, X4] ]
, TupleTag4[PropertyTag1[X1_C6, X1]  , PropertyTag1[X2_C6, X2]  , PropertyTag1[X3_C6, X3]  , PropertyTag1[X4_C6, X4] ]
, TupleTag4[
PropertyTag6[ X1_C1 ,  X1_C2 ,  X1_C3 ,  X1_C4 ,  X1_C5 ,  X1_C6 ,  X1]
, PropertyTag6[ X2_C1 ,  X2_C2 ,  X2_C3 ,  X2_C4 ,  X2_C5 ,  X2_C6 ,  X2]  , PropertyTag6[ X3_C1 ,  X3_C2 ,  X3_C3 ,  X3_C4 ,  X3_C5 ,  X3_C6 ,  X3]  , PropertyTag6[ X4_C1 ,  X4_C2 ,  X4_C3 ,  X4_C4 ,  X4_C5 ,  X4_C6 ,  X4]
]
] = {
new Merge6[
TupleTag4[PropertyTag1[X1_C1, X1]  , PropertyTag1[X2_C1, X2]  , PropertyTag1[X3_C1, X3]  , PropertyTag1[X4_C1, X4] ]
, TupleTag4[PropertyTag1[X1_C2, X1]  , PropertyTag1[X2_C2, X2]  , PropertyTag1[X3_C2, X3]  , PropertyTag1[X4_C2, X4] ]
, TupleTag4[PropertyTag1[X1_C3, X1]  , PropertyTag1[X2_C3, X2]  , PropertyTag1[X3_C3, X3]  , PropertyTag1[X4_C3, X4] ]
, TupleTag4[PropertyTag1[X1_C4, X1]  , PropertyTag1[X2_C4, X2]  , PropertyTag1[X3_C4, X3]  , PropertyTag1[X4_C4, X4] ]
, TupleTag4[PropertyTag1[X1_C5, X1]  , PropertyTag1[X2_C5, X2]  , PropertyTag1[X3_C5, X3]  , PropertyTag1[X4_C5, X4] ]
, TupleTag4[PropertyTag1[X1_C6, X1]  , PropertyTag1[X2_C6, X2]  , PropertyTag1[X3_C6, X3]  , PropertyTag1[X4_C6, X4] ]
, TupleTag4[
PropertyTag6[ X1_C1 ,  X1_C2 ,  X1_C3 ,  X1_C4 ,  X1_C5 ,  X1_C6 ,  X1]
, PropertyTag6[ X2_C1 ,  X2_C2 ,  X2_C3 ,  X2_C4 ,  X2_C5 ,  X2_C6 ,  X2]  , PropertyTag6[ X3_C1 ,  X3_C2 ,  X3_C3 ,  X3_C4 ,  X3_C5 ,  X3_C6 ,  X3]  , PropertyTag6[ X4_C1 ,  X4_C2 ,  X4_C3 ,  X4_C4 ,  X4_C5 ,  X4_C6 ,  X4]
]
]
}
given nodetag5_merge6_implicit[X1_C1 <: TupleTag  , X1_C2 <: TupleTag  , X1_C3 <: TupleTag  , X1_C4 <: TupleTag  , X1_C5 <: TupleTag  , X1_C6 <: TupleTag    , X2_C1 <: TupleTag  , X2_C2 <: TupleTag  , X2_C3 <: TupleTag  , X2_C4 <: TupleTag  , X2_C5 <: TupleTag  , X2_C6 <: TupleTag    , X3_C1 <: TupleTag  , X3_C2 <: TupleTag  , X3_C3 <: TupleTag  , X3_C4 <: TupleTag  , X3_C5 <: TupleTag  , X3_C6 <: TupleTag    , X4_C1 <: TupleTag  , X4_C2 <: TupleTag  , X4_C3 <: TupleTag  , X4_C4 <: TupleTag  , X4_C5 <: TupleTag  , X4_C6 <: TupleTag    , X5_C1 <: TupleTag  , X5_C2 <: TupleTag  , X5_C3 <: TupleTag  , X5_C4 <: TupleTag  , X5_C5 <: TupleTag  , X5_C6 <: TupleTag
, Target1 <: TupleTag  , Target2 <: TupleTag  , Target3 <: TupleTag  , Target4 <: TupleTag  , Target5 <: TupleTag ](given
nodeTagImplicit1: Merge6[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , Target1]
, nodeTagImplicit2: Merge6[X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , Target2 ]  , nodeTagImplicit3: Merge6[X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , Target3 ]  , nodeTagImplicit4: Merge6[X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6  , Target4 ]  , nodeTagImplicit5: Merge6[X5_C1  , X5_C2  , X5_C3  , X5_C4  , X5_C5  , X5_C6  , Target5 ]  ): Merge6[
NodeTag5[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1 ]
, NodeTag5[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2 ]
, NodeTag5[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3 ]
, NodeTag5[X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4 ]
, NodeTag5[X1_C5  , X2_C5  , X3_C5  , X4_C5  , X5_C5 ]
, NodeTag5[X1_C6  , X2_C6  , X3_C6  , X4_C6  , X5_C6 ]
, NodeTag5[Target1  , Target2  , Target3  , Target4  , Target5 ]
] = {
new Merge6[
NodeTag5[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1 ]
, NodeTag5[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2 ]
, NodeTag5[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3 ]
, NodeTag5[X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4 ]
, NodeTag5[X1_C5  , X2_C5  , X3_C5  , X4_C5  , X5_C5 ]
, NodeTag5[X1_C6  , X2_C6  , X3_C6  , X4_C6  , X5_C6 ]
, NodeTag5[Target1  , Target2  , Target3  , Target4  , Target5 ]
]
}
given tupletag5_merge6_implicit[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6    , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6    , X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6    , X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6    , X5_C1  , X5_C2  , X5_C3  , X5_C4  , X5_C5  , X5_C6
, X1  , X2  , X3  , X4  , X5
]
: Merge6[
TupleTag5[PropertyTag1[X1_C1, X1]  , PropertyTag1[X2_C1, X2]  , PropertyTag1[X3_C1, X3]  , PropertyTag1[X4_C1, X4]  , PropertyTag1[X5_C1, X5] ]
, TupleTag5[PropertyTag1[X1_C2, X1]  , PropertyTag1[X2_C2, X2]  , PropertyTag1[X3_C2, X3]  , PropertyTag1[X4_C2, X4]  , PropertyTag1[X5_C2, X5] ]
, TupleTag5[PropertyTag1[X1_C3, X1]  , PropertyTag1[X2_C3, X2]  , PropertyTag1[X3_C3, X3]  , PropertyTag1[X4_C3, X4]  , PropertyTag1[X5_C3, X5] ]
, TupleTag5[PropertyTag1[X1_C4, X1]  , PropertyTag1[X2_C4, X2]  , PropertyTag1[X3_C4, X3]  , PropertyTag1[X4_C4, X4]  , PropertyTag1[X5_C4, X5] ]
, TupleTag5[PropertyTag1[X1_C5, X1]  , PropertyTag1[X2_C5, X2]  , PropertyTag1[X3_C5, X3]  , PropertyTag1[X4_C5, X4]  , PropertyTag1[X5_C5, X5] ]
, TupleTag5[PropertyTag1[X1_C6, X1]  , PropertyTag1[X2_C6, X2]  , PropertyTag1[X3_C6, X3]  , PropertyTag1[X4_C6, X4]  , PropertyTag1[X5_C6, X5] ]
, TupleTag5[
PropertyTag6[ X1_C1 ,  X1_C2 ,  X1_C3 ,  X1_C4 ,  X1_C5 ,  X1_C6 ,  X1]
, PropertyTag6[ X2_C1 ,  X2_C2 ,  X2_C3 ,  X2_C4 ,  X2_C5 ,  X2_C6 ,  X2]  , PropertyTag6[ X3_C1 ,  X3_C2 ,  X3_C3 ,  X3_C4 ,  X3_C5 ,  X3_C6 ,  X3]  , PropertyTag6[ X4_C1 ,  X4_C2 ,  X4_C3 ,  X4_C4 ,  X4_C5 ,  X4_C6 ,  X4]  , PropertyTag6[ X5_C1 ,  X5_C2 ,  X5_C3 ,  X5_C4 ,  X5_C5 ,  X5_C6 ,  X5]
]
] = {
new Merge6[
TupleTag5[PropertyTag1[X1_C1, X1]  , PropertyTag1[X2_C1, X2]  , PropertyTag1[X3_C1, X3]  , PropertyTag1[X4_C1, X4]  , PropertyTag1[X5_C1, X5] ]
, TupleTag5[PropertyTag1[X1_C2, X1]  , PropertyTag1[X2_C2, X2]  , PropertyTag1[X3_C2, X3]  , PropertyTag1[X4_C2, X4]  , PropertyTag1[X5_C2, X5] ]
, TupleTag5[PropertyTag1[X1_C3, X1]  , PropertyTag1[X2_C3, X2]  , PropertyTag1[X3_C3, X3]  , PropertyTag1[X4_C3, X4]  , PropertyTag1[X5_C3, X5] ]
, TupleTag5[PropertyTag1[X1_C4, X1]  , PropertyTag1[X2_C4, X2]  , PropertyTag1[X3_C4, X3]  , PropertyTag1[X4_C4, X4]  , PropertyTag1[X5_C4, X5] ]
, TupleTag5[PropertyTag1[X1_C5, X1]  , PropertyTag1[X2_C5, X2]  , PropertyTag1[X3_C5, X3]  , PropertyTag1[X4_C5, X4]  , PropertyTag1[X5_C5, X5] ]
, TupleTag5[PropertyTag1[X1_C6, X1]  , PropertyTag1[X2_C6, X2]  , PropertyTag1[X3_C6, X3]  , PropertyTag1[X4_C6, X4]  , PropertyTag1[X5_C6, X5] ]
, TupleTag5[
PropertyTag6[ X1_C1 ,  X1_C2 ,  X1_C3 ,  X1_C4 ,  X1_C5 ,  X1_C6 ,  X1]
, PropertyTag6[ X2_C1 ,  X2_C2 ,  X2_C3 ,  X2_C4 ,  X2_C5 ,  X2_C6 ,  X2]  , PropertyTag6[ X3_C1 ,  X3_C2 ,  X3_C3 ,  X3_C4 ,  X3_C5 ,  X3_C6 ,  X3]  , PropertyTag6[ X4_C1 ,  X4_C2 ,  X4_C3 ,  X4_C4 ,  X4_C5 ,  X4_C6 ,  X4]  , PropertyTag6[ X5_C1 ,  X5_C2 ,  X5_C3 ,  X5_C4 ,  X5_C5 ,  X5_C6 ,  X5]
]
]
}
given nodetag6_merge6_implicit[X1_C1 <: TupleTag  , X1_C2 <: TupleTag  , X1_C3 <: TupleTag  , X1_C4 <: TupleTag  , X1_C5 <: TupleTag  , X1_C6 <: TupleTag    , X2_C1 <: TupleTag  , X2_C2 <: TupleTag  , X2_C3 <: TupleTag  , X2_C4 <: TupleTag  , X2_C5 <: TupleTag  , X2_C6 <: TupleTag    , X3_C1 <: TupleTag  , X3_C2 <: TupleTag  , X3_C3 <: TupleTag  , X3_C4 <: TupleTag  , X3_C5 <: TupleTag  , X3_C6 <: TupleTag    , X4_C1 <: TupleTag  , X4_C2 <: TupleTag  , X4_C3 <: TupleTag  , X4_C4 <: TupleTag  , X4_C5 <: TupleTag  , X4_C6 <: TupleTag    , X5_C1 <: TupleTag  , X5_C2 <: TupleTag  , X5_C3 <: TupleTag  , X5_C4 <: TupleTag  , X5_C5 <: TupleTag  , X5_C6 <: TupleTag    , X6_C1 <: TupleTag  , X6_C2 <: TupleTag  , X6_C3 <: TupleTag  , X6_C4 <: TupleTag  , X6_C5 <: TupleTag  , X6_C6 <: TupleTag
, Target1 <: TupleTag  , Target2 <: TupleTag  , Target3 <: TupleTag  , Target4 <: TupleTag  , Target5 <: TupleTag  , Target6 <: TupleTag ](given
nodeTagImplicit1: Merge6[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , Target1]
, nodeTagImplicit2: Merge6[X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , Target2 ]  , nodeTagImplicit3: Merge6[X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , Target3 ]  , nodeTagImplicit4: Merge6[X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6  , Target4 ]  , nodeTagImplicit5: Merge6[X5_C1  , X5_C2  , X5_C3  , X5_C4  , X5_C5  , X5_C6  , Target5 ]  , nodeTagImplicit6: Merge6[X6_C1  , X6_C2  , X6_C3  , X6_C4  , X6_C5  , X6_C6  , Target6 ]  ): Merge6[
NodeTag6[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1 ]
, NodeTag6[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2 ]
, NodeTag6[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3 ]
, NodeTag6[X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4  , X6_C4 ]
, NodeTag6[X1_C5  , X2_C5  , X3_C5  , X4_C5  , X5_C5  , X6_C5 ]
, NodeTag6[X1_C6  , X2_C6  , X3_C6  , X4_C6  , X5_C6  , X6_C6 ]
, NodeTag6[Target1  , Target2  , Target3  , Target4  , Target5  , Target6 ]
] = {
new Merge6[
NodeTag6[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1 ]
, NodeTag6[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2 ]
, NodeTag6[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3 ]
, NodeTag6[X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4  , X6_C4 ]
, NodeTag6[X1_C5  , X2_C5  , X3_C5  , X4_C5  , X5_C5  , X6_C5 ]
, NodeTag6[X1_C6  , X2_C6  , X3_C6  , X4_C6  , X5_C6  , X6_C6 ]
, NodeTag6[Target1  , Target2  , Target3  , Target4  , Target5  , Target6 ]
]
}
given tupletag6_merge6_implicit[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6    , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6    , X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6    , X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6    , X5_C1  , X5_C2  , X5_C3  , X5_C4  , X5_C5  , X5_C6    , X6_C1  , X6_C2  , X6_C3  , X6_C4  , X6_C5  , X6_C6
, X1  , X2  , X3  , X4  , X5  , X6
]
: Merge6[
TupleTag6[PropertyTag1[X1_C1, X1]  , PropertyTag1[X2_C1, X2]  , PropertyTag1[X3_C1, X3]  , PropertyTag1[X4_C1, X4]  , PropertyTag1[X5_C1, X5]  , PropertyTag1[X6_C1, X6] ]
, TupleTag6[PropertyTag1[X1_C2, X1]  , PropertyTag1[X2_C2, X2]  , PropertyTag1[X3_C2, X3]  , PropertyTag1[X4_C2, X4]  , PropertyTag1[X5_C2, X5]  , PropertyTag1[X6_C2, X6] ]
, TupleTag6[PropertyTag1[X1_C3, X1]  , PropertyTag1[X2_C3, X2]  , PropertyTag1[X3_C3, X3]  , PropertyTag1[X4_C3, X4]  , PropertyTag1[X5_C3, X5]  , PropertyTag1[X6_C3, X6] ]
, TupleTag6[PropertyTag1[X1_C4, X1]  , PropertyTag1[X2_C4, X2]  , PropertyTag1[X3_C4, X3]  , PropertyTag1[X4_C4, X4]  , PropertyTag1[X5_C4, X5]  , PropertyTag1[X6_C4, X6] ]
, TupleTag6[PropertyTag1[X1_C5, X1]  , PropertyTag1[X2_C5, X2]  , PropertyTag1[X3_C5, X3]  , PropertyTag1[X4_C5, X4]  , PropertyTag1[X5_C5, X5]  , PropertyTag1[X6_C5, X6] ]
, TupleTag6[PropertyTag1[X1_C6, X1]  , PropertyTag1[X2_C6, X2]  , PropertyTag1[X3_C6, X3]  , PropertyTag1[X4_C6, X4]  , PropertyTag1[X5_C6, X5]  , PropertyTag1[X6_C6, X6] ]
, TupleTag6[
PropertyTag6[ X1_C1 ,  X1_C2 ,  X1_C3 ,  X1_C4 ,  X1_C5 ,  X1_C6 ,  X1]
, PropertyTag6[ X2_C1 ,  X2_C2 ,  X2_C3 ,  X2_C4 ,  X2_C5 ,  X2_C6 ,  X2]  , PropertyTag6[ X3_C1 ,  X3_C2 ,  X3_C3 ,  X3_C4 ,  X3_C5 ,  X3_C6 ,  X3]  , PropertyTag6[ X4_C1 ,  X4_C2 ,  X4_C3 ,  X4_C4 ,  X4_C5 ,  X4_C6 ,  X4]  , PropertyTag6[ X5_C1 ,  X5_C2 ,  X5_C3 ,  X5_C4 ,  X5_C5 ,  X5_C6 ,  X5]  , PropertyTag6[ X6_C1 ,  X6_C2 ,  X6_C3 ,  X6_C4 ,  X6_C5 ,  X6_C6 ,  X6]
]
] = {
new Merge6[
TupleTag6[PropertyTag1[X1_C1, X1]  , PropertyTag1[X2_C1, X2]  , PropertyTag1[X3_C1, X3]  , PropertyTag1[X4_C1, X4]  , PropertyTag1[X5_C1, X5]  , PropertyTag1[X6_C1, X6] ]
, TupleTag6[PropertyTag1[X1_C2, X1]  , PropertyTag1[X2_C2, X2]  , PropertyTag1[X3_C2, X3]  , PropertyTag1[X4_C2, X4]  , PropertyTag1[X5_C2, X5]  , PropertyTag1[X6_C2, X6] ]
, TupleTag6[PropertyTag1[X1_C3, X1]  , PropertyTag1[X2_C3, X2]  , PropertyTag1[X3_C3, X3]  , PropertyTag1[X4_C3, X4]  , PropertyTag1[X5_C3, X5]  , PropertyTag1[X6_C3, X6] ]
, TupleTag6[PropertyTag1[X1_C4, X1]  , PropertyTag1[X2_C4, X2]  , PropertyTag1[X3_C4, X3]  , PropertyTag1[X4_C4, X4]  , PropertyTag1[X5_C4, X5]  , PropertyTag1[X6_C4, X6] ]
, TupleTag6[PropertyTag1[X1_C5, X1]  , PropertyTag1[X2_C5, X2]  , PropertyTag1[X3_C5, X3]  , PropertyTag1[X4_C5, X4]  , PropertyTag1[X5_C5, X5]  , PropertyTag1[X6_C5, X6] ]
, TupleTag6[PropertyTag1[X1_C6, X1]  , PropertyTag1[X2_C6, X2]  , PropertyTag1[X3_C6, X3]  , PropertyTag1[X4_C6, X4]  , PropertyTag1[X5_C6, X5]  , PropertyTag1[X6_C6, X6] ]
, TupleTag6[
PropertyTag6[ X1_C1 ,  X1_C2 ,  X1_C3 ,  X1_C4 ,  X1_C5 ,  X1_C6 ,  X1]
, PropertyTag6[ X2_C1 ,  X2_C2 ,  X2_C3 ,  X2_C4 ,  X2_C5 ,  X2_C6 ,  X2]  , PropertyTag6[ X3_C1 ,  X3_C2 ,  X3_C3 ,  X3_C4 ,  X3_C5 ,  X3_C6 ,  X3]  , PropertyTag6[ X4_C1 ,  X4_C2 ,  X4_C3 ,  X4_C4 ,  X4_C5 ,  X4_C6 ,  X4]  , PropertyTag6[ X5_C1 ,  X5_C2 ,  X5_C3 ,  X5_C4 ,  X5_C5 ,  X5_C6 ,  X5]  , PropertyTag6[ X6_C1 ,  X6_C2 ,  X6_C3 ,  X6_C4 ,  X6_C5 ,  X6_C6 ,  X6]
]
]
}
}
