package classNov24

object flatmaps {
  def main (args:Array[String]){
    
    val num =List(1,2,3,4)
    
    def g(x:Int) = List(x-1,x,x+1)
    
    println(num.map(g))
    
    println(num.flatMap(g))
  }
}