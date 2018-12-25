package lectures.part1

import scala.annotation.tailrec

object Recursions extends  App{

  def recursiveFact(n:Int):BigInt={
     def factHelper(n:Int, act:BigInt):BigInt={
      if(n<=1) act
      else factHelper(n-1,n*act)// tail recursive function: the function is the last expression of the call
    }
    factHelper(n,1)
  }
println(recursiveFact(5))

  def tailRecFavonacci(n:Int):Int={
@tailrec
    def favonacciHelper(i:Int,previousNumber:Int,secondPreviousNum:Int):Int=

      if(i>=n) previousNumber
      else favonacciHelper(i+1,previousNumber+secondPreviousNum,previousNumber)

      if(n<=2) 1
      else favonacciHelper(2,1,1)


  }
  println(tailRecFavonacci(8))
}
