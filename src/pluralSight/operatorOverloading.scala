package pluralSight

object operatorOverloading {
  
  //all operator in scala are essentially class and using object we call them 
  //if we need we can override the operator classes provided by java to use it as our own  
  //Number and literals are all object in scala and there are placed in the heap instead of stack in Java
   val age =35
  
  def *(x:Int) :Int ={
    return x*x*x
  }
  
   def main (args:Array[String]){
     
     println(age * 0.5)
   }
  
}