package lectures.part2

object OOBasic extends App {

  var person=new Person("Abc",25)
println(person.name)// name is not the class level field

  //to define class level fields we need to define the class declaration like this:

  class Person(val name:String,val age:Int)

  val author=new Writer("john","mks",1987);
  val novel=new Novel("x",2007,author)
  print(novel.authorAge)
  println(novel.isWrittenBy(author))
}
