package pluralSight

object methodDefinitions {
  
  def max (x:Int, y:Int) : Int = { //notice Here we need to specify the type of the parameter , this is not inferred by Scala. Also 
    if(x > y)                        //Also no need to use ";" to end a statement , while if you do no problem
      return x                        // = at the end of the method definition tells Scala tha the method will return a value
    else                              //if you exclude the = sign , this method will not return anything and will be like void        
      return y
  }
  
  def minNoReturn(x:Int, y:Int) {
    if(x < y)
      println(x)
     else
      println(y)
  }
  
   def main (args:Array[String]){
     println(max(23,32))
     
     minNoReturn(23,11)
   }
}