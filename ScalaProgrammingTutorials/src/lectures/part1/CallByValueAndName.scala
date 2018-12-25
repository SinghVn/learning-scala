package lectures.part1

object CallByValueAndName extends App{

  def callBYValue(number:Long)={
  println("call by value 1= "+ number)
    println("call by value 2= "+ number)
  }

  def callBYName(number: => Long)={
    println("call by name 1= "+ number)
    println("call by namew 2= "+ number)
  }

  println(callBYValue(System.nanoTime()))
  println(callBYName(System.nanoTime()))
}
