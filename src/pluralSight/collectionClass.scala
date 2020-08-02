package pluralSight

object collectionClass {
  
   def main (args:Array[String]){
     
     val list = List(2,3,4,5) //immutable in nature and cannot be modified alter (elements added , removed or update not allowed)
     
     val mapExample = Map(1 -> "a",2-> "b") //immutable
     
     list.foreach(values => print(values)) 
     
     for( values <- list)
       println(values)
       
     mapExample.values.foreach(values =>println(values)) //values method fetch all the values from the map and iterating over it give us the values 
     
     
     for(values <- list.reverse)
       println(values)
     
     
       //creating java list instead of Scala immitable list
       
       val javaList = new java.util.ArrayList[String] // the generic in Scala is defined by [] brackets instead of <> in java
                                                       // notice we have not mentioned the () brackets at the end , as we are not passing any value we can omit it
       println(javaList.size)
     
     
   }
}