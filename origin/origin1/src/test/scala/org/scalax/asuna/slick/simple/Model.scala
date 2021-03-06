package org.scalax.asuna.slick.simple

import io.circe.JsonObject
import org.scalax.asuna.mapper.common.annotations.{OverrideProperty, RootModel, RootTable}
import org.scalax.asuna.mapper.decoder.LazyModel
import org.scalax.asuna.slick.umr.UmrHelper
import org.scalax.asuna.slick.umr.rmu.RmuWriterQuery
import slick.jdbc.H2Profile.api._

import scala.annotation.meta.field

case class InnerFriends2(id: Long, name: String, nick: String, age: Int, mark: List[InnerMark])
case class InnerMark(id: Long, name: String, mark: Int)
case class InnerFriendInput(mark: List[InnerMark])
case class InnerFriendOutput(id: Long)

case class Friends5(id: Long, name123: String, nick: String, age: Int)

class FriendTable3Model(friend: FriendTable2) extends UmrHelper {

  val id      = rep(friend.id)
  val name123 = rep(friend.name)

  val nick = rep(friend.nick)
  val age  = rep(friend.age)

  lazy val reader = umr.effect(umr.singleModel[Friends5](this).compile).toSv

}

case class Friends6(id: Long, nick: String)
case class Friends7(age: Int, id: Long)
case class Friends9(id: Long, nick: Option[String])

class FriendTable4Model(cons: Tag) extends FriendTable2(cons) with UmrHelper {

  lazy val reader6 = umr.effect(umr.singleModel[Friends6](this).compile).toSv
  lazy val reader7 = umr.effect(umr.singleModel[Friends7](this).compile).toSv

}

class dfjgoshjiotherihte(@(RootTable @field) val valcons: FriendTable4Model) extends UmrHelper {
  @OverrideProperty("nick")
  val jfgioseithedrihtgerithuioerht = valcons.nick.?

  lazy val reader1111 = umr.effect(umr.singleModel[Friends9](this).compile).toSv
}

class Abc(aa: dfjgoshjiotherihte) extends UmrHelper {
  @(RootModel[Friends9] @field)
  val sdfsjeriojgreig = aa.reader1111
  lazy val reader2222 = umr.effect(umr.singleModel[Friends9](this).compile).toSv
}

object FriendTable4Model extends TableQuery(cons => new FriendTable4Model(cons))

case class DynFields(id: Long, name: String, age: Int)
case class Friends8(age: Int, dyn: JsonObject)

class DynFriendModel(cons: Tag, cols: List[String]) extends FriendTable2(cons) with UmrHelper with RmuWriterQuery {
  self =>
  def dyn     = rmu.effect(rmu.singleModel[DynFields](self).compile).withCols(cols)
  def reader8 = umr.effect(umr.singleModel[Friends8](self).compile).toSv
}

object DynFriendModelTq extends (List[String] => TableQuery[DynFriendModel]) {
  override def apply(v1: List[String]): TableQuery[DynFriendModel] = TableQuery(cons => new DynFriendModel(cons, v1))
}

class FriendTable2Model(friend: FriendTable2) extends UmrHelper {
  self =>

  val id   = rep(friend.id)
  val name = rep(friend.name)
  val nick = rep(friend.nick)
  val age  = rep(friend.age)

  lazy val reader = umr.effect(umr.lazyModel[LazyModel[InnerFriendInput, InnerFriends2, InnerFriendOutput]](self).compile).toSv

}

class MarkTableModel(markTable: MarkTable) extends UmrHelper {

  val id   = rep(markTable.id)
  val name = rep(markTable.name)
  val mark = rep(markTable.mark)

  lazy val reader = umr.effect(umr.singleModel[InnerMark](this).compile).toSv

}
