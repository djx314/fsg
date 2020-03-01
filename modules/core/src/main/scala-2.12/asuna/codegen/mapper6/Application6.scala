package asuna
import scala.language.higherKinds
abstract class Application6[F[_  , _  , _  , _  , _  , _ ] , Tag , X1 , X2 , X3 , X4 , X5 , X6] {
    def application(context: Context6[F]): F[X1 , X2 , X3 , X4 , X5 , X6]
}
object Application6 {
     def lift[F[_ , _ , _ , _ , _ , _], Tag, X1 , X2 , X3 , X4 , X5 , X6](appendTag: => AppendTag[Tag])( implicit  app: Application6[F, Tag, X1 , X2 , X3 , X4 , X5 , X6]): Application6[F, Tag, X1 , X2 , X3 , X4 , X5 , X6] = app
}