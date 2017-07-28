object InferenceTest1 extends App {
  val x = 1 + 2 * 3         // the type of x is Int
  val y = x.toString()      // the type of y is String
  def succ(x: Int) = x + 1  // method succ returns Int values
}


object InferenceTest2 {
  def fac(n: Int) = if (n == 0) 1 else n * fac(n - 1)
}


case class MyPair[A, B](x: A, y: B);
object InferenceTest3 extends App {
  def id[T](x: T) = x
  val p = MyPair(1, "scala") // type: MyPair[Int, String]
  val q = id(1)              // type: Int
}



