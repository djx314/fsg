package asuna
import asuna.support.heterogeneous._
trait HListPlus_19_1 {
final def plusWithTypeParameter19[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8  , X1_C9  , X1_C10  , X1_C11  , X1_C12  , X1_C13  , X1_C14  , X1_C15  , X1_C16  , X1_C17  , X1_C18  , X1_C19
, Y1  ]:
Plus1[
X1_C1 ::  X1_C2 ::  X1_C3 ::  X1_C4 ::  X1_C5 ::  X1_C6 ::  X1_C7 ::  X1_C8 ::  X1_C9 ::  X1_C10 ::  X1_C11 ::  X1_C12 ::  X1_C13 ::  X1_C14 ::  X1_C15 ::  X1_C16 ::  X1_C17 ::  X1_C18 ::  X1_C19 ::  HNil
, Y1
, Y1 ::  X1_C1 ::  X1_C2 ::  X1_C3 ::  X1_C4 ::  X1_C5 ::  X1_C6 ::  X1_C7 ::  X1_C8 ::  X1_C9 ::  X1_C10 ::  X1_C11 ::  X1_C12 ::  X1_C13 ::  X1_C14 ::  X1_C15 ::  X1_C16 ::  X1_C17 ::  X1_C18 ::  X1_C19 ::  HNil
] = new Plus1[
X1_C1 ::  X1_C2 ::  X1_C3 ::  X1_C4 ::  X1_C5 ::  X1_C6 ::  X1_C7 ::  X1_C8 ::  X1_C9 ::  X1_C10 ::  X1_C11 ::  X1_C12 ::  X1_C13 ::  X1_C14 ::  X1_C15 ::  X1_C16 ::  X1_C17 ::  X1_C18 ::  X1_C19 ::  HNil
, Y1
, Y1 ::  X1_C1 ::  X1_C2 ::  X1_C3 ::  X1_C4 ::  X1_C5 ::  X1_C6 ::  X1_C7 ::  X1_C8 ::  X1_C9 ::  X1_C10 ::  X1_C11 ::  X1_C12 ::  X1_C13 ::  X1_C14 ::  X1_C15 ::  X1_C16 ::  X1_C17 ::  X1_C18 ::  X1_C19 ::  HNil
] {
final override def takeHead1(z: Y1 ::  X1_C1 ::  X1_C2 ::  X1_C3 ::  X1_C4 ::  X1_C5 ::  X1_C6 ::  X1_C7 ::  X1_C8 ::  X1_C9 ::  X1_C10 ::  X1_C11 ::  X1_C12 ::  X1_C13 ::  X1_C14 ::  X1_C15 ::  X1_C16 ::  X1_C17 ::  X1_C18 ::  X1_C19 ::  HNil):  X1_C1 ::  X1_C2 ::  X1_C3 ::  X1_C4 ::  X1_C5 ::  X1_C6 ::  X1_C7 ::  X1_C8 ::  X1_C9 ::  X1_C10 ::  X1_C11 ::  X1_C12 ::  X1_C13 ::  X1_C14 ::  X1_C15 ::  X1_C16 ::  X1_C17 ::  X1_C18 ::  X1_C19 ::  HNil = z.tail
final override def takeTail1(z: Y1 ::  X1_C1 ::  X1_C2 ::  X1_C3 ::  X1_C4 ::  X1_C5 ::  X1_C6 ::  X1_C7 ::  X1_C8 ::  X1_C9 ::  X1_C10 ::  X1_C11 ::  X1_C12 ::  X1_C13 ::  X1_C14 ::  X1_C15 ::  X1_C16 ::  X1_C17 ::  X1_C18 ::  X1_C19 ::  HNil): Y1 = z.head
final override def plus1(x:  X1_C1 ::  X1_C2 ::  X1_C3 ::  X1_C4 ::  X1_C5 ::  X1_C6 ::  X1_C7 ::  X1_C8 ::  X1_C9 ::  X1_C10 ::  X1_C11 ::  X1_C12 ::  X1_C13 ::  X1_C14 ::  X1_C15 ::  X1_C16 ::  X1_C17 ::  X1_C18 ::  X1_C19 ::  HNil, y: Y1): Y1 ::  X1_C1 ::  X1_C2 ::  X1_C3 ::  X1_C4 ::  X1_C5 ::  X1_C6 ::  X1_C7 ::  X1_C8 ::  X1_C9 ::  X1_C10 ::  X1_C11 ::  X1_C12 ::  X1_C13 ::  X1_C14 ::  X1_C15 ::  X1_C16 ::  X1_C17 ::  X1_C18 ::  X1_C19 ::  HNil = x.::(y)
}
}
