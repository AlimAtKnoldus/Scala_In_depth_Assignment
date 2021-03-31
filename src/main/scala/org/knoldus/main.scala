package org.knoldus


object main extends App {

  val myQueue = new Queue[Any]

  val myList = List(10, 20, "Thirty")

  println(myQueue.isEmpty(myList))

  println(myQueue.enqueue(myList, "Forty"))

  println(myQueue.dequeue(myList))

  println(myQueue.Capacity(myList))

  println(myQueue.front(myList))

}
