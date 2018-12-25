package lectures.part1

object ValueVariablesTypesTest extends  App{
  var x:Int=42;
  print(x);

  val x1=42;
  //x1=44; val is immutable you can not reassign a value to it. and type of val is optional and compiler can infer types.

  val astr:String ="abc"
  val anStr:String="anotherStr"
  val aBoolean :Boolean=true;
  val chr:Char='a'
  val aDouble:Double=3.2
}
