package classNov24

object HOFmap {
  
  def main (args:Array[String]){
    
    val l =List(1,2,3,4)
    
    //anonymous or lambda function without any name
    val res =l.map(x => x*x)
    
    println(res)
    
    val fruit = List("apple","banana","cherry")
    
    val len =fruit.map( x => (x,x.length))
    
    println(len)
    
    val input = List(1,2,3)
    
    var inter = input.map(i => i+1)
    
    inter =inter.map(s => s*s)
    
    inter =inter.map(m => m-1)
    
    inter =inter.map(c => -c)
    
    println(inter)
    
    var result = input.map(i => i + 1).map(s => s * s).map(m => m - 1).map(c => -c)
    print(result)
}
}