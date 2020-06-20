package zsg.testkit.tuple.reverse

import zsg.{Application1, ZsgTuple0, Context1, Plus1}

trait ReverseTupleEncoder[T] {
  self =>
  def body(t: List[String], i: T): List[String]
  def stringBody(i: T): String
}

object reverseScalaTupleContext extends Context1[ReverseTupleEncoder] {

  override def append[X1, Y1, Z1](x: ReverseTupleEncoder[X1], y: ReverseTupleEncoder[Y1])(p: Plus1[X1, Y1, Z1]): ReverseTupleEncoder[Z1] = {
    new ReverseTupleEncoder[Z1] {
      override def body(t: List[String], i: Z1): List[String] = {
        val x1 = p.takeHead1(i)
        val y1 = p.takeTail1(i)
        x.body(y.body(t, y1), x1)
      }
      override def stringBody(i: Z1): String = ""

    }
  }

  override def start: ReverseTupleEncoder[ZsgTuple0] = new ReverseTupleEncoder[ZsgTuple0] {
    override def body(t: List[String], i: ZsgTuple0): List[String] = t
    override def stringBody(i: ZsgTuple0): String                  = ""
  }
}

object reverseTuple {
  def asString[T](x: T)(using ii: Application1[ReverseTupleEncoder,  T]): String = {
    val con = ii.application(reverseScalaTupleContext)
    s"[${con.body(List.empty, x).mkString("(", ",", ")")}]"
  }
}

object ReverseAppendTuple {
  given reverseTupleImplicit1 as ReverseTupleEncoder[String] {
    override def body(t: List[String], i: String): List[String] = i :: t
    override def stringBody(i: String): String                  = i
  }

  given reverseTupleImplicit12 as ReverseTupleEncoder[Int] {
    override def body(t: List[String], i: Int): List[String] = String.valueOf(i) :: t
    override def stringBody(i: Int): String                  = String.valueOf(i)
  }

  given reverseTupleImplicit3 as ReverseTupleEncoder[Long] {
    override def body(t: List[String], i: Long): List[String] = String.valueOf(i) :: t
    override def stringBody(i: Long): String                  = String.valueOf(i)
  }

  given reverseApplicationImplicit[T](using t: Application1[ReverseTupleEncoder,  T]) as ReverseTupleEncoder[T] = t.application(reverseScalaTupleContext)

  /*implicit def reverseObjectTupleImplicit[T, I](
    implicit ii: Application1[ReverseTupleEncoder, T, I],
    c: T <:< I
  ): ReverseTupleEncoder[T] = new ReverseTupleEncoder[T] {
    override def body(t: List[String], i: T): List[String] = ii.application(reverseScalaTupleContext).body(List.empty, i).mkString("(", ",", ")") :: t
    override def stringBody(i: T): String                  = ii.application(reverseScalaTupleContext).body(List.empty, i).mkString("(", ",", ")")
  }*/

}