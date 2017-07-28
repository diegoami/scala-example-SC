import scala.language.implicitConversions
implicit def int2Integer(x: Int) =
  java.lang.Integer.valueOf(x)