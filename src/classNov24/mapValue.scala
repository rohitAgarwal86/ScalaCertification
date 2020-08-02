package classNov24

object mapValue {
  def main (args:Array[String]){
    
    val pair =Map(1->2,2->4,3->5,4->10)
    
    val result = pair.mapValues(x => x*2)
    
    println(result)
  }
}