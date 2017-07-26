trait HairColor

trait Iterator[A] {
  def hasNext: Boolean
  def next(): A

}

class InitIterator(to: Int) extends Iterator[Int] {
  private var current = 0
  override def hasNext: Boolean = current < to
  override def next(): Int = {
    if (hasNext) {
      val t = current
      current += 1
      t
    } else 0
  }
}

val iterator = new InitIterator(10)
iterator.next()
iterator.next()
