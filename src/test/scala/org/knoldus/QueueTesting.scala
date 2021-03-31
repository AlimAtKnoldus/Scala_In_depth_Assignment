package org.knoldus

import org.scalatest.flatspec.AnyFlatSpec


class QueueTesting extends AnyFlatSpec {

  val myQueue = new Queue[Any]
  val myList = List(10,20)
  val emptyList = List()

  "Test" should "perform enqueue operation on queue" in {
    val result = myQueue.enqueue(myList, 30)
    assert(result.nonEmpty)
  }

  "Test" should "perform dequeue operation on queue" in {
    val result = myQueue.dequeue(myList)
    assert(result.nonEmpty)
  }

  "Test" should "not perform enqueue operation if queue is empty" in {
    assertThrows[NoSuchElementException](myQueue.dequeue(emptyList))
  }

  "Test" should "return first element if the queue is not empty" in {
    val result = myQueue.front(myList)
    assert(result != Nil)
  }

  "Test" should "throw exception if the queue is empty" in {
    assertThrows[NoSuchElementException](myQueue.front(emptyList))
  }

  "Test" should "perform isEmpty operation and return true if queue is empty" in {
    val result = myQueue.isEmpty(emptyList)
    assume(result)
  }
}
