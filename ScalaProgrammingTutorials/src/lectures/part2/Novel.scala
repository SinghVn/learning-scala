package lectures.part2

class Novel(name:String,yrOfRelase: Int,author:Writer){

  def authorAge=yrOfRelase-author.yrOfBirth
  def isWrittenBy(author:Writer)=author==this.author
  def copy(newYr:Int):Novel=new Novel(name,newYr,author)
}

