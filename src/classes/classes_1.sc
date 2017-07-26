class User

val user1 = new User

class Point(var x: Int,  var y : Int) {

  def move(dx : Int, dy : Int): Unit = {
    x = x + dx
    y = y + dy
  }

  override def toString: String =
    s"($x, $y)"
}

val point1 = new Point(2,3)

point1.x

println(point1)


