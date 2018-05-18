package net.scalax.asuna.core

case class SplitData[T](current: T, left: DataGroup)

trait NotConvert

object NotConvert {
  val value: NotConvert = new NotConvert {}
}

trait DataShape[-E, U, C, T] {

  def packed: DataShape[C, U, C, T]

  def wrapRep(base: E): C

  def toLawRep(base: C): DataRepGroup[T]

  def takeData(oldData: DataGroup, rep: C): Either[NotConvert, SplitData[U]]

  def buildData(splitData: U, rep: C): Either[NotConvert, DataGroup]

}