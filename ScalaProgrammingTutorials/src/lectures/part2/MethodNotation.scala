package lectures.part2

object MethodNotation extends App{
 class Person(val name:String,favouriteMovie:String){
   def likes(movie:String)=movie==favouriteMovie
   def hangoutWith(person:Person):String= s"${this.name} is hanging out with ${person.name}"
   def apply():String="Apply method is getting callled"
 }
  val satu=new Person("satyendra","Rang De Basanti")
  val ritu=new Person("Ritu","Kaante")
  println(satu.likes("Rang De Basanti"))
  println(satu likes "Rang De Basanti")//infix notation
  println(satu.hangoutWith(ritu))
  println(satu())// compiler will search for apply method of the class 
  println(satu.apply())
}
