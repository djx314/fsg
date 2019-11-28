package asuna
class Merge3[I1 <: TupleTag  , I2 <: TupleTag  , I3 <: TupleTag  , Target <: TupleTag]
object Merge3 {
implicit def nodetag1_merge3_implicit[X1_C1 <: TupleTag  , X1_C2 <: TupleTag  , X1_C3 <: TupleTag
, Target1 <: TupleTag
]
(implicit
nodeTagImplicit1: Merge3[X1_C1  , X1_C2  , X1_C3  , Target1 ]
): Merge3[
NodeTag1[X1_C1 ]
, NodeTag1[X1_C2 ]
, NodeTag1[X1_C3 ]
, NodeTag1[Target1 ]
] = {
new Merge3[
NodeTag1[X1_C1 ]
, NodeTag1[X1_C2 ]
, NodeTag1[X1_C3 ]
, NodeTag1[Target1 ]
]
}
implicit def tupletag1_merge3_implicit[X1_C1  , X1_C2  , X1_C3
, X1
]
: Merge3[
TupleTag1[PropertyTag1[X1_C1, X1] ]
, TupleTag1[PropertyTag1[X1_C2, X1] ]
, TupleTag1[PropertyTag1[X1_C3, X1] ]
, TupleTag1[
PropertyTag3[ X1_C1 ,  X1_C2 ,  X1_C3 ,  X1]
]
] = {
new Merge3[
TupleTag1[PropertyTag1[X1_C1, X1] ]
, TupleTag1[PropertyTag1[X1_C2, X1] ]
, TupleTag1[PropertyTag1[X1_C3, X1] ]
, TupleTag1[
PropertyTag3[ X1_C1 ,  X1_C2 ,  X1_C3 ,  X1]
]
]
}
implicit def nodetag2_merge3_implicit[X1_C1 <: TupleTag  , X1_C2 <: TupleTag  , X1_C3 <: TupleTag    , X2_C1 <: TupleTag  , X2_C2 <: TupleTag  , X2_C3 <: TupleTag
, Target1 <: TupleTag  , Target2 <: TupleTag
]
(implicit
nodeTagImplicit1: Merge3[X1_C1  , X1_C2  , X1_C3  , Target1 ]
, nodeTagImplicit2: Merge3[X2_C1  , X2_C2  , X2_C3  , Target2 ]  ): Merge3[
NodeTag2[X1_C1  , X2_C1 ]
, NodeTag2[X1_C2  , X2_C2 ]
, NodeTag2[X1_C3  , X2_C3 ]
, NodeTag2[Target1  , Target2 ]
] = {
new Merge3[
NodeTag2[X1_C1  , X2_C1 ]
, NodeTag2[X1_C2  , X2_C2 ]
, NodeTag2[X1_C3  , X2_C3 ]
, NodeTag2[Target1  , Target2 ]
]
}
implicit def tupletag2_merge3_implicit[X1_C1  , X1_C2  , X1_C3    , X2_C1  , X2_C2  , X2_C3
, X1  , X2
]
: Merge3[
TupleTag2[PropertyTag1[X1_C1, X1]  , PropertyTag1[X2_C1, X2] ]
, TupleTag2[PropertyTag1[X1_C2, X1]  , PropertyTag1[X2_C2, X2] ]
, TupleTag2[PropertyTag1[X1_C3, X1]  , PropertyTag1[X2_C3, X2] ]
, TupleTag2[
PropertyTag3[ X1_C1 ,  X1_C2 ,  X1_C3 ,  X1]
, PropertyTag3[ X2_C1 ,  X2_C2 ,  X2_C3 ,  X2]
]
] = {
new Merge3[
TupleTag2[PropertyTag1[X1_C1, X1]  , PropertyTag1[X2_C1, X2] ]
, TupleTag2[PropertyTag1[X1_C2, X1]  , PropertyTag1[X2_C2, X2] ]
, TupleTag2[PropertyTag1[X1_C3, X1]  , PropertyTag1[X2_C3, X2] ]
, TupleTag2[
PropertyTag3[ X1_C1 ,  X1_C2 ,  X1_C3 ,  X1]
, PropertyTag3[ X2_C1 ,  X2_C2 ,  X2_C3 ,  X2]
]
]
}
implicit def nodetag3_merge3_implicit[X1_C1 <: TupleTag  , X1_C2 <: TupleTag  , X1_C3 <: TupleTag    , X2_C1 <: TupleTag  , X2_C2 <: TupleTag  , X2_C3 <: TupleTag    , X3_C1 <: TupleTag  , X3_C2 <: TupleTag  , X3_C3 <: TupleTag
, Target1 <: TupleTag  , Target2 <: TupleTag  , Target3 <: TupleTag
]
(implicit
nodeTagImplicit1: Merge3[X1_C1  , X1_C2  , X1_C3  , Target1 ]
, nodeTagImplicit2: Merge3[X2_C1  , X2_C2  , X2_C3  , Target2 ]  , nodeTagImplicit3: Merge3[X3_C1  , X3_C2  , X3_C3  , Target3 ]  ): Merge3[
NodeTag3[X1_C1  , X2_C1  , X3_C1 ]
, NodeTag3[X1_C2  , X2_C2  , X3_C2 ]
, NodeTag3[X1_C3  , X2_C3  , X3_C3 ]
, NodeTag3[Target1  , Target2  , Target3 ]
] = {
new Merge3[
NodeTag3[X1_C1  , X2_C1  , X3_C1 ]
, NodeTag3[X1_C2  , X2_C2  , X3_C2 ]
, NodeTag3[X1_C3  , X2_C3  , X3_C3 ]
, NodeTag3[Target1  , Target2  , Target3 ]
]
}
implicit def tupletag3_merge3_implicit[X1_C1  , X1_C2  , X1_C3    , X2_C1  , X2_C2  , X2_C3    , X3_C1  , X3_C2  , X3_C3
, X1  , X2  , X3
]
: Merge3[
TupleTag3[PropertyTag1[X1_C1, X1]  , PropertyTag1[X2_C1, X2]  , PropertyTag1[X3_C1, X3] ]
, TupleTag3[PropertyTag1[X1_C2, X1]  , PropertyTag1[X2_C2, X2]  , PropertyTag1[X3_C2, X3] ]
, TupleTag3[PropertyTag1[X1_C3, X1]  , PropertyTag1[X2_C3, X2]  , PropertyTag1[X3_C3, X3] ]
, TupleTag3[
PropertyTag3[ X1_C1 ,  X1_C2 ,  X1_C3 ,  X1]
, PropertyTag3[ X2_C1 ,  X2_C2 ,  X2_C3 ,  X2]  , PropertyTag3[ X3_C1 ,  X3_C2 ,  X3_C3 ,  X3]
]
] = {
new Merge3[
TupleTag3[PropertyTag1[X1_C1, X1]  , PropertyTag1[X2_C1, X2]  , PropertyTag1[X3_C1, X3] ]
, TupleTag3[PropertyTag1[X1_C2, X1]  , PropertyTag1[X2_C2, X2]  , PropertyTag1[X3_C2, X3] ]
, TupleTag3[PropertyTag1[X1_C3, X1]  , PropertyTag1[X2_C3, X2]  , PropertyTag1[X3_C3, X3] ]
, TupleTag3[
PropertyTag3[ X1_C1 ,  X1_C2 ,  X1_C3 ,  X1]
, PropertyTag3[ X2_C1 ,  X2_C2 ,  X2_C3 ,  X2]  , PropertyTag3[ X3_C1 ,  X3_C2 ,  X3_C3 ,  X3]
]
]
}
implicit def nodetag4_merge3_implicit[X1_C1 <: TupleTag  , X1_C2 <: TupleTag  , X1_C3 <: TupleTag    , X2_C1 <: TupleTag  , X2_C2 <: TupleTag  , X2_C3 <: TupleTag    , X3_C1 <: TupleTag  , X3_C2 <: TupleTag  , X3_C3 <: TupleTag    , X4_C1 <: TupleTag  , X4_C2 <: TupleTag  , X4_C3 <: TupleTag
, Target1 <: TupleTag  , Target2 <: TupleTag  , Target3 <: TupleTag  , Target4 <: TupleTag
]
(implicit
nodeTagImplicit1: Merge3[X1_C1  , X1_C2  , X1_C3  , Target1 ]
, nodeTagImplicit2: Merge3[X2_C1  , X2_C2  , X2_C3  , Target2 ]  , nodeTagImplicit3: Merge3[X3_C1  , X3_C2  , X3_C3  , Target3 ]  , nodeTagImplicit4: Merge3[X4_C1  , X4_C2  , X4_C3  , Target4 ]  ): Merge3[
NodeTag4[X1_C1  , X2_C1  , X3_C1  , X4_C1 ]
, NodeTag4[X1_C2  , X2_C2  , X3_C2  , X4_C2 ]
, NodeTag4[X1_C3  , X2_C3  , X3_C3  , X4_C3 ]
, NodeTag4[Target1  , Target2  , Target3  , Target4 ]
] = {
new Merge3[
NodeTag4[X1_C1  , X2_C1  , X3_C1  , X4_C1 ]
, NodeTag4[X1_C2  , X2_C2  , X3_C2  , X4_C2 ]
, NodeTag4[X1_C3  , X2_C3  , X3_C3  , X4_C3 ]
, NodeTag4[Target1  , Target2  , Target3  , Target4 ]
]
}
implicit def tupletag4_merge3_implicit[X1_C1  , X1_C2  , X1_C3    , X2_C1  , X2_C2  , X2_C3    , X3_C1  , X3_C2  , X3_C3    , X4_C1  , X4_C2  , X4_C3
, X1  , X2  , X3  , X4
]
: Merge3[
TupleTag4[PropertyTag1[X1_C1, X1]  , PropertyTag1[X2_C1, X2]  , PropertyTag1[X3_C1, X3]  , PropertyTag1[X4_C1, X4] ]
, TupleTag4[PropertyTag1[X1_C2, X1]  , PropertyTag1[X2_C2, X2]  , PropertyTag1[X3_C2, X3]  , PropertyTag1[X4_C2, X4] ]
, TupleTag4[PropertyTag1[X1_C3, X1]  , PropertyTag1[X2_C3, X2]  , PropertyTag1[X3_C3, X3]  , PropertyTag1[X4_C3, X4] ]
, TupleTag4[
PropertyTag3[ X1_C1 ,  X1_C2 ,  X1_C3 ,  X1]
, PropertyTag3[ X2_C1 ,  X2_C2 ,  X2_C3 ,  X2]  , PropertyTag3[ X3_C1 ,  X3_C2 ,  X3_C3 ,  X3]  , PropertyTag3[ X4_C1 ,  X4_C2 ,  X4_C3 ,  X4]
]
] = {
new Merge3[
TupleTag4[PropertyTag1[X1_C1, X1]  , PropertyTag1[X2_C1, X2]  , PropertyTag1[X3_C1, X3]  , PropertyTag1[X4_C1, X4] ]
, TupleTag4[PropertyTag1[X1_C2, X1]  , PropertyTag1[X2_C2, X2]  , PropertyTag1[X3_C2, X3]  , PropertyTag1[X4_C2, X4] ]
, TupleTag4[PropertyTag1[X1_C3, X1]  , PropertyTag1[X2_C3, X2]  , PropertyTag1[X3_C3, X3]  , PropertyTag1[X4_C3, X4] ]
, TupleTag4[
PropertyTag3[ X1_C1 ,  X1_C2 ,  X1_C3 ,  X1]
, PropertyTag3[ X2_C1 ,  X2_C2 ,  X2_C3 ,  X2]  , PropertyTag3[ X3_C1 ,  X3_C2 ,  X3_C3 ,  X3]  , PropertyTag3[ X4_C1 ,  X4_C2 ,  X4_C3 ,  X4]
]
]
}
implicit def nodetag5_merge3_implicit[X1_C1 <: TupleTag  , X1_C2 <: TupleTag  , X1_C3 <: TupleTag    , X2_C1 <: TupleTag  , X2_C2 <: TupleTag  , X2_C3 <: TupleTag    , X3_C1 <: TupleTag  , X3_C2 <: TupleTag  , X3_C3 <: TupleTag    , X4_C1 <: TupleTag  , X4_C2 <: TupleTag  , X4_C3 <: TupleTag    , X5_C1 <: TupleTag  , X5_C2 <: TupleTag  , X5_C3 <: TupleTag
, Target1 <: TupleTag  , Target2 <: TupleTag  , Target3 <: TupleTag  , Target4 <: TupleTag  , Target5 <: TupleTag
]
(implicit
nodeTagImplicit1: Merge3[X1_C1  , X1_C2  , X1_C3  , Target1 ]
, nodeTagImplicit2: Merge3[X2_C1  , X2_C2  , X2_C3  , Target2 ]  , nodeTagImplicit3: Merge3[X3_C1  , X3_C2  , X3_C3  , Target3 ]  , nodeTagImplicit4: Merge3[X4_C1  , X4_C2  , X4_C3  , Target4 ]  , nodeTagImplicit5: Merge3[X5_C1  , X5_C2  , X5_C3  , Target5 ]  ): Merge3[
NodeTag5[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1 ]
, NodeTag5[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2 ]
, NodeTag5[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3 ]
, NodeTag5[Target1  , Target2  , Target3  , Target4  , Target5 ]
] = {
new Merge3[
NodeTag5[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1 ]
, NodeTag5[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2 ]
, NodeTag5[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3 ]
, NodeTag5[Target1  , Target2  , Target3  , Target4  , Target5 ]
]
}
implicit def tupletag5_merge3_implicit[X1_C1  , X1_C2  , X1_C3    , X2_C1  , X2_C2  , X2_C3    , X3_C1  , X3_C2  , X3_C3    , X4_C1  , X4_C2  , X4_C3    , X5_C1  , X5_C2  , X5_C3
, X1  , X2  , X3  , X4  , X5
]
: Merge3[
TupleTag5[PropertyTag1[X1_C1, X1]  , PropertyTag1[X2_C1, X2]  , PropertyTag1[X3_C1, X3]  , PropertyTag1[X4_C1, X4]  , PropertyTag1[X5_C1, X5] ]
, TupleTag5[PropertyTag1[X1_C2, X1]  , PropertyTag1[X2_C2, X2]  , PropertyTag1[X3_C2, X3]  , PropertyTag1[X4_C2, X4]  , PropertyTag1[X5_C2, X5] ]
, TupleTag5[PropertyTag1[X1_C3, X1]  , PropertyTag1[X2_C3, X2]  , PropertyTag1[X3_C3, X3]  , PropertyTag1[X4_C3, X4]  , PropertyTag1[X5_C3, X5] ]
, TupleTag5[
PropertyTag3[ X1_C1 ,  X1_C2 ,  X1_C3 ,  X1]
, PropertyTag3[ X2_C1 ,  X2_C2 ,  X2_C3 ,  X2]  , PropertyTag3[ X3_C1 ,  X3_C2 ,  X3_C3 ,  X3]  , PropertyTag3[ X4_C1 ,  X4_C2 ,  X4_C3 ,  X4]  , PropertyTag3[ X5_C1 ,  X5_C2 ,  X5_C3 ,  X5]
]
] = {
new Merge3[
TupleTag5[PropertyTag1[X1_C1, X1]  , PropertyTag1[X2_C1, X2]  , PropertyTag1[X3_C1, X3]  , PropertyTag1[X4_C1, X4]  , PropertyTag1[X5_C1, X5] ]
, TupleTag5[PropertyTag1[X1_C2, X1]  , PropertyTag1[X2_C2, X2]  , PropertyTag1[X3_C2, X3]  , PropertyTag1[X4_C2, X4]  , PropertyTag1[X5_C2, X5] ]
, TupleTag5[PropertyTag1[X1_C3, X1]  , PropertyTag1[X2_C3, X2]  , PropertyTag1[X3_C3, X3]  , PropertyTag1[X4_C3, X4]  , PropertyTag1[X5_C3, X5] ]
, TupleTag5[
PropertyTag3[ X1_C1 ,  X1_C2 ,  X1_C3 ,  X1]
, PropertyTag3[ X2_C1 ,  X2_C2 ,  X2_C3 ,  X2]  , PropertyTag3[ X3_C1 ,  X3_C2 ,  X3_C3 ,  X3]  , PropertyTag3[ X4_C1 ,  X4_C2 ,  X4_C3 ,  X4]  , PropertyTag3[ X5_C1 ,  X5_C2 ,  X5_C3 ,  X5]
]
]
}
implicit def nodetag6_merge3_implicit[X1_C1 <: TupleTag  , X1_C2 <: TupleTag  , X1_C3 <: TupleTag    , X2_C1 <: TupleTag  , X2_C2 <: TupleTag  , X2_C3 <: TupleTag    , X3_C1 <: TupleTag  , X3_C2 <: TupleTag  , X3_C3 <: TupleTag    , X4_C1 <: TupleTag  , X4_C2 <: TupleTag  , X4_C3 <: TupleTag    , X5_C1 <: TupleTag  , X5_C2 <: TupleTag  , X5_C3 <: TupleTag    , X6_C1 <: TupleTag  , X6_C2 <: TupleTag  , X6_C3 <: TupleTag
, Target1 <: TupleTag  , Target2 <: TupleTag  , Target3 <: TupleTag  , Target4 <: TupleTag  , Target5 <: TupleTag  , Target6 <: TupleTag
]
(implicit
nodeTagImplicit1: Merge3[X1_C1  , X1_C2  , X1_C3  , Target1 ]
, nodeTagImplicit2: Merge3[X2_C1  , X2_C2  , X2_C3  , Target2 ]  , nodeTagImplicit3: Merge3[X3_C1  , X3_C2  , X3_C3  , Target3 ]  , nodeTagImplicit4: Merge3[X4_C1  , X4_C2  , X4_C3  , Target4 ]  , nodeTagImplicit5: Merge3[X5_C1  , X5_C2  , X5_C3  , Target5 ]  , nodeTagImplicit6: Merge3[X6_C1  , X6_C2  , X6_C3  , Target6 ]  ): Merge3[
NodeTag6[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1 ]
, NodeTag6[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2 ]
, NodeTag6[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3 ]
, NodeTag6[Target1  , Target2  , Target3  , Target4  , Target5  , Target6 ]
] = {
new Merge3[
NodeTag6[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1 ]
, NodeTag6[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2 ]
, NodeTag6[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3 ]
, NodeTag6[Target1  , Target2  , Target3  , Target4  , Target5  , Target6 ]
]
}
implicit def tupletag6_merge3_implicit[X1_C1  , X1_C2  , X1_C3    , X2_C1  , X2_C2  , X2_C3    , X3_C1  , X3_C2  , X3_C3    , X4_C1  , X4_C2  , X4_C3    , X5_C1  , X5_C2  , X5_C3    , X6_C1  , X6_C2  , X6_C3
, X1  , X2  , X3  , X4  , X5  , X6
]
: Merge3[
TupleTag6[PropertyTag1[X1_C1, X1]  , PropertyTag1[X2_C1, X2]  , PropertyTag1[X3_C1, X3]  , PropertyTag1[X4_C1, X4]  , PropertyTag1[X5_C1, X5]  , PropertyTag1[X6_C1, X6] ]
, TupleTag6[PropertyTag1[X1_C2, X1]  , PropertyTag1[X2_C2, X2]  , PropertyTag1[X3_C2, X3]  , PropertyTag1[X4_C2, X4]  , PropertyTag1[X5_C2, X5]  , PropertyTag1[X6_C2, X6] ]
, TupleTag6[PropertyTag1[X1_C3, X1]  , PropertyTag1[X2_C3, X2]  , PropertyTag1[X3_C3, X3]  , PropertyTag1[X4_C3, X4]  , PropertyTag1[X5_C3, X5]  , PropertyTag1[X6_C3, X6] ]
, TupleTag6[
PropertyTag3[ X1_C1 ,  X1_C2 ,  X1_C3 ,  X1]
, PropertyTag3[ X2_C1 ,  X2_C2 ,  X2_C3 ,  X2]  , PropertyTag3[ X3_C1 ,  X3_C2 ,  X3_C3 ,  X3]  , PropertyTag3[ X4_C1 ,  X4_C2 ,  X4_C3 ,  X4]  , PropertyTag3[ X5_C1 ,  X5_C2 ,  X5_C3 ,  X5]  , PropertyTag3[ X6_C1 ,  X6_C2 ,  X6_C3 ,  X6]
]
] = {
new Merge3[
TupleTag6[PropertyTag1[X1_C1, X1]  , PropertyTag1[X2_C1, X2]  , PropertyTag1[X3_C1, X3]  , PropertyTag1[X4_C1, X4]  , PropertyTag1[X5_C1, X5]  , PropertyTag1[X6_C1, X6] ]
, TupleTag6[PropertyTag1[X1_C2, X1]  , PropertyTag1[X2_C2, X2]  , PropertyTag1[X3_C2, X3]  , PropertyTag1[X4_C2, X4]  , PropertyTag1[X5_C2, X5]  , PropertyTag1[X6_C2, X6] ]
, TupleTag6[PropertyTag1[X1_C3, X1]  , PropertyTag1[X2_C3, X2]  , PropertyTag1[X3_C3, X3]  , PropertyTag1[X4_C3, X4]  , PropertyTag1[X5_C3, X5]  , PropertyTag1[X6_C3, X6] ]
, TupleTag6[
PropertyTag3[ X1_C1 ,  X1_C2 ,  X1_C3 ,  X1]
, PropertyTag3[ X2_C1 ,  X2_C2 ,  X2_C3 ,  X2]  , PropertyTag3[ X3_C1 ,  X3_C2 ,  X3_C3 ,  X3]  , PropertyTag3[ X4_C1 ,  X4_C2 ,  X4_C3 ,  X4]  , PropertyTag3[ X5_C1 ,  X5_C2 ,  X5_C3 ,  X5]  , PropertyTag3[ X6_C1 ,  X6_C2 ,  X6_C3 ,  X6]
]
]
}
implicit def nodetag7_merge3_implicit[X1_C1 <: TupleTag  , X1_C2 <: TupleTag  , X1_C3 <: TupleTag    , X2_C1 <: TupleTag  , X2_C2 <: TupleTag  , X2_C3 <: TupleTag    , X3_C1 <: TupleTag  , X3_C2 <: TupleTag  , X3_C3 <: TupleTag    , X4_C1 <: TupleTag  , X4_C2 <: TupleTag  , X4_C3 <: TupleTag    , X5_C1 <: TupleTag  , X5_C2 <: TupleTag  , X5_C3 <: TupleTag    , X6_C1 <: TupleTag  , X6_C2 <: TupleTag  , X6_C3 <: TupleTag    , X7_C1 <: TupleTag  , X7_C2 <: TupleTag  , X7_C3 <: TupleTag
, Target1 <: TupleTag  , Target2 <: TupleTag  , Target3 <: TupleTag  , Target4 <: TupleTag  , Target5 <: TupleTag  , Target6 <: TupleTag  , Target7 <: TupleTag
]
(implicit
nodeTagImplicit1: Merge3[X1_C1  , X1_C2  , X1_C3  , Target1 ]
, nodeTagImplicit2: Merge3[X2_C1  , X2_C2  , X2_C3  , Target2 ]  , nodeTagImplicit3: Merge3[X3_C1  , X3_C2  , X3_C3  , Target3 ]  , nodeTagImplicit4: Merge3[X4_C1  , X4_C2  , X4_C3  , Target4 ]  , nodeTagImplicit5: Merge3[X5_C1  , X5_C2  , X5_C3  , Target5 ]  , nodeTagImplicit6: Merge3[X6_C1  , X6_C2  , X6_C3  , Target6 ]  , nodeTagImplicit7: Merge3[X7_C1  , X7_C2  , X7_C3  , Target7 ]  ): Merge3[
NodeTag7[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1  , X7_C1 ]
, NodeTag7[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2  , X7_C2 ]
, NodeTag7[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3  , X7_C3 ]
, NodeTag7[Target1  , Target2  , Target3  , Target4  , Target5  , Target6  , Target7 ]
] = {
new Merge3[
NodeTag7[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1  , X7_C1 ]
, NodeTag7[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2  , X7_C2 ]
, NodeTag7[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3  , X7_C3 ]
, NodeTag7[Target1  , Target2  , Target3  , Target4  , Target5  , Target6  , Target7 ]
]
}
implicit def tupletag7_merge3_implicit[X1_C1  , X1_C2  , X1_C3    , X2_C1  , X2_C2  , X2_C3    , X3_C1  , X3_C2  , X3_C3    , X4_C1  , X4_C2  , X4_C3    , X5_C1  , X5_C2  , X5_C3    , X6_C1  , X6_C2  , X6_C3    , X7_C1  , X7_C2  , X7_C3
, X1  , X2  , X3  , X4  , X5  , X6  , X7
]
: Merge3[
TupleTag7[PropertyTag1[X1_C1, X1]  , PropertyTag1[X2_C1, X2]  , PropertyTag1[X3_C1, X3]  , PropertyTag1[X4_C1, X4]  , PropertyTag1[X5_C1, X5]  , PropertyTag1[X6_C1, X6]  , PropertyTag1[X7_C1, X7] ]
, TupleTag7[PropertyTag1[X1_C2, X1]  , PropertyTag1[X2_C2, X2]  , PropertyTag1[X3_C2, X3]  , PropertyTag1[X4_C2, X4]  , PropertyTag1[X5_C2, X5]  , PropertyTag1[X6_C2, X6]  , PropertyTag1[X7_C2, X7] ]
, TupleTag7[PropertyTag1[X1_C3, X1]  , PropertyTag1[X2_C3, X2]  , PropertyTag1[X3_C3, X3]  , PropertyTag1[X4_C3, X4]  , PropertyTag1[X5_C3, X5]  , PropertyTag1[X6_C3, X6]  , PropertyTag1[X7_C3, X7] ]
, TupleTag7[
PropertyTag3[ X1_C1 ,  X1_C2 ,  X1_C3 ,  X1]
, PropertyTag3[ X2_C1 ,  X2_C2 ,  X2_C3 ,  X2]  , PropertyTag3[ X3_C1 ,  X3_C2 ,  X3_C3 ,  X3]  , PropertyTag3[ X4_C1 ,  X4_C2 ,  X4_C3 ,  X4]  , PropertyTag3[ X5_C1 ,  X5_C2 ,  X5_C3 ,  X5]  , PropertyTag3[ X6_C1 ,  X6_C2 ,  X6_C3 ,  X6]  , PropertyTag3[ X7_C1 ,  X7_C2 ,  X7_C3 ,  X7]
]
] = {
new Merge3[
TupleTag7[PropertyTag1[X1_C1, X1]  , PropertyTag1[X2_C1, X2]  , PropertyTag1[X3_C1, X3]  , PropertyTag1[X4_C1, X4]  , PropertyTag1[X5_C1, X5]  , PropertyTag1[X6_C1, X6]  , PropertyTag1[X7_C1, X7] ]
, TupleTag7[PropertyTag1[X1_C2, X1]  , PropertyTag1[X2_C2, X2]  , PropertyTag1[X3_C2, X3]  , PropertyTag1[X4_C2, X4]  , PropertyTag1[X5_C2, X5]  , PropertyTag1[X6_C2, X6]  , PropertyTag1[X7_C2, X7] ]
, TupleTag7[PropertyTag1[X1_C3, X1]  , PropertyTag1[X2_C3, X2]  , PropertyTag1[X3_C3, X3]  , PropertyTag1[X4_C3, X4]  , PropertyTag1[X5_C3, X5]  , PropertyTag1[X6_C3, X6]  , PropertyTag1[X7_C3, X7] ]
, TupleTag7[
PropertyTag3[ X1_C1 ,  X1_C2 ,  X1_C3 ,  X1]
, PropertyTag3[ X2_C1 ,  X2_C2 ,  X2_C3 ,  X2]  , PropertyTag3[ X3_C1 ,  X3_C2 ,  X3_C3 ,  X3]  , PropertyTag3[ X4_C1 ,  X4_C2 ,  X4_C3 ,  X4]  , PropertyTag3[ X5_C1 ,  X5_C2 ,  X5_C3 ,  X5]  , PropertyTag3[ X6_C1 ,  X6_C2 ,  X6_C3 ,  X6]  , PropertyTag3[ X7_C1 ,  X7_C2 ,  X7_C3 ,  X7]
]
]
}
implicit def nodetag8_merge3_implicit[X1_C1 <: TupleTag  , X1_C2 <: TupleTag  , X1_C3 <: TupleTag    , X2_C1 <: TupleTag  , X2_C2 <: TupleTag  , X2_C3 <: TupleTag    , X3_C1 <: TupleTag  , X3_C2 <: TupleTag  , X3_C3 <: TupleTag    , X4_C1 <: TupleTag  , X4_C2 <: TupleTag  , X4_C3 <: TupleTag    , X5_C1 <: TupleTag  , X5_C2 <: TupleTag  , X5_C3 <: TupleTag    , X6_C1 <: TupleTag  , X6_C2 <: TupleTag  , X6_C3 <: TupleTag    , X7_C1 <: TupleTag  , X7_C2 <: TupleTag  , X7_C3 <: TupleTag    , X8_C1 <: TupleTag  , X8_C2 <: TupleTag  , X8_C3 <: TupleTag
, Target1 <: TupleTag  , Target2 <: TupleTag  , Target3 <: TupleTag  , Target4 <: TupleTag  , Target5 <: TupleTag  , Target6 <: TupleTag  , Target7 <: TupleTag  , Target8 <: TupleTag
]
(implicit
nodeTagImplicit1: Merge3[X1_C1  , X1_C2  , X1_C3  , Target1 ]
, nodeTagImplicit2: Merge3[X2_C1  , X2_C2  , X2_C3  , Target2 ]  , nodeTagImplicit3: Merge3[X3_C1  , X3_C2  , X3_C3  , Target3 ]  , nodeTagImplicit4: Merge3[X4_C1  , X4_C2  , X4_C3  , Target4 ]  , nodeTagImplicit5: Merge3[X5_C1  , X5_C2  , X5_C3  , Target5 ]  , nodeTagImplicit6: Merge3[X6_C1  , X6_C2  , X6_C3  , Target6 ]  , nodeTagImplicit7: Merge3[X7_C1  , X7_C2  , X7_C3  , Target7 ]  , nodeTagImplicit8: Merge3[X8_C1  , X8_C2  , X8_C3  , Target8 ]  ): Merge3[
NodeTag8[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1  , X7_C1  , X8_C1 ]
, NodeTag8[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2  , X7_C2  , X8_C2 ]
, NodeTag8[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3  , X7_C3  , X8_C3 ]
, NodeTag8[Target1  , Target2  , Target3  , Target4  , Target5  , Target6  , Target7  , Target8 ]
] = {
new Merge3[
NodeTag8[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1  , X7_C1  , X8_C1 ]
, NodeTag8[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2  , X7_C2  , X8_C2 ]
, NodeTag8[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3  , X7_C3  , X8_C3 ]
, NodeTag8[Target1  , Target2  , Target3  , Target4  , Target5  , Target6  , Target7  , Target8 ]
]
}
implicit def tupletag8_merge3_implicit[X1_C1  , X1_C2  , X1_C3    , X2_C1  , X2_C2  , X2_C3    , X3_C1  , X3_C2  , X3_C3    , X4_C1  , X4_C2  , X4_C3    , X5_C1  , X5_C2  , X5_C3    , X6_C1  , X6_C2  , X6_C3    , X7_C1  , X7_C2  , X7_C3    , X8_C1  , X8_C2  , X8_C3
, X1  , X2  , X3  , X4  , X5  , X6  , X7  , X8
]
: Merge3[
TupleTag8[PropertyTag1[X1_C1, X1]  , PropertyTag1[X2_C1, X2]  , PropertyTag1[X3_C1, X3]  , PropertyTag1[X4_C1, X4]  , PropertyTag1[X5_C1, X5]  , PropertyTag1[X6_C1, X6]  , PropertyTag1[X7_C1, X7]  , PropertyTag1[X8_C1, X8] ]
, TupleTag8[PropertyTag1[X1_C2, X1]  , PropertyTag1[X2_C2, X2]  , PropertyTag1[X3_C2, X3]  , PropertyTag1[X4_C2, X4]  , PropertyTag1[X5_C2, X5]  , PropertyTag1[X6_C2, X6]  , PropertyTag1[X7_C2, X7]  , PropertyTag1[X8_C2, X8] ]
, TupleTag8[PropertyTag1[X1_C3, X1]  , PropertyTag1[X2_C3, X2]  , PropertyTag1[X3_C3, X3]  , PropertyTag1[X4_C3, X4]  , PropertyTag1[X5_C3, X5]  , PropertyTag1[X6_C3, X6]  , PropertyTag1[X7_C3, X7]  , PropertyTag1[X8_C3, X8] ]
, TupleTag8[
PropertyTag3[ X1_C1 ,  X1_C2 ,  X1_C3 ,  X1]
, PropertyTag3[ X2_C1 ,  X2_C2 ,  X2_C3 ,  X2]  , PropertyTag3[ X3_C1 ,  X3_C2 ,  X3_C3 ,  X3]  , PropertyTag3[ X4_C1 ,  X4_C2 ,  X4_C3 ,  X4]  , PropertyTag3[ X5_C1 ,  X5_C2 ,  X5_C3 ,  X5]  , PropertyTag3[ X6_C1 ,  X6_C2 ,  X6_C3 ,  X6]  , PropertyTag3[ X7_C1 ,  X7_C2 ,  X7_C3 ,  X7]  , PropertyTag3[ X8_C1 ,  X8_C2 ,  X8_C3 ,  X8]
]
] = {
new Merge3[
TupleTag8[PropertyTag1[X1_C1, X1]  , PropertyTag1[X2_C1, X2]  , PropertyTag1[X3_C1, X3]  , PropertyTag1[X4_C1, X4]  , PropertyTag1[X5_C1, X5]  , PropertyTag1[X6_C1, X6]  , PropertyTag1[X7_C1, X7]  , PropertyTag1[X8_C1, X8] ]
, TupleTag8[PropertyTag1[X1_C2, X1]  , PropertyTag1[X2_C2, X2]  , PropertyTag1[X3_C2, X3]  , PropertyTag1[X4_C2, X4]  , PropertyTag1[X5_C2, X5]  , PropertyTag1[X6_C2, X6]  , PropertyTag1[X7_C2, X7]  , PropertyTag1[X8_C2, X8] ]
, TupleTag8[PropertyTag1[X1_C3, X1]  , PropertyTag1[X2_C3, X2]  , PropertyTag1[X3_C3, X3]  , PropertyTag1[X4_C3, X4]  , PropertyTag1[X5_C3, X5]  , PropertyTag1[X6_C3, X6]  , PropertyTag1[X7_C3, X7]  , PropertyTag1[X8_C3, X8] ]
, TupleTag8[
PropertyTag3[ X1_C1 ,  X1_C2 ,  X1_C3 ,  X1]
, PropertyTag3[ X2_C1 ,  X2_C2 ,  X2_C3 ,  X2]  , PropertyTag3[ X3_C1 ,  X3_C2 ,  X3_C3 ,  X3]  , PropertyTag3[ X4_C1 ,  X4_C2 ,  X4_C3 ,  X4]  , PropertyTag3[ X5_C1 ,  X5_C2 ,  X5_C3 ,  X5]  , PropertyTag3[ X6_C1 ,  X6_C2 ,  X6_C3 ,  X6]  , PropertyTag3[ X7_C1 ,  X7_C2 ,  X7_C3 ,  X7]  , PropertyTag3[ X8_C1 ,  X8_C2 ,  X8_C3 ,  X8]
]
]
}
}
