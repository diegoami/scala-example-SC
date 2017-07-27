import scala.util.matching.Regex
val numberPattern: Regex = "[0-9]".r
numberPattern.findFirstMatchIn("awesomepassword") match {
  case Some(_) => println("Password OK")
  case None => println("Password must contain a number")
}