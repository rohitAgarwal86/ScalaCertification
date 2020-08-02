package classNov24

object Filters {
  
  def main (args:Array[String]){
    
    val num= (1 to 10)
     val odd =num.filter(x => x%2 ==1)
     val even = num.filter(x => x%2 ==0)
     
     print(odd)
     println(even)
  }
  
  var fruit =List("Banana","apple","Cherry")
  
  var res = fruit.filter(f => f.length >5)
  println(res)
  
  var rating = List(2.4, 5.6, 7.2, 8.9)
  rating = rating.map( r => r*10)
  
  var student = rating.filter(g => g>60 && g<75)
  var result = student.map( r => r/10)
  
  println(result)
  
}