package org.knoldus

class Queue [A]{

  // method to add element in the last of the list
  def enqueue(queue:List[A], value:A):List[A] = queue :+ value

  // method to remove first element of the list
  def dequeue(queue:List[A]):List[A] = queue match {
    case Nil => throw new NoSuchElementException("Queue is empty")
    case _ =>  val newQueue = queue.drop(1)
      newQueue
  }

  // method to check number of element in the list
  def Capacity(queue:List[A]):String = s"The capacity of this queue = ${queue.length}"

  // method to check first element of the list
  def front(queue: List[A]):A = queue match {
    case Nil => throw new NoSuchElementException("Queue is empty")
    case _ => queue.head
  }

  // method to check if list is empty or not
  def isEmpty(queue:List[A]):Boolean = queue match {
    case Nil => true
    case _ => false
  }
}




