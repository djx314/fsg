package asuna
import asuna.support.heterogeneous._
trait PlusToTuple_20_3 {
final def plusWithTypeParameter20[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8  , X1_C9  , X1_C10  , X1_C11  , X1_C12  , X1_C13  , X1_C14  , X1_C15  , X1_C16  , X1_C17  , X1_C18  , X1_C19  , X1_C20
, X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  , X2_C8  , X2_C9  , X2_C10  , X2_C11  , X2_C12  , X2_C13  , X2_C14  , X2_C15  , X2_C16  , X2_C17  , X2_C18  , X2_C19  , X2_C20    , X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7  , X3_C8  , X3_C9  , X3_C10  , X3_C11  , X3_C12  , X3_C13  , X3_C14  , X3_C15  , X3_C16  , X3_C17  , X3_C18  , X3_C19  , X3_C20
, Y1  , Y2  , Y3  ]:
Plus3[
X1_C1 ::  X1_C2 ::  X1_C3 ::  X1_C4 ::  X1_C5 ::  X1_C6 ::  X1_C7 ::  X1_C8 ::  X1_C9 ::  X1_C10 ::  X1_C11 ::  X1_C12 ::  X1_C13 ::  X1_C14 ::  X1_C15 ::  X1_C16 ::  X1_C17 ::  X1_C18 ::  X1_C19 ::  X1_C20 ::  HNil
,  X2_C1 ::  X2_C2 ::  X2_C3 ::  X2_C4 ::  X2_C5 ::  X2_C6 ::  X2_C7 ::  X2_C8 ::  X2_C9 ::  X2_C10 ::  X2_C11 ::  X2_C12 ::  X2_C13 ::  X2_C14 ::  X2_C15 ::  X2_C16 ::  X2_C17 ::  X2_C18 ::  X2_C19 ::  X2_C20 ::  HNil  ,  X3_C1 ::  X3_C2 ::  X3_C3 ::  X3_C4 ::  X3_C5 ::  X3_C6 ::  X3_C7 ::  X3_C8 ::  X3_C9 ::  X3_C10 ::  X3_C11 ::  X3_C12 ::  X3_C13 ::  X3_C14 ::  X3_C15 ::  X3_C16 ::  X3_C17 ::  X3_C18 ::  X3_C19 ::  X3_C20 ::  HNil
, Y1  , Y2  , Y3
, ( Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8  , X1_C9  , X1_C10  , X1_C11  , X1_C12  , X1_C13  , X1_C14  , X1_C15  , X1_C16  , X1_C17  , X1_C18  , X1_C19  , X1_C20  )  , ( Y2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  , X2_C8  , X2_C9  , X2_C10  , X2_C11  , X2_C12  , X2_C13  , X2_C14  , X2_C15  , X2_C16  , X2_C17  , X2_C18  , X2_C19  , X2_C20  )  , ( Y3  , X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7  , X3_C8  , X3_C9  , X3_C10  , X3_C11  , X3_C12  , X3_C13  , X3_C14  , X3_C15  , X3_C16  , X3_C17  , X3_C18  , X3_C19  , X3_C20  )
] = new Plus3[
X1_C1 ::  X1_C2 ::  X1_C3 ::  X1_C4 ::  X1_C5 ::  X1_C6 ::  X1_C7 ::  X1_C8 ::  X1_C9 ::  X1_C10 ::  X1_C11 ::  X1_C12 ::  X1_C13 ::  X1_C14 ::  X1_C15 ::  X1_C16 ::  X1_C17 ::  X1_C18 ::  X1_C19 ::  X1_C20 ::  HNil
,  X2_C1 ::  X2_C2 ::  X2_C3 ::  X2_C4 ::  X2_C5 ::  X2_C6 ::  X2_C7 ::  X2_C8 ::  X2_C9 ::  X2_C10 ::  X2_C11 ::  X2_C12 ::  X2_C13 ::  X2_C14 ::  X2_C15 ::  X2_C16 ::  X2_C17 ::  X2_C18 ::  X2_C19 ::  X2_C20 ::  HNil  ,  X3_C1 ::  X3_C2 ::  X3_C3 ::  X3_C4 ::  X3_C5 ::  X3_C6 ::  X3_C7 ::  X3_C8 ::  X3_C9 ::  X3_C10 ::  X3_C11 ::  X3_C12 ::  X3_C13 ::  X3_C14 ::  X3_C15 ::  X3_C16 ::  X3_C17 ::  X3_C18 ::  X3_C19 ::  X3_C20 ::  HNil
, Y1  , Y2  , Y3
, ( Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8  , X1_C9  , X1_C10  , X1_C11  , X1_C12  , X1_C13  , X1_C14  , X1_C15  , X1_C16  , X1_C17  , X1_C18  , X1_C19  , X1_C20  )  , ( Y2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  , X2_C8  , X2_C9  , X2_C10  , X2_C11  , X2_C12  , X2_C13  , X2_C14  , X2_C15  , X2_C16  , X2_C17  , X2_C18  , X2_C19  , X2_C20  )  , ( Y3  , X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7  , X3_C8  , X3_C9  , X3_C10  , X3_C11  , X3_C12  , X3_C13  , X3_C14  , X3_C15  , X3_C16  , X3_C17  , X3_C18  , X3_C19  , X3_C20  )
] {
final override def takeHead1(z: ( Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8  , X1_C9  , X1_C10  , X1_C11  , X1_C12  , X1_C13  , X1_C14  , X1_C15  , X1_C16  , X1_C17  , X1_C18  , X1_C19  , X1_C20  )):  X1_C1 ::  X1_C2 ::  X1_C3 ::  X1_C4 ::  X1_C5 ::  X1_C6 ::  X1_C7 ::  X1_C8 ::  X1_C9 ::  X1_C10 ::  X1_C11 ::  X1_C12 ::  X1_C13 ::  X1_C14 ::  X1_C15 ::  X1_C16 ::  X1_C17 ::  X1_C18 ::  X1_C19 ::  X1_C20 ::  HNil =
z._2 ::  z._3 ::  z._4 ::  z._5 ::  z._6 ::  z._7 ::  z._8 ::  z._9 ::  z._10 ::  z._11 ::  z._12 ::  z._13 ::  z._14 ::  z._15 ::  z._16 ::  z._17 ::  z._18 ::  z._19 ::  z._20 ::  z._21 ::  HNil
final override def takeTail1(z: ( Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8  , X1_C9  , X1_C10  , X1_C11  , X1_C12  , X1_C13  , X1_C14  , X1_C15  , X1_C16  , X1_C17  , X1_C18  , X1_C19  , X1_C20  )): Y1 = z._1
final override def plus1(x:  X1_C1 ::  X1_C2 ::  X1_C3 ::  X1_C4 ::  X1_C5 ::  X1_C6 ::  X1_C7 ::  X1_C8 ::  X1_C9 ::  X1_C10 ::  X1_C11 ::  X1_C12 ::  X1_C13 ::  X1_C14 ::  X1_C15 ::  X1_C16 ::  X1_C17 ::  X1_C18 ::  X1_C19 ::  X1_C20 ::  HNil, y: Y1): ( Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8  , X1_C9  , X1_C10  , X1_C11  , X1_C12  , X1_C13  , X1_C14  , X1_C15  , X1_C16  , X1_C17  , X1_C18  , X1_C19  , X1_C20  ) =
(y  , x  .head  , x  .tail  .head  , x  .tail  .tail  .head  , x  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .head )
final override def takeHead2(z: ( Y2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  , X2_C8  , X2_C9  , X2_C10  , X2_C11  , X2_C12  , X2_C13  , X2_C14  , X2_C15  , X2_C16  , X2_C17  , X2_C18  , X2_C19  , X2_C20  )):  X2_C1 ::  X2_C2 ::  X2_C3 ::  X2_C4 ::  X2_C5 ::  X2_C6 ::  X2_C7 ::  X2_C8 ::  X2_C9 ::  X2_C10 ::  X2_C11 ::  X2_C12 ::  X2_C13 ::  X2_C14 ::  X2_C15 ::  X2_C16 ::  X2_C17 ::  X2_C18 ::  X2_C19 ::  X2_C20 ::  HNil =
z._2 ::  z._3 ::  z._4 ::  z._5 ::  z._6 ::  z._7 ::  z._8 ::  z._9 ::  z._10 ::  z._11 ::  z._12 ::  z._13 ::  z._14 ::  z._15 ::  z._16 ::  z._17 ::  z._18 ::  z._19 ::  z._20 ::  z._21 ::  HNil
final override def takeTail2(z: ( Y2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  , X2_C8  , X2_C9  , X2_C10  , X2_C11  , X2_C12  , X2_C13  , X2_C14  , X2_C15  , X2_C16  , X2_C17  , X2_C18  , X2_C19  , X2_C20  )): Y2 = z._1
final override def plus2(x:  X2_C1 ::  X2_C2 ::  X2_C3 ::  X2_C4 ::  X2_C5 ::  X2_C6 ::  X2_C7 ::  X2_C8 ::  X2_C9 ::  X2_C10 ::  X2_C11 ::  X2_C12 ::  X2_C13 ::  X2_C14 ::  X2_C15 ::  X2_C16 ::  X2_C17 ::  X2_C18 ::  X2_C19 ::  X2_C20 ::  HNil, y: Y2): ( Y2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  , X2_C8  , X2_C9  , X2_C10  , X2_C11  , X2_C12  , X2_C13  , X2_C14  , X2_C15  , X2_C16  , X2_C17  , X2_C18  , X2_C19  , X2_C20  ) =
(y  , x  .head  , x  .tail  .head  , x  .tail  .tail  .head  , x  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .head )
final override def takeHead3(z: ( Y3  , X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7  , X3_C8  , X3_C9  , X3_C10  , X3_C11  , X3_C12  , X3_C13  , X3_C14  , X3_C15  , X3_C16  , X3_C17  , X3_C18  , X3_C19  , X3_C20  )):  X3_C1 ::  X3_C2 ::  X3_C3 ::  X3_C4 ::  X3_C5 ::  X3_C6 ::  X3_C7 ::  X3_C8 ::  X3_C9 ::  X3_C10 ::  X3_C11 ::  X3_C12 ::  X3_C13 ::  X3_C14 ::  X3_C15 ::  X3_C16 ::  X3_C17 ::  X3_C18 ::  X3_C19 ::  X3_C20 ::  HNil =
z._2 ::  z._3 ::  z._4 ::  z._5 ::  z._6 ::  z._7 ::  z._8 ::  z._9 ::  z._10 ::  z._11 ::  z._12 ::  z._13 ::  z._14 ::  z._15 ::  z._16 ::  z._17 ::  z._18 ::  z._19 ::  z._20 ::  z._21 ::  HNil
final override def takeTail3(z: ( Y3  , X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7  , X3_C8  , X3_C9  , X3_C10  , X3_C11  , X3_C12  , X3_C13  , X3_C14  , X3_C15  , X3_C16  , X3_C17  , X3_C18  , X3_C19  , X3_C20  )): Y3 = z._1
final override def plus3(x:  X3_C1 ::  X3_C2 ::  X3_C3 ::  X3_C4 ::  X3_C5 ::  X3_C6 ::  X3_C7 ::  X3_C8 ::  X3_C9 ::  X3_C10 ::  X3_C11 ::  X3_C12 ::  X3_C13 ::  X3_C14 ::  X3_C15 ::  X3_C16 ::  X3_C17 ::  X3_C18 ::  X3_C19 ::  X3_C20 ::  HNil, y: Y3): ( Y3  , X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7  , X3_C8  , X3_C9  , X3_C10  , X3_C11  , X3_C12  , X3_C13  , X3_C14  , X3_C15  , X3_C16  , X3_C17  , X3_C18  , X3_C19  , X3_C20  ) =
(y  , x  .head  , x  .tail  .head  , x  .tail  .tail  .head  , x  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .head )
}
}
