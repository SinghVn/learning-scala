package lectures.part1

object Functions extends App{

  def firstFunc(a:String,b:Int):String={
    a+""+b
  }
  print(firstFunc("heloo",3))

  def parameterLessFun():Int=42
print(parameterLessFun)

  def recursiveFunc(str:String,n:Int):String={

    if(n==1) str
    else str+recursiveFunc(str,n-1);

  }
  print(recursiveFunc("hello",3))

  def factorialFunc(n:Int):Int={
    var m=1
    if(n==m){
      n*m
    }else
    n*factorialFunc(n-1)


  }
  //print(factorialFunc(8))
  def fabonaciFunc(n:Int):Int={
if(n<=2) 1
    else
    // println((n-1)+"+"+(n-2))
    fabonaciFunc(n-1)+fabonaciFunc(n-2)
  }
  print(fabonaciFunc(4))

  def isPrime(n:Int):Boolean={

    def isPrimeUntil(t:Int): Boolean=
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)

    isPrimeUntil(n/2)
  }
  println(isPrime(10))
}
