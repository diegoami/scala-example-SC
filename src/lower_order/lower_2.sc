trait Node[+B] {
  def prepend[U >: B](elem: U)
}
case class ListNode[+B](h: B, t: Node[B]) extends Node[B] {
  def prepend[U >: B](elem: U) = ListNode[U](elem, this)
  def head: B = h
  def tail = t
}
case class Nil[+B]() extends Node[B] {
  def prepend[U >: B](elem: U) = ListNode[U](elem, this)
}


trait Mammal
case class AfricanSwallow() extends Mammal
case class EuropeanSwallow() extends Mammal
val africanSwallowList= ListNode[AfricanSwallow](AfricanSwallow(), Nil())
val mammalList: Node[Mammal] = africanSwallowList
mammalList.prepend(new EuropeanSwallow)