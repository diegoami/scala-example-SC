object DeprecationDemo extends App {
  @deprecated
  def hello = "hola"
  hello
}

import scala.annotation.tailrec
def factorial(x: Int): Int = {
  @tailrec
  def factorialHelper(x: Int, accumulator: Int): Int = {
    if (x == 1) accumulator else factorialHelper(x - 1, accumulator * x)
  }
  factorialHelper(x, 1)
}

