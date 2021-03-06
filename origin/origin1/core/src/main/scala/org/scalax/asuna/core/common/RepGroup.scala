package org.scalax.asuna.core.common

import org.scalax.asuna.core.decoder.{DecoderShape, SplitData}
import org.scalax.asuna.core.encoder.EncoderShape
import org.scalax.asuna.core.formatter.FormatterShape

trait RepGroup[Rep <: RepGroupContent] {
  self =>

  val repCol: Rep

  def mixin[T](newHead: T): RepGroup[T ++:: Rep] = new RepGroup[T ++:: Rep] {
    override val repCol: T ++:: Rep = ++::.apply(newHead, self.repCol)
  }

}

object RepGroup {
  implicit def repGroupDecoderImplicit1[B, C <: RepGroupContent, E, G, RepCol, DataCol](
      implicit shape: DecoderShape.Aux[B, E, G, RepCol, DataCol]
  ): DecoderShape.Aux[RepGroup[B ++:: C], E, G, RepCol, DataCol] = {
    new DecoderShape[RepGroup[B ++:: C], RepCol, DataCol] {
      override type Target = G
      override type Data   = E
      override def wrapRep(base: => RepGroup[B ++:: C]): G = {
        val head ++:: _ = base.repCol
        shape.wrapRep(head)
      }
      override def buildRep(base: G, oldRep: RepCol): RepCol                 = shape.buildRep(base, oldRep)
      override def takeData(rep: G, oldData: DataCol): SplitData[E, DataCol] = shape.takeData(rep, oldData)
    }
  }

  implicit def repGroupDecoderImplicit2[B, C <: RepGroupContent, F, G, I, J, RepCol, DataCol](
      implicit shape: DecoderShape.Aux[RepGroup[C], F, J, RepCol, DataCol]
  ): DecoderShape.Aux[RepGroup[B ++:: C], F, J, RepCol, DataCol] = {
    new DecoderShape[RepGroup[B ++:: C], RepCol, DataCol] {
      override type Target = J
      override type Data   = F
      override def wrapRep(base: => RepGroup[B ++:: C]): J = {
        val _ ++:: tail = base.repCol
        val rGroup = new RepGroup[C] {
          override val repCol = tail
        }
        shape.wrapRep(rGroup)
      }
      override def buildRep(base: J, oldRep: RepCol): RepCol                 = shape.buildRep(base, oldRep)
      override def takeData(rep: J, oldData: DataCol): SplitData[F, DataCol] = shape.takeData(rep, oldData)
    }
  }

  implicit def repGroupEncoderImplicit1[B, C <: RepGroupContent, E, G, RepCol, DataCol](
      implicit shape: EncoderShape.Aux[B, E, G, RepCol, DataCol]
  ): EncoderShape.Aux[RepGroup[B ++:: C], E, G, RepCol, DataCol] = {
    new EncoderShape[RepGroup[B ++:: C], RepCol, DataCol] {
      override type Target = G
      override type Data   = E
      override def wrapRep(base: => RepGroup[B ++:: C]): G = {
        val head ++:: _ = base.repCol
        shape.wrapRep(head)
      }
      override def buildRep(base: G, oldRep: RepCol): RepCol             = shape.buildRep(base, oldRep)
      override def buildData(data: E, rep: G, oldData: DataCol): DataCol = shape.buildData(data, rep, oldData)
    }
  }

  implicit def repGroupEncoderImplicit2[B, C <: RepGroupContent, F, G, I, J, RepCol, DataCol](
      implicit shape: EncoderShape.Aux[RepGroup[C], F, J, RepCol, DataCol]
  ): EncoderShape.Aux[RepGroup[B ++:: C], F, J, RepCol, DataCol] = {
    new EncoderShape[RepGroup[B ++:: C], RepCol, DataCol] {
      override type Target = J
      override type Data   = F
      override def wrapRep(base: => RepGroup[B ++:: C]): J = {
        val _ ++:: tail = base.repCol
        val rGroup = new RepGroup[C] {
          override val repCol = tail
        }
        shape.wrapRep(rGroup)
      }
      override def buildRep(base: J, oldRep: RepCol): RepCol             = shape.buildRep(base, oldRep)
      override def buildData(data: F, rep: J, oldData: DataCol): DataCol = shape.buildData(data, rep, oldData)
    }
  }

  implicit def repGroupFormatterImplicit1[B, C <: RepGroupContent, E, G, RepCol, EncoderDataCol, DecoderDataCol](
      implicit shape: FormatterShape.Aux[B, E, G, RepCol, EncoderDataCol, DecoderDataCol]
  ): FormatterShape.Aux[RepGroup[B ++:: C], E, G, RepCol, EncoderDataCol, DecoderDataCol] = {
    new FormatterShape[RepGroup[B ++:: C], RepCol, EncoderDataCol, DecoderDataCol] {
      override type Target = G
      override type Data   = E
      override def wrapRep(base: => RepGroup[B ++:: C]): G = {
        val head ++:: _ = base.repCol
        shape.wrapRep(head)
      }
      override def buildRep(base: G, oldRep: RepCol): RepCol                               = shape.buildRep(base, oldRep)
      override def buildData(data: E, rep: G, oldData: EncoderDataCol): EncoderDataCol     = shape.buildData(data, rep, oldData)
      override def takeData(rep: G, oldData: DecoderDataCol): SplitData[E, DecoderDataCol] = shape.takeData(rep, oldData)
    }
  }

  implicit def repGroupFormatterImplicit2[B, C <: RepGroupContent, F, G, I, J, RepCol, EncoderDataCol, DecoderDataCol](
      implicit shape: FormatterShape.Aux[RepGroup[C], F, J, RepCol, EncoderDataCol, DecoderDataCol]
  ): FormatterShape.Aux[RepGroup[B ++:: C], F, J, RepCol, EncoderDataCol, DecoderDataCol] = {
    new FormatterShape[RepGroup[B ++:: C], RepCol, EncoderDataCol, DecoderDataCol] {
      override type Target = J
      override type Data   = F
      override def wrapRep(base: => RepGroup[B ++:: C]): J = {
        val _ ++:: tail = base.repCol
        val rGroup = new RepGroup[C] {
          override val repCol = tail
        }
        shape.wrapRep(rGroup)
      }
      override def buildRep(base: J, oldRep: RepCol): RepCol                               = shape.buildRep(base, oldRep)
      override def buildData(data: F, rep: J, oldData: EncoderDataCol): EncoderDataCol     = shape.buildData(data, rep, oldData)
      override def takeData(rep: J, oldData: DecoderDataCol): SplitData[F, DecoderDataCol] = shape.takeData(rep, oldData)
    }
  }
}

sealed trait RepGroupContent

sealed trait RNil extends RepGroupContent {
  def ++::[Head](head: Head): Head ++:: RNil = HideAppender.Appender.apply(head, RNil.value)
}

object RNil {
  val value: RNil = new RNil {}
}

final case class ++::[Head, Tail <: RepGroupContent](head: Head, tail: Tail) extends RepGroupContent {
  self =>
  def ++::[NewHead](newHead: NewHead): NewHead ++:: Head ++:: Tail = HideAppender.Appender.apply(newHead, self)
}

private[common] object HideAppender {
  val Appender = ++::
}
