package zsg
final class NodeTuple1[X1 <: TupleTag](final val i1: X1) extends TupleTag
object NodeTuple1 {
             inline given  [F[  _ ], T <: Context1[F]
             , X1_C1 <: TupleTag ]( using 
                 inline  t1: Application1[F, T  , X1_C1 ],
                 inline  context: T
            )  as  Application1[F, T  , NodeTuple1[X1_C1] ] =
                new Application1(context.append(context.start, t1.application)(NodeTuple1.cachePlus1WithTypeParameter0))
             inline given  [F[  _   ,  _ ], T <: Context2[F]
             , X1_C1 <: TupleTag  , X1_C2 <: TupleTag ]( using 
                 inline  t1: Application2[F, T  , X1_C1  , X1_C2 ],
                 inline  context: T
            )  as  Application2[F, T  , NodeTuple1[X1_C1]  , NodeTuple1[X1_C2] ] =
                new Application2(context.append(context.start, t1.application)(NodeTuple1.cachePlus2WithTypeParameter0))
             inline given  [F[  _   ,  _   ,  _ ], T <: Context3[F]
             , X1_C1 <: TupleTag  , X1_C2 <: TupleTag  , X1_C3 <: TupleTag ]( using 
                 inline  t1: Application3[F, T  , X1_C1  , X1_C2  , X1_C3 ],
                 inline  context: T
            )  as  Application3[F, T  , NodeTuple1[X1_C1]  , NodeTuple1[X1_C2]  , NodeTuple1[X1_C3] ] =
                new Application3(context.append(context.start, t1.application)(NodeTuple1.cachePlus3WithTypeParameter0))
             inline given  [F[  _   ,  _   ,  _   ,  _ ], T <: Context4[F]
             , X1_C1 <: TupleTag  , X1_C2 <: TupleTag  , X1_C3 <: TupleTag  , X1_C4 <: TupleTag ]( using 
                 inline  t1: Application4[F, T  , X1_C1  , X1_C2  , X1_C3  , X1_C4 ],
                 inline  context: T
            )  as  Application4[F, T  , NodeTuple1[X1_C1]  , NodeTuple1[X1_C2]  , NodeTuple1[X1_C3]  , NodeTuple1[X1_C4] ] =
                new Application4(context.append(context.start, t1.application)(NodeTuple1.cachePlus4WithTypeParameter0))
             inline given  [F[  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context5[F]
             , X1_C1 <: TupleTag  , X1_C2 <: TupleTag  , X1_C3 <: TupleTag  , X1_C4 <: TupleTag  , X1_C5 <: TupleTag ]( using 
                 inline  t1: Application5[F, T  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5 ],
                 inline  context: T
            )  as  Application5[F, T  , NodeTuple1[X1_C1]  , NodeTuple1[X1_C2]  , NodeTuple1[X1_C3]  , NodeTuple1[X1_C4]  , NodeTuple1[X1_C5] ] =
                new Application5(context.append(context.start, t1.application)(NodeTuple1.cachePlus5WithTypeParameter0))
             inline given  [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context6[F]
             , X1_C1 <: TupleTag  , X1_C2 <: TupleTag  , X1_C3 <: TupleTag  , X1_C4 <: TupleTag  , X1_C5 <: TupleTag  , X1_C6 <: TupleTag ]( using 
                 inline  t1: Application6[F, T  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6 ],
                 inline  context: T
            )  as  Application6[F, T  , NodeTuple1[X1_C1]  , NodeTuple1[X1_C2]  , NodeTuple1[X1_C3]  , NodeTuple1[X1_C4]  , NodeTuple1[X1_C5]  , NodeTuple1[X1_C6] ] =
                new Application6(context.append(context.start, t1.application)(NodeTuple1.cachePlus6WithTypeParameter0))
             inline given  [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context7[F]
             , X1_C1 <: TupleTag  , X1_C2 <: TupleTag  , X1_C3 <: TupleTag  , X1_C4 <: TupleTag  , X1_C5 <: TupleTag  , X1_C6 <: TupleTag  , X1_C7 <: TupleTag ]( using 
                 inline  t1: Application7[F, T  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7 ],
                 inline  context: T
            )  as  Application7[F, T  , NodeTuple1[X1_C1]  , NodeTuple1[X1_C2]  , NodeTuple1[X1_C3]  , NodeTuple1[X1_C4]  , NodeTuple1[X1_C5]  , NodeTuple1[X1_C6]  , NodeTuple1[X1_C7] ] =
                new Application7(context.append(context.start, t1.application)(NodeTuple1.cachePlus7WithTypeParameter0))
             inline given  [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context8[F]
             , X1_C1 <: TupleTag  , X1_C2 <: TupleTag  , X1_C3 <: TupleTag  , X1_C4 <: TupleTag  , X1_C5 <: TupleTag  , X1_C6 <: TupleTag  , X1_C7 <: TupleTag  , X1_C8 <: TupleTag ]( using 
                 inline  t1: Application8[F, T  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8 ],
                 inline  context: T
            )  as  Application8[F, T  , NodeTuple1[X1_C1]  , NodeTuple1[X1_C2]  , NodeTuple1[X1_C3]  , NodeTuple1[X1_C4]  , NodeTuple1[X1_C5]  , NodeTuple1[X1_C6]  , NodeTuple1[X1_C7]  , NodeTuple1[X1_C8] ] =
                new Application8(context.append(context.start, t1.application)(NodeTuple1.cachePlus8WithTypeParameter0))
             inline  def cachePlus1WithTypeParameter0Dynamic[Y1 <: TupleTag]: Plus1[
                ZsgTuple0,
                Y1,
                NodeTuple1[Y1]
            ] = new Plus1[
                ZsgTuple0,
                Y1,
                NodeTuple1[Y1]
            ] {
                    final override def takeHead1(z: NodeTuple1[Y1]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail1(z: NodeTuple1[Y1]): Y1 = z.i1
                    final override def plus1(x: ZsgTuple0, y: Y1): NodeTuple1[Y1] = new NodeTuple1(y)
            }
            val cachePlus1WithTypeParameter0Strict: Plus1[
                ZsgTuple0,
                TupleTag,
                NodeTuple1[TupleTag]
            ] = cachePlus1WithTypeParameter0Dynamic[TupleTag]
            @inline def cachePlus1WithTypeParameter0[Y1 <: TupleTag]: Plus1[
                ZsgTuple0,
                Y1,
                NodeTuple1[Y1]
            ] = cachePlus1WithTypeParameter0Strict.asInstanceOf[Plus1[
                ZsgTuple0,
                Y1,
                NodeTuple1[Y1]
            ]]
             inline  def cachePlus2WithTypeParameter0Dynamic[Y1 <: TupleTag , Y2 <: TupleTag]: Plus2[
                ZsgTuple0 , ZsgTuple0,
                Y1 , Y2,
                NodeTuple1[Y1] , NodeTuple1[Y2]
            ] = new Plus2[
                ZsgTuple0 , ZsgTuple0,
                Y1 , Y2,
                NodeTuple1[Y1] , NodeTuple1[Y2]
            ] {
                    final override def takeHead1(z: NodeTuple1[Y1]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail1(z: NodeTuple1[Y1]): Y1 = z.i1
                    final override def plus1(x: ZsgTuple0, y: Y1): NodeTuple1[Y1] = new NodeTuple1(y)
                    final override def takeHead2(z: NodeTuple1[Y2]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail2(z: NodeTuple1[Y2]): Y2 = z.i1
                    final override def plus2(x: ZsgTuple0, y: Y2): NodeTuple1[Y2] = new NodeTuple1(y)
            }
            val cachePlus2WithTypeParameter0Strict: Plus2[
                ZsgTuple0 , ZsgTuple0,
                TupleTag , TupleTag,
                NodeTuple1[TupleTag] , NodeTuple1[TupleTag]
            ] = cachePlus2WithTypeParameter0Dynamic[TupleTag , TupleTag]
            @inline def cachePlus2WithTypeParameter0[Y1 <: TupleTag , Y2 <: TupleTag]: Plus2[
                ZsgTuple0 , ZsgTuple0,
                Y1 , Y2,
                NodeTuple1[Y1] , NodeTuple1[Y2]
            ] = cachePlus2WithTypeParameter0Strict.asInstanceOf[Plus2[
                ZsgTuple0 , ZsgTuple0,
                Y1 , Y2,
                NodeTuple1[Y1] , NodeTuple1[Y2]
            ]]
             inline  def cachePlus3WithTypeParameter0Dynamic[Y1 <: TupleTag , Y2 <: TupleTag , Y3 <: TupleTag]: Plus3[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Y1 , Y2 , Y3,
                NodeTuple1[Y1] , NodeTuple1[Y2] , NodeTuple1[Y3]
            ] = new Plus3[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Y1 , Y2 , Y3,
                NodeTuple1[Y1] , NodeTuple1[Y2] , NodeTuple1[Y3]
            ] {
                    final override def takeHead1(z: NodeTuple1[Y1]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail1(z: NodeTuple1[Y1]): Y1 = z.i1
                    final override def plus1(x: ZsgTuple0, y: Y1): NodeTuple1[Y1] = new NodeTuple1(y)
                    final override def takeHead2(z: NodeTuple1[Y2]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail2(z: NodeTuple1[Y2]): Y2 = z.i1
                    final override def plus2(x: ZsgTuple0, y: Y2): NodeTuple1[Y2] = new NodeTuple1(y)
                    final override def takeHead3(z: NodeTuple1[Y3]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail3(z: NodeTuple1[Y3]): Y3 = z.i1
                    final override def plus3(x: ZsgTuple0, y: Y3): NodeTuple1[Y3] = new NodeTuple1(y)
            }
            val cachePlus3WithTypeParameter0Strict: Plus3[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                TupleTag , TupleTag , TupleTag,
                NodeTuple1[TupleTag] , NodeTuple1[TupleTag] , NodeTuple1[TupleTag]
            ] = cachePlus3WithTypeParameter0Dynamic[TupleTag , TupleTag , TupleTag]
            @inline def cachePlus3WithTypeParameter0[Y1 <: TupleTag , Y2 <: TupleTag , Y3 <: TupleTag]: Plus3[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Y1 , Y2 , Y3,
                NodeTuple1[Y1] , NodeTuple1[Y2] , NodeTuple1[Y3]
            ] = cachePlus3WithTypeParameter0Strict.asInstanceOf[Plus3[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Y1 , Y2 , Y3,
                NodeTuple1[Y1] , NodeTuple1[Y2] , NodeTuple1[Y3]
            ]]
             inline  def cachePlus4WithTypeParameter0Dynamic[Y1 <: TupleTag , Y2 <: TupleTag , Y3 <: TupleTag , Y4 <: TupleTag]: Plus4[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Y1 , Y2 , Y3 , Y4,
                NodeTuple1[Y1] , NodeTuple1[Y2] , NodeTuple1[Y3] , NodeTuple1[Y4]
            ] = new Plus4[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Y1 , Y2 , Y3 , Y4,
                NodeTuple1[Y1] , NodeTuple1[Y2] , NodeTuple1[Y3] , NodeTuple1[Y4]
            ] {
                    final override def takeHead1(z: NodeTuple1[Y1]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail1(z: NodeTuple1[Y1]): Y1 = z.i1
                    final override def plus1(x: ZsgTuple0, y: Y1): NodeTuple1[Y1] = new NodeTuple1(y)
                    final override def takeHead2(z: NodeTuple1[Y2]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail2(z: NodeTuple1[Y2]): Y2 = z.i1
                    final override def plus2(x: ZsgTuple0, y: Y2): NodeTuple1[Y2] = new NodeTuple1(y)
                    final override def takeHead3(z: NodeTuple1[Y3]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail3(z: NodeTuple1[Y3]): Y3 = z.i1
                    final override def plus3(x: ZsgTuple0, y: Y3): NodeTuple1[Y3] = new NodeTuple1(y)
                    final override def takeHead4(z: NodeTuple1[Y4]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail4(z: NodeTuple1[Y4]): Y4 = z.i1
                    final override def plus4(x: ZsgTuple0, y: Y4): NodeTuple1[Y4] = new NodeTuple1(y)
            }
            val cachePlus4WithTypeParameter0Strict: Plus4[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                TupleTag , TupleTag , TupleTag , TupleTag,
                NodeTuple1[TupleTag] , NodeTuple1[TupleTag] , NodeTuple1[TupleTag] , NodeTuple1[TupleTag]
            ] = cachePlus4WithTypeParameter0Dynamic[TupleTag , TupleTag , TupleTag , TupleTag]
            @inline def cachePlus4WithTypeParameter0[Y1 <: TupleTag , Y2 <: TupleTag , Y3 <: TupleTag , Y4 <: TupleTag]: Plus4[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Y1 , Y2 , Y3 , Y4,
                NodeTuple1[Y1] , NodeTuple1[Y2] , NodeTuple1[Y3] , NodeTuple1[Y4]
            ] = cachePlus4WithTypeParameter0Strict.asInstanceOf[Plus4[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Y1 , Y2 , Y3 , Y4,
                NodeTuple1[Y1] , NodeTuple1[Y2] , NodeTuple1[Y3] , NodeTuple1[Y4]
            ]]
             inline  def cachePlus5WithTypeParameter0Dynamic[Y1 <: TupleTag , Y2 <: TupleTag , Y3 <: TupleTag , Y4 <: TupleTag , Y5 <: TupleTag]: Plus5[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Y1 , Y2 , Y3 , Y4 , Y5,
                NodeTuple1[Y1] , NodeTuple1[Y2] , NodeTuple1[Y3] , NodeTuple1[Y4] , NodeTuple1[Y5]
            ] = new Plus5[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Y1 , Y2 , Y3 , Y4 , Y5,
                NodeTuple1[Y1] , NodeTuple1[Y2] , NodeTuple1[Y3] , NodeTuple1[Y4] , NodeTuple1[Y5]
            ] {
                    final override def takeHead1(z: NodeTuple1[Y1]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail1(z: NodeTuple1[Y1]): Y1 = z.i1
                    final override def plus1(x: ZsgTuple0, y: Y1): NodeTuple1[Y1] = new NodeTuple1(y)
                    final override def takeHead2(z: NodeTuple1[Y2]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail2(z: NodeTuple1[Y2]): Y2 = z.i1
                    final override def plus2(x: ZsgTuple0, y: Y2): NodeTuple1[Y2] = new NodeTuple1(y)
                    final override def takeHead3(z: NodeTuple1[Y3]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail3(z: NodeTuple1[Y3]): Y3 = z.i1
                    final override def plus3(x: ZsgTuple0, y: Y3): NodeTuple1[Y3] = new NodeTuple1(y)
                    final override def takeHead4(z: NodeTuple1[Y4]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail4(z: NodeTuple1[Y4]): Y4 = z.i1
                    final override def plus4(x: ZsgTuple0, y: Y4): NodeTuple1[Y4] = new NodeTuple1(y)
                    final override def takeHead5(z: NodeTuple1[Y5]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail5(z: NodeTuple1[Y5]): Y5 = z.i1
                    final override def plus5(x: ZsgTuple0, y: Y5): NodeTuple1[Y5] = new NodeTuple1(y)
            }
            val cachePlus5WithTypeParameter0Strict: Plus5[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                TupleTag , TupleTag , TupleTag , TupleTag , TupleTag,
                NodeTuple1[TupleTag] , NodeTuple1[TupleTag] , NodeTuple1[TupleTag] , NodeTuple1[TupleTag] , NodeTuple1[TupleTag]
            ] = cachePlus5WithTypeParameter0Dynamic[TupleTag , TupleTag , TupleTag , TupleTag , TupleTag]
            @inline def cachePlus5WithTypeParameter0[Y1 <: TupleTag , Y2 <: TupleTag , Y3 <: TupleTag , Y4 <: TupleTag , Y5 <: TupleTag]: Plus5[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Y1 , Y2 , Y3 , Y4 , Y5,
                NodeTuple1[Y1] , NodeTuple1[Y2] , NodeTuple1[Y3] , NodeTuple1[Y4] , NodeTuple1[Y5]
            ] = cachePlus5WithTypeParameter0Strict.asInstanceOf[Plus5[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Y1 , Y2 , Y3 , Y4 , Y5,
                NodeTuple1[Y1] , NodeTuple1[Y2] , NodeTuple1[Y3] , NodeTuple1[Y4] , NodeTuple1[Y5]
            ]]
             inline  def cachePlus6WithTypeParameter0Dynamic[Y1 <: TupleTag , Y2 <: TupleTag , Y3 <: TupleTag , Y4 <: TupleTag , Y5 <: TupleTag , Y6 <: TupleTag]: Plus6[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Y1 , Y2 , Y3 , Y4 , Y5 , Y6,
                NodeTuple1[Y1] , NodeTuple1[Y2] , NodeTuple1[Y3] , NodeTuple1[Y4] , NodeTuple1[Y5] , NodeTuple1[Y6]
            ] = new Plus6[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Y1 , Y2 , Y3 , Y4 , Y5 , Y6,
                NodeTuple1[Y1] , NodeTuple1[Y2] , NodeTuple1[Y3] , NodeTuple1[Y4] , NodeTuple1[Y5] , NodeTuple1[Y6]
            ] {
                    final override def takeHead1(z: NodeTuple1[Y1]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail1(z: NodeTuple1[Y1]): Y1 = z.i1
                    final override def plus1(x: ZsgTuple0, y: Y1): NodeTuple1[Y1] = new NodeTuple1(y)
                    final override def takeHead2(z: NodeTuple1[Y2]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail2(z: NodeTuple1[Y2]): Y2 = z.i1
                    final override def plus2(x: ZsgTuple0, y: Y2): NodeTuple1[Y2] = new NodeTuple1(y)
                    final override def takeHead3(z: NodeTuple1[Y3]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail3(z: NodeTuple1[Y3]): Y3 = z.i1
                    final override def plus3(x: ZsgTuple0, y: Y3): NodeTuple1[Y3] = new NodeTuple1(y)
                    final override def takeHead4(z: NodeTuple1[Y4]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail4(z: NodeTuple1[Y4]): Y4 = z.i1
                    final override def plus4(x: ZsgTuple0, y: Y4): NodeTuple1[Y4] = new NodeTuple1(y)
                    final override def takeHead5(z: NodeTuple1[Y5]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail5(z: NodeTuple1[Y5]): Y5 = z.i1
                    final override def plus5(x: ZsgTuple0, y: Y5): NodeTuple1[Y5] = new NodeTuple1(y)
                    final override def takeHead6(z: NodeTuple1[Y6]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail6(z: NodeTuple1[Y6]): Y6 = z.i1
                    final override def plus6(x: ZsgTuple0, y: Y6): NodeTuple1[Y6] = new NodeTuple1(y)
            }
            val cachePlus6WithTypeParameter0Strict: Plus6[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                TupleTag , TupleTag , TupleTag , TupleTag , TupleTag , TupleTag,
                NodeTuple1[TupleTag] , NodeTuple1[TupleTag] , NodeTuple1[TupleTag] , NodeTuple1[TupleTag] , NodeTuple1[TupleTag] , NodeTuple1[TupleTag]
            ] = cachePlus6WithTypeParameter0Dynamic[TupleTag , TupleTag , TupleTag , TupleTag , TupleTag , TupleTag]
            @inline def cachePlus6WithTypeParameter0[Y1 <: TupleTag , Y2 <: TupleTag , Y3 <: TupleTag , Y4 <: TupleTag , Y5 <: TupleTag , Y6 <: TupleTag]: Plus6[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Y1 , Y2 , Y3 , Y4 , Y5 , Y6,
                NodeTuple1[Y1] , NodeTuple1[Y2] , NodeTuple1[Y3] , NodeTuple1[Y4] , NodeTuple1[Y5] , NodeTuple1[Y6]
            ] = cachePlus6WithTypeParameter0Strict.asInstanceOf[Plus6[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Y1 , Y2 , Y3 , Y4 , Y5 , Y6,
                NodeTuple1[Y1] , NodeTuple1[Y2] , NodeTuple1[Y3] , NodeTuple1[Y4] , NodeTuple1[Y5] , NodeTuple1[Y6]
            ]]
             inline  def cachePlus7WithTypeParameter0Dynamic[Y1 <: TupleTag , Y2 <: TupleTag , Y3 <: TupleTag , Y4 <: TupleTag , Y5 <: TupleTag , Y6 <: TupleTag , Y7 <: TupleTag]: Plus7[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Y1 , Y2 , Y3 , Y4 , Y5 , Y6 , Y7,
                NodeTuple1[Y1] , NodeTuple1[Y2] , NodeTuple1[Y3] , NodeTuple1[Y4] , NodeTuple1[Y5] , NodeTuple1[Y6] , NodeTuple1[Y7]
            ] = new Plus7[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Y1 , Y2 , Y3 , Y4 , Y5 , Y6 , Y7,
                NodeTuple1[Y1] , NodeTuple1[Y2] , NodeTuple1[Y3] , NodeTuple1[Y4] , NodeTuple1[Y5] , NodeTuple1[Y6] , NodeTuple1[Y7]
            ] {
                    final override def takeHead1(z: NodeTuple1[Y1]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail1(z: NodeTuple1[Y1]): Y1 = z.i1
                    final override def plus1(x: ZsgTuple0, y: Y1): NodeTuple1[Y1] = new NodeTuple1(y)
                    final override def takeHead2(z: NodeTuple1[Y2]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail2(z: NodeTuple1[Y2]): Y2 = z.i1
                    final override def plus2(x: ZsgTuple0, y: Y2): NodeTuple1[Y2] = new NodeTuple1(y)
                    final override def takeHead3(z: NodeTuple1[Y3]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail3(z: NodeTuple1[Y3]): Y3 = z.i1
                    final override def plus3(x: ZsgTuple0, y: Y3): NodeTuple1[Y3] = new NodeTuple1(y)
                    final override def takeHead4(z: NodeTuple1[Y4]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail4(z: NodeTuple1[Y4]): Y4 = z.i1
                    final override def plus4(x: ZsgTuple0, y: Y4): NodeTuple1[Y4] = new NodeTuple1(y)
                    final override def takeHead5(z: NodeTuple1[Y5]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail5(z: NodeTuple1[Y5]): Y5 = z.i1
                    final override def plus5(x: ZsgTuple0, y: Y5): NodeTuple1[Y5] = new NodeTuple1(y)
                    final override def takeHead6(z: NodeTuple1[Y6]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail6(z: NodeTuple1[Y6]): Y6 = z.i1
                    final override def plus6(x: ZsgTuple0, y: Y6): NodeTuple1[Y6] = new NodeTuple1(y)
                    final override def takeHead7(z: NodeTuple1[Y7]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail7(z: NodeTuple1[Y7]): Y7 = z.i1
                    final override def plus7(x: ZsgTuple0, y: Y7): NodeTuple1[Y7] = new NodeTuple1(y)
            }
            val cachePlus7WithTypeParameter0Strict: Plus7[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                TupleTag , TupleTag , TupleTag , TupleTag , TupleTag , TupleTag , TupleTag,
                NodeTuple1[TupleTag] , NodeTuple1[TupleTag] , NodeTuple1[TupleTag] , NodeTuple1[TupleTag] , NodeTuple1[TupleTag] , NodeTuple1[TupleTag] , NodeTuple1[TupleTag]
            ] = cachePlus7WithTypeParameter0Dynamic[TupleTag , TupleTag , TupleTag , TupleTag , TupleTag , TupleTag , TupleTag]
            @inline def cachePlus7WithTypeParameter0[Y1 <: TupleTag , Y2 <: TupleTag , Y3 <: TupleTag , Y4 <: TupleTag , Y5 <: TupleTag , Y6 <: TupleTag , Y7 <: TupleTag]: Plus7[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Y1 , Y2 , Y3 , Y4 , Y5 , Y6 , Y7,
                NodeTuple1[Y1] , NodeTuple1[Y2] , NodeTuple1[Y3] , NodeTuple1[Y4] , NodeTuple1[Y5] , NodeTuple1[Y6] , NodeTuple1[Y7]
            ] = cachePlus7WithTypeParameter0Strict.asInstanceOf[Plus7[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Y1 , Y2 , Y3 , Y4 , Y5 , Y6 , Y7,
                NodeTuple1[Y1] , NodeTuple1[Y2] , NodeTuple1[Y3] , NodeTuple1[Y4] , NodeTuple1[Y5] , NodeTuple1[Y6] , NodeTuple1[Y7]
            ]]
             inline  def cachePlus8WithTypeParameter0Dynamic[Y1 <: TupleTag , Y2 <: TupleTag , Y3 <: TupleTag , Y4 <: TupleTag , Y5 <: TupleTag , Y6 <: TupleTag , Y7 <: TupleTag , Y8 <: TupleTag]: Plus8[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Y1 , Y2 , Y3 , Y4 , Y5 , Y6 , Y7 , Y8,
                NodeTuple1[Y1] , NodeTuple1[Y2] , NodeTuple1[Y3] , NodeTuple1[Y4] , NodeTuple1[Y5] , NodeTuple1[Y6] , NodeTuple1[Y7] , NodeTuple1[Y8]
            ] = new Plus8[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Y1 , Y2 , Y3 , Y4 , Y5 , Y6 , Y7 , Y8,
                NodeTuple1[Y1] , NodeTuple1[Y2] , NodeTuple1[Y3] , NodeTuple1[Y4] , NodeTuple1[Y5] , NodeTuple1[Y6] , NodeTuple1[Y7] , NodeTuple1[Y8]
            ] {
                    final override def takeHead1(z: NodeTuple1[Y1]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail1(z: NodeTuple1[Y1]): Y1 = z.i1
                    final override def plus1(x: ZsgTuple0, y: Y1): NodeTuple1[Y1] = new NodeTuple1(y)
                    final override def takeHead2(z: NodeTuple1[Y2]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail2(z: NodeTuple1[Y2]): Y2 = z.i1
                    final override def plus2(x: ZsgTuple0, y: Y2): NodeTuple1[Y2] = new NodeTuple1(y)
                    final override def takeHead3(z: NodeTuple1[Y3]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail3(z: NodeTuple1[Y3]): Y3 = z.i1
                    final override def plus3(x: ZsgTuple0, y: Y3): NodeTuple1[Y3] = new NodeTuple1(y)
                    final override def takeHead4(z: NodeTuple1[Y4]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail4(z: NodeTuple1[Y4]): Y4 = z.i1
                    final override def plus4(x: ZsgTuple0, y: Y4): NodeTuple1[Y4] = new NodeTuple1(y)
                    final override def takeHead5(z: NodeTuple1[Y5]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail5(z: NodeTuple1[Y5]): Y5 = z.i1
                    final override def plus5(x: ZsgTuple0, y: Y5): NodeTuple1[Y5] = new NodeTuple1(y)
                    final override def takeHead6(z: NodeTuple1[Y6]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail6(z: NodeTuple1[Y6]): Y6 = z.i1
                    final override def plus6(x: ZsgTuple0, y: Y6): NodeTuple1[Y6] = new NodeTuple1(y)
                    final override def takeHead7(z: NodeTuple1[Y7]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail7(z: NodeTuple1[Y7]): Y7 = z.i1
                    final override def plus7(x: ZsgTuple0, y: Y7): NodeTuple1[Y7] = new NodeTuple1(y)
                    final override def takeHead8(z: NodeTuple1[Y8]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail8(z: NodeTuple1[Y8]): Y8 = z.i1
                    final override def plus8(x: ZsgTuple0, y: Y8): NodeTuple1[Y8] = new NodeTuple1(y)
            }
            val cachePlus8WithTypeParameter0Strict: Plus8[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                TupleTag , TupleTag , TupleTag , TupleTag , TupleTag , TupleTag , TupleTag , TupleTag,
                NodeTuple1[TupleTag] , NodeTuple1[TupleTag] , NodeTuple1[TupleTag] , NodeTuple1[TupleTag] , NodeTuple1[TupleTag] , NodeTuple1[TupleTag] , NodeTuple1[TupleTag] , NodeTuple1[TupleTag]
            ] = cachePlus8WithTypeParameter0Dynamic[TupleTag , TupleTag , TupleTag , TupleTag , TupleTag , TupleTag , TupleTag , TupleTag]
            @inline def cachePlus8WithTypeParameter0[Y1 <: TupleTag , Y2 <: TupleTag , Y3 <: TupleTag , Y4 <: TupleTag , Y5 <: TupleTag , Y6 <: TupleTag , Y7 <: TupleTag , Y8 <: TupleTag]: Plus8[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Y1 , Y2 , Y3 , Y4 , Y5 , Y6 , Y7 , Y8,
                NodeTuple1[Y1] , NodeTuple1[Y2] , NodeTuple1[Y3] , NodeTuple1[Y4] , NodeTuple1[Y5] , NodeTuple1[Y6] , NodeTuple1[Y7] , NodeTuple1[Y8]
            ] = cachePlus8WithTypeParameter0Strict.asInstanceOf[Plus8[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Y1 , Y2 , Y3 , Y4 , Y5 , Y6 , Y7 , Y8,
                NodeTuple1[Y1] , NodeTuple1[Y2] , NodeTuple1[Y3] , NodeTuple1[Y4] , NodeTuple1[Y5] , NodeTuple1[Y6] , NodeTuple1[Y7] , NodeTuple1[Y8]
            ]]
}
