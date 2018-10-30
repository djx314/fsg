package net.scalax.asuna.mapper.formatter

import net.scalax.asuna.core.formatter.FormatterShape

import scala.annotation.implicitNotFound

trait FormatterDebugShape[Rep, Data, RepCol, EncoderDataCol, DecoderDataCol] {
  type Target
  def shape: FormatterShape.Aux[Rep, Data, Target, RepCol, EncoderDataCol, DecoderDataCol]
}

object FormatterDebugShape {

  @implicitNotFound(
      msg = "FormatterShape not found in this property.\nRepType: ${Rep}\nDataType: ${Data}\nTargetType: ${T}\nRepCol: ${RepCol}" +
      "\nEncoderDataCol: ${EncoderDataCol}\nDecoderDataCol: ${DecoderDataCol}\n" +
      "If RepType is some of CaseClassRepMapper?, replace i?(context) to rep?.selfInfo and continue debug.\n" +
      "If not, define context.mappingSingleModel to find the implicit not found column."
  )
  type Aux[Rep, Data, T, RepCol, EncoderDataCol, DecoderDataCol] = FormatterDebugShape[Rep, Data, RepCol, EncoderDataCol, DecoderDataCol] { type Target = T }

  implicit def formatterDebugShapeImplicit[Rep, Data, Target, RepCol, EncoderDataCol, DecoderDataCol](
      implicit shape: FormatterShape.Aux[Rep, Data, Target, RepCol, EncoderDataCol, DecoderDataCol]
  ): FormatterDebugShape.Aux[Rep, Data, Target, RepCol, EncoderDataCol, DecoderDataCol] = {
    type Target1 = Target
    val shape1 = shape
    new FormatterDebugShape[Rep, Data, RepCol, EncoderDataCol, DecoderDataCol] {
      override type Target = Target1
      override def shape = shape1
    }
  }

}
