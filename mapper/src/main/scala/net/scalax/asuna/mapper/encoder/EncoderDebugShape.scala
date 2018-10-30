package net.scalax.asuna.mapper.encoder

import net.scalax.asuna.core.encoder.EncoderShape

import scala.annotation.implicitNotFound

trait EncoderDebugShape[Rep, Data, RepCol, DataCol] {
  type Target
  def shape: EncoderShape.Aux[Rep, Data, Target, RepCol, DataCol]
}

object EncoderDebugShape {

  @implicitNotFound(
      msg = "EncoderShape not found in this property.\nRepType: ${Rep}\nDataType: ${Data}\nTargetType: ${T}\nRepCol: ${RepCol}\nDataCol: ${DataCol}\n" +
      "If RepType is some of CaseClassRepMapper?, replace i?(context) to rep?.selfInfo and continue debug.\n" +
      "If not, define context.mappingSingleModel or context.mappingUnusedModel to find the implicit not found column."
  )
  type Aux[Rep, Data, T, RepCol, DataCol] = EncoderDebugShape[Rep, Data, RepCol, DataCol] { type Target = T }

  implicit def encoderDebugShapeImplicit[Rep, Data, Target, RepCol, DataCol](
      implicit shape: EncoderShape.Aux[Rep, Data, Target, RepCol, DataCol]
  ): EncoderDebugShape.Aux[Rep, Data, Target, RepCol, DataCol] = {
    type Target1 = Target
    val shape1 = shape
    new EncoderDebugShape[Rep, Data, RepCol, DataCol] {
      override type Target = Target1
      override def shape = shape1
    }
  }

}
