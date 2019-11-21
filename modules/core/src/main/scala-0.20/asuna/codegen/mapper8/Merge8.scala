package asuna
class Merge8[I1 <: TupleTag  , I2 <: TupleTag  , I3 <: TupleTag  , I4 <: TupleTag  , I5 <: TupleTag  , I6 <: TupleTag  , I7 <: TupleTag  , I8 <: TupleTag  , Target <: TupleTag]
object Merge8 {
given nodetag1_merge8_implicit[X1_C1 <: TupleTag  , X1_C2 <: TupleTag  , X1_C3 <: TupleTag  , X1_C4 <: TupleTag  , X1_C5 <: TupleTag  , X1_C6 <: TupleTag  , X1_C7 <: TupleTag  , X1_C8 <: TupleTag
, Target1 <: TupleTag ](given
nodeTagImplicit1: Merge8[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8  , Target1]
): Merge8[
NodeTag1[X1_C1 ]
, NodeTag1[X1_C2 ]
, NodeTag1[X1_C3 ]
, NodeTag1[X1_C4 ]
, NodeTag1[X1_C5 ]
, NodeTag1[X1_C6 ]
, NodeTag1[X1_C7 ]
, NodeTag1[X1_C8 ]
, NodeTag1[Target1 ]
] = {
new Merge8[
NodeTag1[X1_C1 ]
, NodeTag1[X1_C2 ]
, NodeTag1[X1_C3 ]
, NodeTag1[X1_C4 ]
, NodeTag1[X1_C5 ]
, NodeTag1[X1_C6 ]
, NodeTag1[X1_C7 ]
, NodeTag1[X1_C8 ]
, NodeTag1[Target1 ]
]
}
given tupletag1_merge8_implicit[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8  ]
: Merge8[
TupleTag1[X1_C1 ]
, TupleTag1[X1_C2 ]
, TupleTag1[X1_C3 ]
, TupleTag1[X1_C4 ]
, TupleTag1[X1_C5 ]
, TupleTag1[X1_C6 ]
, TupleTag1[X1_C7 ]
, TupleTag1[X1_C8 ]
, TupleTag1[
MergeProperty8[X1_C1
, X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8 ]
]
] = {
new Merge8[
TupleTag1[X1_C1 ]
, TupleTag1[X1_C2 ]
, TupleTag1[X1_C3 ]
, TupleTag1[X1_C4 ]
, TupleTag1[X1_C5 ]
, TupleTag1[X1_C6 ]
, TupleTag1[X1_C7 ]
, TupleTag1[X1_C8 ]
, TupleTag1[
MergeProperty8[X1_C1
, X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8 ]
]
]
}
given nodetag2_merge8_implicit[X1_C1 <: TupleTag  , X1_C2 <: TupleTag  , X1_C3 <: TupleTag  , X1_C4 <: TupleTag  , X1_C5 <: TupleTag  , X1_C6 <: TupleTag  , X1_C7 <: TupleTag  , X1_C8 <: TupleTag    , X2_C1 <: TupleTag  , X2_C2 <: TupleTag  , X2_C3 <: TupleTag  , X2_C4 <: TupleTag  , X2_C5 <: TupleTag  , X2_C6 <: TupleTag  , X2_C7 <: TupleTag  , X2_C8 <: TupleTag
, Target1 <: TupleTag  , Target2 <: TupleTag ](given
nodeTagImplicit1: Merge8[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8  , Target1]
, nodeTagImplicit2: Merge8[X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  , X2_C8  , Target2 ]  ): Merge8[
NodeTag2[X1_C1  , X2_C1 ]
, NodeTag2[X1_C2  , X2_C2 ]
, NodeTag2[X1_C3  , X2_C3 ]
, NodeTag2[X1_C4  , X2_C4 ]
, NodeTag2[X1_C5  , X2_C5 ]
, NodeTag2[X1_C6  , X2_C6 ]
, NodeTag2[X1_C7  , X2_C7 ]
, NodeTag2[X1_C8  , X2_C8 ]
, NodeTag2[Target1  , Target2 ]
] = {
new Merge8[
NodeTag2[X1_C1  , X2_C1 ]
, NodeTag2[X1_C2  , X2_C2 ]
, NodeTag2[X1_C3  , X2_C3 ]
, NodeTag2[X1_C4  , X2_C4 ]
, NodeTag2[X1_C5  , X2_C5 ]
, NodeTag2[X1_C6  , X2_C6 ]
, NodeTag2[X1_C7  , X2_C7 ]
, NodeTag2[X1_C8  , X2_C8 ]
, NodeTag2[Target1  , Target2 ]
]
}
given tupletag2_merge8_implicit[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8    , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  , X2_C8  ]
: Merge8[
TupleTag2[X1_C1  , X2_C1 ]
, TupleTag2[X1_C2  , X2_C2 ]
, TupleTag2[X1_C3  , X2_C3 ]
, TupleTag2[X1_C4  , X2_C4 ]
, TupleTag2[X1_C5  , X2_C5 ]
, TupleTag2[X1_C6  , X2_C6 ]
, TupleTag2[X1_C7  , X2_C7 ]
, TupleTag2[X1_C8  , X2_C8 ]
, TupleTag2[
MergeProperty8[X1_C1
, X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8 ]
, MergeProperty8[X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  , X2_C8 ]
]
] = {
new Merge8[
TupleTag2[X1_C1  , X2_C1 ]
, TupleTag2[X1_C2  , X2_C2 ]
, TupleTag2[X1_C3  , X2_C3 ]
, TupleTag2[X1_C4  , X2_C4 ]
, TupleTag2[X1_C5  , X2_C5 ]
, TupleTag2[X1_C6  , X2_C6 ]
, TupleTag2[X1_C7  , X2_C7 ]
, TupleTag2[X1_C8  , X2_C8 ]
, TupleTag2[
MergeProperty8[X1_C1
, X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8 ]
, MergeProperty8[X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  , X2_C8 ]
]
]
}
given nodetag3_merge8_implicit[X1_C1 <: TupleTag  , X1_C2 <: TupleTag  , X1_C3 <: TupleTag  , X1_C4 <: TupleTag  , X1_C5 <: TupleTag  , X1_C6 <: TupleTag  , X1_C7 <: TupleTag  , X1_C8 <: TupleTag    , X2_C1 <: TupleTag  , X2_C2 <: TupleTag  , X2_C3 <: TupleTag  , X2_C4 <: TupleTag  , X2_C5 <: TupleTag  , X2_C6 <: TupleTag  , X2_C7 <: TupleTag  , X2_C8 <: TupleTag    , X3_C1 <: TupleTag  , X3_C2 <: TupleTag  , X3_C3 <: TupleTag  , X3_C4 <: TupleTag  , X3_C5 <: TupleTag  , X3_C6 <: TupleTag  , X3_C7 <: TupleTag  , X3_C8 <: TupleTag
, Target1 <: TupleTag  , Target2 <: TupleTag  , Target3 <: TupleTag ](given
nodeTagImplicit1: Merge8[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8  , Target1]
, nodeTagImplicit2: Merge8[X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  , X2_C8  , Target2 ]  , nodeTagImplicit3: Merge8[X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7  , X3_C8  , Target3 ]  ): Merge8[
NodeTag3[X1_C1  , X2_C1  , X3_C1 ]
, NodeTag3[X1_C2  , X2_C2  , X3_C2 ]
, NodeTag3[X1_C3  , X2_C3  , X3_C3 ]
, NodeTag3[X1_C4  , X2_C4  , X3_C4 ]
, NodeTag3[X1_C5  , X2_C5  , X3_C5 ]
, NodeTag3[X1_C6  , X2_C6  , X3_C6 ]
, NodeTag3[X1_C7  , X2_C7  , X3_C7 ]
, NodeTag3[X1_C8  , X2_C8  , X3_C8 ]
, NodeTag3[Target1  , Target2  , Target3 ]
] = {
new Merge8[
NodeTag3[X1_C1  , X2_C1  , X3_C1 ]
, NodeTag3[X1_C2  , X2_C2  , X3_C2 ]
, NodeTag3[X1_C3  , X2_C3  , X3_C3 ]
, NodeTag3[X1_C4  , X2_C4  , X3_C4 ]
, NodeTag3[X1_C5  , X2_C5  , X3_C5 ]
, NodeTag3[X1_C6  , X2_C6  , X3_C6 ]
, NodeTag3[X1_C7  , X2_C7  , X3_C7 ]
, NodeTag3[X1_C8  , X2_C8  , X3_C8 ]
, NodeTag3[Target1  , Target2  , Target3 ]
]
}
given tupletag3_merge8_implicit[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8    , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  , X2_C8    , X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7  , X3_C8  ]
: Merge8[
TupleTag3[X1_C1  , X2_C1  , X3_C1 ]
, TupleTag3[X1_C2  , X2_C2  , X3_C2 ]
, TupleTag3[X1_C3  , X2_C3  , X3_C3 ]
, TupleTag3[X1_C4  , X2_C4  , X3_C4 ]
, TupleTag3[X1_C5  , X2_C5  , X3_C5 ]
, TupleTag3[X1_C6  , X2_C6  , X3_C6 ]
, TupleTag3[X1_C7  , X2_C7  , X3_C7 ]
, TupleTag3[X1_C8  , X2_C8  , X3_C8 ]
, TupleTag3[
MergeProperty8[X1_C1
, X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8 ]
, MergeProperty8[X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  , X2_C8 ]  , MergeProperty8[X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7  , X3_C8 ]
]
] = {
new Merge8[
TupleTag3[X1_C1  , X2_C1  , X3_C1 ]
, TupleTag3[X1_C2  , X2_C2  , X3_C2 ]
, TupleTag3[X1_C3  , X2_C3  , X3_C3 ]
, TupleTag3[X1_C4  , X2_C4  , X3_C4 ]
, TupleTag3[X1_C5  , X2_C5  , X3_C5 ]
, TupleTag3[X1_C6  , X2_C6  , X3_C6 ]
, TupleTag3[X1_C7  , X2_C7  , X3_C7 ]
, TupleTag3[X1_C8  , X2_C8  , X3_C8 ]
, TupleTag3[
MergeProperty8[X1_C1
, X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8 ]
, MergeProperty8[X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  , X2_C8 ]  , MergeProperty8[X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7  , X3_C8 ]
]
]
}
given nodetag4_merge8_implicit[X1_C1 <: TupleTag  , X1_C2 <: TupleTag  , X1_C3 <: TupleTag  , X1_C4 <: TupleTag  , X1_C5 <: TupleTag  , X1_C6 <: TupleTag  , X1_C7 <: TupleTag  , X1_C8 <: TupleTag    , X2_C1 <: TupleTag  , X2_C2 <: TupleTag  , X2_C3 <: TupleTag  , X2_C4 <: TupleTag  , X2_C5 <: TupleTag  , X2_C6 <: TupleTag  , X2_C7 <: TupleTag  , X2_C8 <: TupleTag    , X3_C1 <: TupleTag  , X3_C2 <: TupleTag  , X3_C3 <: TupleTag  , X3_C4 <: TupleTag  , X3_C5 <: TupleTag  , X3_C6 <: TupleTag  , X3_C7 <: TupleTag  , X3_C8 <: TupleTag    , X4_C1 <: TupleTag  , X4_C2 <: TupleTag  , X4_C3 <: TupleTag  , X4_C4 <: TupleTag  , X4_C5 <: TupleTag  , X4_C6 <: TupleTag  , X4_C7 <: TupleTag  , X4_C8 <: TupleTag
, Target1 <: TupleTag  , Target2 <: TupleTag  , Target3 <: TupleTag  , Target4 <: TupleTag ](given
nodeTagImplicit1: Merge8[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8  , Target1]
, nodeTagImplicit2: Merge8[X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  , X2_C8  , Target2 ]  , nodeTagImplicit3: Merge8[X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7  , X3_C8  , Target3 ]  , nodeTagImplicit4: Merge8[X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6  , X4_C7  , X4_C8  , Target4 ]  ): Merge8[
NodeTag4[X1_C1  , X2_C1  , X3_C1  , X4_C1 ]
, NodeTag4[X1_C2  , X2_C2  , X3_C2  , X4_C2 ]
, NodeTag4[X1_C3  , X2_C3  , X3_C3  , X4_C3 ]
, NodeTag4[X1_C4  , X2_C4  , X3_C4  , X4_C4 ]
, NodeTag4[X1_C5  , X2_C5  , X3_C5  , X4_C5 ]
, NodeTag4[X1_C6  , X2_C6  , X3_C6  , X4_C6 ]
, NodeTag4[X1_C7  , X2_C7  , X3_C7  , X4_C7 ]
, NodeTag4[X1_C8  , X2_C8  , X3_C8  , X4_C8 ]
, NodeTag4[Target1  , Target2  , Target3  , Target4 ]
] = {
new Merge8[
NodeTag4[X1_C1  , X2_C1  , X3_C1  , X4_C1 ]
, NodeTag4[X1_C2  , X2_C2  , X3_C2  , X4_C2 ]
, NodeTag4[X1_C3  , X2_C3  , X3_C3  , X4_C3 ]
, NodeTag4[X1_C4  , X2_C4  , X3_C4  , X4_C4 ]
, NodeTag4[X1_C5  , X2_C5  , X3_C5  , X4_C5 ]
, NodeTag4[X1_C6  , X2_C6  , X3_C6  , X4_C6 ]
, NodeTag4[X1_C7  , X2_C7  , X3_C7  , X4_C7 ]
, NodeTag4[X1_C8  , X2_C8  , X3_C8  , X4_C8 ]
, NodeTag4[Target1  , Target2  , Target3  , Target4 ]
]
}
given tupletag4_merge8_implicit[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8    , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  , X2_C8    , X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7  , X3_C8    , X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6  , X4_C7  , X4_C8  ]
: Merge8[
TupleTag4[X1_C1  , X2_C1  , X3_C1  , X4_C1 ]
, TupleTag4[X1_C2  , X2_C2  , X3_C2  , X4_C2 ]
, TupleTag4[X1_C3  , X2_C3  , X3_C3  , X4_C3 ]
, TupleTag4[X1_C4  , X2_C4  , X3_C4  , X4_C4 ]
, TupleTag4[X1_C5  , X2_C5  , X3_C5  , X4_C5 ]
, TupleTag4[X1_C6  , X2_C6  , X3_C6  , X4_C6 ]
, TupleTag4[X1_C7  , X2_C7  , X3_C7  , X4_C7 ]
, TupleTag4[X1_C8  , X2_C8  , X3_C8  , X4_C8 ]
, TupleTag4[
MergeProperty8[X1_C1
, X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8 ]
, MergeProperty8[X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  , X2_C8 ]  , MergeProperty8[X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7  , X3_C8 ]  , MergeProperty8[X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6  , X4_C7  , X4_C8 ]
]
] = {
new Merge8[
TupleTag4[X1_C1  , X2_C1  , X3_C1  , X4_C1 ]
, TupleTag4[X1_C2  , X2_C2  , X3_C2  , X4_C2 ]
, TupleTag4[X1_C3  , X2_C3  , X3_C3  , X4_C3 ]
, TupleTag4[X1_C4  , X2_C4  , X3_C4  , X4_C4 ]
, TupleTag4[X1_C5  , X2_C5  , X3_C5  , X4_C5 ]
, TupleTag4[X1_C6  , X2_C6  , X3_C6  , X4_C6 ]
, TupleTag4[X1_C7  , X2_C7  , X3_C7  , X4_C7 ]
, TupleTag4[X1_C8  , X2_C8  , X3_C8  , X4_C8 ]
, TupleTag4[
MergeProperty8[X1_C1
, X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8 ]
, MergeProperty8[X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  , X2_C8 ]  , MergeProperty8[X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7  , X3_C8 ]  , MergeProperty8[X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6  , X4_C7  , X4_C8 ]
]
]
}
given nodetag5_merge8_implicit[X1_C1 <: TupleTag  , X1_C2 <: TupleTag  , X1_C3 <: TupleTag  , X1_C4 <: TupleTag  , X1_C5 <: TupleTag  , X1_C6 <: TupleTag  , X1_C7 <: TupleTag  , X1_C8 <: TupleTag    , X2_C1 <: TupleTag  , X2_C2 <: TupleTag  , X2_C3 <: TupleTag  , X2_C4 <: TupleTag  , X2_C5 <: TupleTag  , X2_C6 <: TupleTag  , X2_C7 <: TupleTag  , X2_C8 <: TupleTag    , X3_C1 <: TupleTag  , X3_C2 <: TupleTag  , X3_C3 <: TupleTag  , X3_C4 <: TupleTag  , X3_C5 <: TupleTag  , X3_C6 <: TupleTag  , X3_C7 <: TupleTag  , X3_C8 <: TupleTag    , X4_C1 <: TupleTag  , X4_C2 <: TupleTag  , X4_C3 <: TupleTag  , X4_C4 <: TupleTag  , X4_C5 <: TupleTag  , X4_C6 <: TupleTag  , X4_C7 <: TupleTag  , X4_C8 <: TupleTag    , X5_C1 <: TupleTag  , X5_C2 <: TupleTag  , X5_C3 <: TupleTag  , X5_C4 <: TupleTag  , X5_C5 <: TupleTag  , X5_C6 <: TupleTag  , X5_C7 <: TupleTag  , X5_C8 <: TupleTag
, Target1 <: TupleTag  , Target2 <: TupleTag  , Target3 <: TupleTag  , Target4 <: TupleTag  , Target5 <: TupleTag ](given
nodeTagImplicit1: Merge8[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8  , Target1]
, nodeTagImplicit2: Merge8[X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  , X2_C8  , Target2 ]  , nodeTagImplicit3: Merge8[X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7  , X3_C8  , Target3 ]  , nodeTagImplicit4: Merge8[X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6  , X4_C7  , X4_C8  , Target4 ]  , nodeTagImplicit5: Merge8[X5_C1  , X5_C2  , X5_C3  , X5_C4  , X5_C5  , X5_C6  , X5_C7  , X5_C8  , Target5 ]  ): Merge8[
NodeTag5[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1 ]
, NodeTag5[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2 ]
, NodeTag5[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3 ]
, NodeTag5[X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4 ]
, NodeTag5[X1_C5  , X2_C5  , X3_C5  , X4_C5  , X5_C5 ]
, NodeTag5[X1_C6  , X2_C6  , X3_C6  , X4_C6  , X5_C6 ]
, NodeTag5[X1_C7  , X2_C7  , X3_C7  , X4_C7  , X5_C7 ]
, NodeTag5[X1_C8  , X2_C8  , X3_C8  , X4_C8  , X5_C8 ]
, NodeTag5[Target1  , Target2  , Target3  , Target4  , Target5 ]
] = {
new Merge8[
NodeTag5[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1 ]
, NodeTag5[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2 ]
, NodeTag5[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3 ]
, NodeTag5[X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4 ]
, NodeTag5[X1_C5  , X2_C5  , X3_C5  , X4_C5  , X5_C5 ]
, NodeTag5[X1_C6  , X2_C6  , X3_C6  , X4_C6  , X5_C6 ]
, NodeTag5[X1_C7  , X2_C7  , X3_C7  , X4_C7  , X5_C7 ]
, NodeTag5[X1_C8  , X2_C8  , X3_C8  , X4_C8  , X5_C8 ]
, NodeTag5[Target1  , Target2  , Target3  , Target4  , Target5 ]
]
}
given tupletag5_merge8_implicit[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8    , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  , X2_C8    , X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7  , X3_C8    , X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6  , X4_C7  , X4_C8    , X5_C1  , X5_C2  , X5_C3  , X5_C4  , X5_C5  , X5_C6  , X5_C7  , X5_C8  ]
: Merge8[
TupleTag5[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1 ]
, TupleTag5[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2 ]
, TupleTag5[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3 ]
, TupleTag5[X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4 ]
, TupleTag5[X1_C5  , X2_C5  , X3_C5  , X4_C5  , X5_C5 ]
, TupleTag5[X1_C6  , X2_C6  , X3_C6  , X4_C6  , X5_C6 ]
, TupleTag5[X1_C7  , X2_C7  , X3_C7  , X4_C7  , X5_C7 ]
, TupleTag5[X1_C8  , X2_C8  , X3_C8  , X4_C8  , X5_C8 ]
, TupleTag5[
MergeProperty8[X1_C1
, X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8 ]
, MergeProperty8[X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  , X2_C8 ]  , MergeProperty8[X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7  , X3_C8 ]  , MergeProperty8[X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6  , X4_C7  , X4_C8 ]  , MergeProperty8[X5_C1  , X5_C2  , X5_C3  , X5_C4  , X5_C5  , X5_C6  , X5_C7  , X5_C8 ]
]
] = {
new Merge8[
TupleTag5[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1 ]
, TupleTag5[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2 ]
, TupleTag5[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3 ]
, TupleTag5[X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4 ]
, TupleTag5[X1_C5  , X2_C5  , X3_C5  , X4_C5  , X5_C5 ]
, TupleTag5[X1_C6  , X2_C6  , X3_C6  , X4_C6  , X5_C6 ]
, TupleTag5[X1_C7  , X2_C7  , X3_C7  , X4_C7  , X5_C7 ]
, TupleTag5[X1_C8  , X2_C8  , X3_C8  , X4_C8  , X5_C8 ]
, TupleTag5[
MergeProperty8[X1_C1
, X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8 ]
, MergeProperty8[X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  , X2_C8 ]  , MergeProperty8[X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7  , X3_C8 ]  , MergeProperty8[X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6  , X4_C7  , X4_C8 ]  , MergeProperty8[X5_C1  , X5_C2  , X5_C3  , X5_C4  , X5_C5  , X5_C6  , X5_C7  , X5_C8 ]
]
]
}
given nodetag6_merge8_implicit[X1_C1 <: TupleTag  , X1_C2 <: TupleTag  , X1_C3 <: TupleTag  , X1_C4 <: TupleTag  , X1_C5 <: TupleTag  , X1_C6 <: TupleTag  , X1_C7 <: TupleTag  , X1_C8 <: TupleTag    , X2_C1 <: TupleTag  , X2_C2 <: TupleTag  , X2_C3 <: TupleTag  , X2_C4 <: TupleTag  , X2_C5 <: TupleTag  , X2_C6 <: TupleTag  , X2_C7 <: TupleTag  , X2_C8 <: TupleTag    , X3_C1 <: TupleTag  , X3_C2 <: TupleTag  , X3_C3 <: TupleTag  , X3_C4 <: TupleTag  , X3_C5 <: TupleTag  , X3_C6 <: TupleTag  , X3_C7 <: TupleTag  , X3_C8 <: TupleTag    , X4_C1 <: TupleTag  , X4_C2 <: TupleTag  , X4_C3 <: TupleTag  , X4_C4 <: TupleTag  , X4_C5 <: TupleTag  , X4_C6 <: TupleTag  , X4_C7 <: TupleTag  , X4_C8 <: TupleTag    , X5_C1 <: TupleTag  , X5_C2 <: TupleTag  , X5_C3 <: TupleTag  , X5_C4 <: TupleTag  , X5_C5 <: TupleTag  , X5_C6 <: TupleTag  , X5_C7 <: TupleTag  , X5_C8 <: TupleTag    , X6_C1 <: TupleTag  , X6_C2 <: TupleTag  , X6_C3 <: TupleTag  , X6_C4 <: TupleTag  , X6_C5 <: TupleTag  , X6_C6 <: TupleTag  , X6_C7 <: TupleTag  , X6_C8 <: TupleTag
, Target1 <: TupleTag  , Target2 <: TupleTag  , Target3 <: TupleTag  , Target4 <: TupleTag  , Target5 <: TupleTag  , Target6 <: TupleTag ](given
nodeTagImplicit1: Merge8[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8  , Target1]
, nodeTagImplicit2: Merge8[X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  , X2_C8  , Target2 ]  , nodeTagImplicit3: Merge8[X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7  , X3_C8  , Target3 ]  , nodeTagImplicit4: Merge8[X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6  , X4_C7  , X4_C8  , Target4 ]  , nodeTagImplicit5: Merge8[X5_C1  , X5_C2  , X5_C3  , X5_C4  , X5_C5  , X5_C6  , X5_C7  , X5_C8  , Target5 ]  , nodeTagImplicit6: Merge8[X6_C1  , X6_C2  , X6_C3  , X6_C4  , X6_C5  , X6_C6  , X6_C7  , X6_C8  , Target6 ]  ): Merge8[
NodeTag6[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1 ]
, NodeTag6[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2 ]
, NodeTag6[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3 ]
, NodeTag6[X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4  , X6_C4 ]
, NodeTag6[X1_C5  , X2_C5  , X3_C5  , X4_C5  , X5_C5  , X6_C5 ]
, NodeTag6[X1_C6  , X2_C6  , X3_C6  , X4_C6  , X5_C6  , X6_C6 ]
, NodeTag6[X1_C7  , X2_C7  , X3_C7  , X4_C7  , X5_C7  , X6_C7 ]
, NodeTag6[X1_C8  , X2_C8  , X3_C8  , X4_C8  , X5_C8  , X6_C8 ]
, NodeTag6[Target1  , Target2  , Target3  , Target4  , Target5  , Target6 ]
] = {
new Merge8[
NodeTag6[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1 ]
, NodeTag6[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2 ]
, NodeTag6[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3 ]
, NodeTag6[X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4  , X6_C4 ]
, NodeTag6[X1_C5  , X2_C5  , X3_C5  , X4_C5  , X5_C5  , X6_C5 ]
, NodeTag6[X1_C6  , X2_C6  , X3_C6  , X4_C6  , X5_C6  , X6_C6 ]
, NodeTag6[X1_C7  , X2_C7  , X3_C7  , X4_C7  , X5_C7  , X6_C7 ]
, NodeTag6[X1_C8  , X2_C8  , X3_C8  , X4_C8  , X5_C8  , X6_C8 ]
, NodeTag6[Target1  , Target2  , Target3  , Target4  , Target5  , Target6 ]
]
}
given tupletag6_merge8_implicit[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8    , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  , X2_C8    , X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7  , X3_C8    , X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6  , X4_C7  , X4_C8    , X5_C1  , X5_C2  , X5_C3  , X5_C4  , X5_C5  , X5_C6  , X5_C7  , X5_C8    , X6_C1  , X6_C2  , X6_C3  , X6_C4  , X6_C5  , X6_C6  , X6_C7  , X6_C8  ]
: Merge8[
TupleTag6[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1 ]
, TupleTag6[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2 ]
, TupleTag6[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3 ]
, TupleTag6[X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4  , X6_C4 ]
, TupleTag6[X1_C5  , X2_C5  , X3_C5  , X4_C5  , X5_C5  , X6_C5 ]
, TupleTag6[X1_C6  , X2_C6  , X3_C6  , X4_C6  , X5_C6  , X6_C6 ]
, TupleTag6[X1_C7  , X2_C7  , X3_C7  , X4_C7  , X5_C7  , X6_C7 ]
, TupleTag6[X1_C8  , X2_C8  , X3_C8  , X4_C8  , X5_C8  , X6_C8 ]
, TupleTag6[
MergeProperty8[X1_C1
, X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8 ]
, MergeProperty8[X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  , X2_C8 ]  , MergeProperty8[X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7  , X3_C8 ]  , MergeProperty8[X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6  , X4_C7  , X4_C8 ]  , MergeProperty8[X5_C1  , X5_C2  , X5_C3  , X5_C4  , X5_C5  , X5_C6  , X5_C7  , X5_C8 ]  , MergeProperty8[X6_C1  , X6_C2  , X6_C3  , X6_C4  , X6_C5  , X6_C6  , X6_C7  , X6_C8 ]
]
] = {
new Merge8[
TupleTag6[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1 ]
, TupleTag6[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2 ]
, TupleTag6[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3 ]
, TupleTag6[X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4  , X6_C4 ]
, TupleTag6[X1_C5  , X2_C5  , X3_C5  , X4_C5  , X5_C5  , X6_C5 ]
, TupleTag6[X1_C6  , X2_C6  , X3_C6  , X4_C6  , X5_C6  , X6_C6 ]
, TupleTag6[X1_C7  , X2_C7  , X3_C7  , X4_C7  , X5_C7  , X6_C7 ]
, TupleTag6[X1_C8  , X2_C8  , X3_C8  , X4_C8  , X5_C8  , X6_C8 ]
, TupleTag6[
MergeProperty8[X1_C1
, X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8 ]
, MergeProperty8[X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  , X2_C8 ]  , MergeProperty8[X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7  , X3_C8 ]  , MergeProperty8[X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6  , X4_C7  , X4_C8 ]  , MergeProperty8[X5_C1  , X5_C2  , X5_C3  , X5_C4  , X5_C5  , X5_C6  , X5_C7  , X5_C8 ]  , MergeProperty8[X6_C1  , X6_C2  , X6_C3  , X6_C4  , X6_C5  , X6_C6  , X6_C7  , X6_C8 ]
]
]
}
given nodetag7_merge8_implicit[X1_C1 <: TupleTag  , X1_C2 <: TupleTag  , X1_C3 <: TupleTag  , X1_C4 <: TupleTag  , X1_C5 <: TupleTag  , X1_C6 <: TupleTag  , X1_C7 <: TupleTag  , X1_C8 <: TupleTag    , X2_C1 <: TupleTag  , X2_C2 <: TupleTag  , X2_C3 <: TupleTag  , X2_C4 <: TupleTag  , X2_C5 <: TupleTag  , X2_C6 <: TupleTag  , X2_C7 <: TupleTag  , X2_C8 <: TupleTag    , X3_C1 <: TupleTag  , X3_C2 <: TupleTag  , X3_C3 <: TupleTag  , X3_C4 <: TupleTag  , X3_C5 <: TupleTag  , X3_C6 <: TupleTag  , X3_C7 <: TupleTag  , X3_C8 <: TupleTag    , X4_C1 <: TupleTag  , X4_C2 <: TupleTag  , X4_C3 <: TupleTag  , X4_C4 <: TupleTag  , X4_C5 <: TupleTag  , X4_C6 <: TupleTag  , X4_C7 <: TupleTag  , X4_C8 <: TupleTag    , X5_C1 <: TupleTag  , X5_C2 <: TupleTag  , X5_C3 <: TupleTag  , X5_C4 <: TupleTag  , X5_C5 <: TupleTag  , X5_C6 <: TupleTag  , X5_C7 <: TupleTag  , X5_C8 <: TupleTag    , X6_C1 <: TupleTag  , X6_C2 <: TupleTag  , X6_C3 <: TupleTag  , X6_C4 <: TupleTag  , X6_C5 <: TupleTag  , X6_C6 <: TupleTag  , X6_C7 <: TupleTag  , X6_C8 <: TupleTag    , X7_C1 <: TupleTag  , X7_C2 <: TupleTag  , X7_C3 <: TupleTag  , X7_C4 <: TupleTag  , X7_C5 <: TupleTag  , X7_C6 <: TupleTag  , X7_C7 <: TupleTag  , X7_C8 <: TupleTag
, Target1 <: TupleTag  , Target2 <: TupleTag  , Target3 <: TupleTag  , Target4 <: TupleTag  , Target5 <: TupleTag  , Target6 <: TupleTag  , Target7 <: TupleTag ](given
nodeTagImplicit1: Merge8[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8  , Target1]
, nodeTagImplicit2: Merge8[X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  , X2_C8  , Target2 ]  , nodeTagImplicit3: Merge8[X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7  , X3_C8  , Target3 ]  , nodeTagImplicit4: Merge8[X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6  , X4_C7  , X4_C8  , Target4 ]  , nodeTagImplicit5: Merge8[X5_C1  , X5_C2  , X5_C3  , X5_C4  , X5_C5  , X5_C6  , X5_C7  , X5_C8  , Target5 ]  , nodeTagImplicit6: Merge8[X6_C1  , X6_C2  , X6_C3  , X6_C4  , X6_C5  , X6_C6  , X6_C7  , X6_C8  , Target6 ]  , nodeTagImplicit7: Merge8[X7_C1  , X7_C2  , X7_C3  , X7_C4  , X7_C5  , X7_C6  , X7_C7  , X7_C8  , Target7 ]  ): Merge8[
NodeTag7[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1  , X7_C1 ]
, NodeTag7[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2  , X7_C2 ]
, NodeTag7[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3  , X7_C3 ]
, NodeTag7[X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4  , X6_C4  , X7_C4 ]
, NodeTag7[X1_C5  , X2_C5  , X3_C5  , X4_C5  , X5_C5  , X6_C5  , X7_C5 ]
, NodeTag7[X1_C6  , X2_C6  , X3_C6  , X4_C6  , X5_C6  , X6_C6  , X7_C6 ]
, NodeTag7[X1_C7  , X2_C7  , X3_C7  , X4_C7  , X5_C7  , X6_C7  , X7_C7 ]
, NodeTag7[X1_C8  , X2_C8  , X3_C8  , X4_C8  , X5_C8  , X6_C8  , X7_C8 ]
, NodeTag7[Target1  , Target2  , Target3  , Target4  , Target5  , Target6  , Target7 ]
] = {
new Merge8[
NodeTag7[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1  , X7_C1 ]
, NodeTag7[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2  , X7_C2 ]
, NodeTag7[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3  , X7_C3 ]
, NodeTag7[X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4  , X6_C4  , X7_C4 ]
, NodeTag7[X1_C5  , X2_C5  , X3_C5  , X4_C5  , X5_C5  , X6_C5  , X7_C5 ]
, NodeTag7[X1_C6  , X2_C6  , X3_C6  , X4_C6  , X5_C6  , X6_C6  , X7_C6 ]
, NodeTag7[X1_C7  , X2_C7  , X3_C7  , X4_C7  , X5_C7  , X6_C7  , X7_C7 ]
, NodeTag7[X1_C8  , X2_C8  , X3_C8  , X4_C8  , X5_C8  , X6_C8  , X7_C8 ]
, NodeTag7[Target1  , Target2  , Target3  , Target4  , Target5  , Target6  , Target7 ]
]
}
given tupletag7_merge8_implicit[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8    , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  , X2_C8    , X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7  , X3_C8    , X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6  , X4_C7  , X4_C8    , X5_C1  , X5_C2  , X5_C3  , X5_C4  , X5_C5  , X5_C6  , X5_C7  , X5_C8    , X6_C1  , X6_C2  , X6_C3  , X6_C4  , X6_C5  , X6_C6  , X6_C7  , X6_C8    , X7_C1  , X7_C2  , X7_C3  , X7_C4  , X7_C5  , X7_C6  , X7_C7  , X7_C8  ]
: Merge8[
TupleTag7[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1  , X7_C1 ]
, TupleTag7[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2  , X7_C2 ]
, TupleTag7[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3  , X7_C3 ]
, TupleTag7[X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4  , X6_C4  , X7_C4 ]
, TupleTag7[X1_C5  , X2_C5  , X3_C5  , X4_C5  , X5_C5  , X6_C5  , X7_C5 ]
, TupleTag7[X1_C6  , X2_C6  , X3_C6  , X4_C6  , X5_C6  , X6_C6  , X7_C6 ]
, TupleTag7[X1_C7  , X2_C7  , X3_C7  , X4_C7  , X5_C7  , X6_C7  , X7_C7 ]
, TupleTag7[X1_C8  , X2_C8  , X3_C8  , X4_C8  , X5_C8  , X6_C8  , X7_C8 ]
, TupleTag7[
MergeProperty8[X1_C1
, X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8 ]
, MergeProperty8[X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  , X2_C8 ]  , MergeProperty8[X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7  , X3_C8 ]  , MergeProperty8[X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6  , X4_C7  , X4_C8 ]  , MergeProperty8[X5_C1  , X5_C2  , X5_C3  , X5_C4  , X5_C5  , X5_C6  , X5_C7  , X5_C8 ]  , MergeProperty8[X6_C1  , X6_C2  , X6_C3  , X6_C4  , X6_C5  , X6_C6  , X6_C7  , X6_C8 ]  , MergeProperty8[X7_C1  , X7_C2  , X7_C3  , X7_C4  , X7_C5  , X7_C6  , X7_C7  , X7_C8 ]
]
] = {
new Merge8[
TupleTag7[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1  , X7_C1 ]
, TupleTag7[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2  , X7_C2 ]
, TupleTag7[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3  , X7_C3 ]
, TupleTag7[X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4  , X6_C4  , X7_C4 ]
, TupleTag7[X1_C5  , X2_C5  , X3_C5  , X4_C5  , X5_C5  , X6_C5  , X7_C5 ]
, TupleTag7[X1_C6  , X2_C6  , X3_C6  , X4_C6  , X5_C6  , X6_C6  , X7_C6 ]
, TupleTag7[X1_C7  , X2_C7  , X3_C7  , X4_C7  , X5_C7  , X6_C7  , X7_C7 ]
, TupleTag7[X1_C8  , X2_C8  , X3_C8  , X4_C8  , X5_C8  , X6_C8  , X7_C8 ]
, TupleTag7[
MergeProperty8[X1_C1
, X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8 ]
, MergeProperty8[X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  , X2_C8 ]  , MergeProperty8[X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7  , X3_C8 ]  , MergeProperty8[X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6  , X4_C7  , X4_C8 ]  , MergeProperty8[X5_C1  , X5_C2  , X5_C3  , X5_C4  , X5_C5  , X5_C6  , X5_C7  , X5_C8 ]  , MergeProperty8[X6_C1  , X6_C2  , X6_C3  , X6_C4  , X6_C5  , X6_C6  , X6_C7  , X6_C8 ]  , MergeProperty8[X7_C1  , X7_C2  , X7_C3  , X7_C4  , X7_C5  , X7_C6  , X7_C7  , X7_C8 ]
]
]
}
given nodetag8_merge8_implicit[X1_C1 <: TupleTag  , X1_C2 <: TupleTag  , X1_C3 <: TupleTag  , X1_C4 <: TupleTag  , X1_C5 <: TupleTag  , X1_C6 <: TupleTag  , X1_C7 <: TupleTag  , X1_C8 <: TupleTag    , X2_C1 <: TupleTag  , X2_C2 <: TupleTag  , X2_C3 <: TupleTag  , X2_C4 <: TupleTag  , X2_C5 <: TupleTag  , X2_C6 <: TupleTag  , X2_C7 <: TupleTag  , X2_C8 <: TupleTag    , X3_C1 <: TupleTag  , X3_C2 <: TupleTag  , X3_C3 <: TupleTag  , X3_C4 <: TupleTag  , X3_C5 <: TupleTag  , X3_C6 <: TupleTag  , X3_C7 <: TupleTag  , X3_C8 <: TupleTag    , X4_C1 <: TupleTag  , X4_C2 <: TupleTag  , X4_C3 <: TupleTag  , X4_C4 <: TupleTag  , X4_C5 <: TupleTag  , X4_C6 <: TupleTag  , X4_C7 <: TupleTag  , X4_C8 <: TupleTag    , X5_C1 <: TupleTag  , X5_C2 <: TupleTag  , X5_C3 <: TupleTag  , X5_C4 <: TupleTag  , X5_C5 <: TupleTag  , X5_C6 <: TupleTag  , X5_C7 <: TupleTag  , X5_C8 <: TupleTag    , X6_C1 <: TupleTag  , X6_C2 <: TupleTag  , X6_C3 <: TupleTag  , X6_C4 <: TupleTag  , X6_C5 <: TupleTag  , X6_C6 <: TupleTag  , X6_C7 <: TupleTag  , X6_C8 <: TupleTag    , X7_C1 <: TupleTag  , X7_C2 <: TupleTag  , X7_C3 <: TupleTag  , X7_C4 <: TupleTag  , X7_C5 <: TupleTag  , X7_C6 <: TupleTag  , X7_C7 <: TupleTag  , X7_C8 <: TupleTag    , X8_C1 <: TupleTag  , X8_C2 <: TupleTag  , X8_C3 <: TupleTag  , X8_C4 <: TupleTag  , X8_C5 <: TupleTag  , X8_C6 <: TupleTag  , X8_C7 <: TupleTag  , X8_C8 <: TupleTag
, Target1 <: TupleTag  , Target2 <: TupleTag  , Target3 <: TupleTag  , Target4 <: TupleTag  , Target5 <: TupleTag  , Target6 <: TupleTag  , Target7 <: TupleTag  , Target8 <: TupleTag ](given
nodeTagImplicit1: Merge8[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8  , Target1]
, nodeTagImplicit2: Merge8[X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  , X2_C8  , Target2 ]  , nodeTagImplicit3: Merge8[X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7  , X3_C8  , Target3 ]  , nodeTagImplicit4: Merge8[X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6  , X4_C7  , X4_C8  , Target4 ]  , nodeTagImplicit5: Merge8[X5_C1  , X5_C2  , X5_C3  , X5_C4  , X5_C5  , X5_C6  , X5_C7  , X5_C8  , Target5 ]  , nodeTagImplicit6: Merge8[X6_C1  , X6_C2  , X6_C3  , X6_C4  , X6_C5  , X6_C6  , X6_C7  , X6_C8  , Target6 ]  , nodeTagImplicit7: Merge8[X7_C1  , X7_C2  , X7_C3  , X7_C4  , X7_C5  , X7_C6  , X7_C7  , X7_C8  , Target7 ]  , nodeTagImplicit8: Merge8[X8_C1  , X8_C2  , X8_C3  , X8_C4  , X8_C5  , X8_C6  , X8_C7  , X8_C8  , Target8 ]  ): Merge8[
NodeTag8[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1  , X7_C1  , X8_C1 ]
, NodeTag8[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2  , X7_C2  , X8_C2 ]
, NodeTag8[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3  , X7_C3  , X8_C3 ]
, NodeTag8[X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4  , X6_C4  , X7_C4  , X8_C4 ]
, NodeTag8[X1_C5  , X2_C5  , X3_C5  , X4_C5  , X5_C5  , X6_C5  , X7_C5  , X8_C5 ]
, NodeTag8[X1_C6  , X2_C6  , X3_C6  , X4_C6  , X5_C6  , X6_C6  , X7_C6  , X8_C6 ]
, NodeTag8[X1_C7  , X2_C7  , X3_C7  , X4_C7  , X5_C7  , X6_C7  , X7_C7  , X8_C7 ]
, NodeTag8[X1_C8  , X2_C8  , X3_C8  , X4_C8  , X5_C8  , X6_C8  , X7_C8  , X8_C8 ]
, NodeTag8[Target1  , Target2  , Target3  , Target4  , Target5  , Target6  , Target7  , Target8 ]
] = {
new Merge8[
NodeTag8[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1  , X7_C1  , X8_C1 ]
, NodeTag8[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2  , X7_C2  , X8_C2 ]
, NodeTag8[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3  , X7_C3  , X8_C3 ]
, NodeTag8[X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4  , X6_C4  , X7_C4  , X8_C4 ]
, NodeTag8[X1_C5  , X2_C5  , X3_C5  , X4_C5  , X5_C5  , X6_C5  , X7_C5  , X8_C5 ]
, NodeTag8[X1_C6  , X2_C6  , X3_C6  , X4_C6  , X5_C6  , X6_C6  , X7_C6  , X8_C6 ]
, NodeTag8[X1_C7  , X2_C7  , X3_C7  , X4_C7  , X5_C7  , X6_C7  , X7_C7  , X8_C7 ]
, NodeTag8[X1_C8  , X2_C8  , X3_C8  , X4_C8  , X5_C8  , X6_C8  , X7_C8  , X8_C8 ]
, NodeTag8[Target1  , Target2  , Target3  , Target4  , Target5  , Target6  , Target7  , Target8 ]
]
}
given tupletag8_merge8_implicit[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8    , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  , X2_C8    , X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7  , X3_C8    , X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6  , X4_C7  , X4_C8    , X5_C1  , X5_C2  , X5_C3  , X5_C4  , X5_C5  , X5_C6  , X5_C7  , X5_C8    , X6_C1  , X6_C2  , X6_C3  , X6_C4  , X6_C5  , X6_C6  , X6_C7  , X6_C8    , X7_C1  , X7_C2  , X7_C3  , X7_C4  , X7_C5  , X7_C6  , X7_C7  , X7_C8    , X8_C1  , X8_C2  , X8_C3  , X8_C4  , X8_C5  , X8_C6  , X8_C7  , X8_C8  ]
: Merge8[
TupleTag8[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1  , X7_C1  , X8_C1 ]
, TupleTag8[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2  , X7_C2  , X8_C2 ]
, TupleTag8[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3  , X7_C3  , X8_C3 ]
, TupleTag8[X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4  , X6_C4  , X7_C4  , X8_C4 ]
, TupleTag8[X1_C5  , X2_C5  , X3_C5  , X4_C5  , X5_C5  , X6_C5  , X7_C5  , X8_C5 ]
, TupleTag8[X1_C6  , X2_C6  , X3_C6  , X4_C6  , X5_C6  , X6_C6  , X7_C6  , X8_C6 ]
, TupleTag8[X1_C7  , X2_C7  , X3_C7  , X4_C7  , X5_C7  , X6_C7  , X7_C7  , X8_C7 ]
, TupleTag8[X1_C8  , X2_C8  , X3_C8  , X4_C8  , X5_C8  , X6_C8  , X7_C8  , X8_C8 ]
, TupleTag8[
MergeProperty8[X1_C1
, X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8 ]
, MergeProperty8[X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  , X2_C8 ]  , MergeProperty8[X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7  , X3_C8 ]  , MergeProperty8[X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6  , X4_C7  , X4_C8 ]  , MergeProperty8[X5_C1  , X5_C2  , X5_C3  , X5_C4  , X5_C5  , X5_C6  , X5_C7  , X5_C8 ]  , MergeProperty8[X6_C1  , X6_C2  , X6_C3  , X6_C4  , X6_C5  , X6_C6  , X6_C7  , X6_C8 ]  , MergeProperty8[X7_C1  , X7_C2  , X7_C3  , X7_C4  , X7_C5  , X7_C6  , X7_C7  , X7_C8 ]  , MergeProperty8[X8_C1  , X8_C2  , X8_C3  , X8_C4  , X8_C5  , X8_C6  , X8_C7  , X8_C8 ]
]
] = {
new Merge8[
TupleTag8[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1  , X7_C1  , X8_C1 ]
, TupleTag8[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2  , X7_C2  , X8_C2 ]
, TupleTag8[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3  , X7_C3  , X8_C3 ]
, TupleTag8[X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4  , X6_C4  , X7_C4  , X8_C4 ]
, TupleTag8[X1_C5  , X2_C5  , X3_C5  , X4_C5  , X5_C5  , X6_C5  , X7_C5  , X8_C5 ]
, TupleTag8[X1_C6  , X2_C6  , X3_C6  , X4_C6  , X5_C6  , X6_C6  , X7_C6  , X8_C6 ]
, TupleTag8[X1_C7  , X2_C7  , X3_C7  , X4_C7  , X5_C7  , X6_C7  , X7_C7  , X8_C7 ]
, TupleTag8[X1_C8  , X2_C8  , X3_C8  , X4_C8  , X5_C8  , X6_C8  , X7_C8  , X8_C8 ]
, TupleTag8[
MergeProperty8[X1_C1
, X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8 ]
, MergeProperty8[X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  , X2_C8 ]  , MergeProperty8[X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7  , X3_C8 ]  , MergeProperty8[X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6  , X4_C7  , X4_C8 ]  , MergeProperty8[X5_C1  , X5_C2  , X5_C3  , X5_C4  , X5_C5  , X5_C6  , X5_C7  , X5_C8 ]  , MergeProperty8[X6_C1  , X6_C2  , X6_C3  , X6_C4  , X6_C5  , X6_C6  , X6_C7  , X6_C8 ]  , MergeProperty8[X7_C1  , X7_C2  , X7_C3  , X7_C4  , X7_C5  , X7_C6  , X7_C7  , X7_C8 ]  , MergeProperty8[X8_C1  , X8_C2  , X8_C3  , X8_C4  , X8_C5  , X8_C6  , X8_C7  , X8_C8 ]
]
]
}
}