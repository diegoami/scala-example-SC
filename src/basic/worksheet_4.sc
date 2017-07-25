class Greeter(prefix: String, suffix: String) {
  def greet(name : String): Unit =
    println(prefix + name + suffix)
}

val greeter = new Greeter("Hello, ", "!")
greeter.greet("Scala developer")