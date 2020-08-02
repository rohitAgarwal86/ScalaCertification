

package classNov24

object test {
  
  def main (args: Array[String]){
  var marks = 100
  var grade =""
  
  if(marks <=100 && marks>=80){
    grade ="A"
  }else if(marks <=79 && marks >=60){
    grade ="B"
  }else if(marks <=59 && marks >=35){
    grade ="C"
  }else if(marks <35 && marks >=0){
    grade ="Fail"
  }else
  {
    println("Invalid Marks")
  }
  
  println(grade)
  }
}