

package classNov24

object forLooping {
  
   def main(args:Array[String])
  {
    for(i <- 1 to 3)
    {
      for(j <- 1 to 3)
      {
        println (i,j)
      }
    }
    
    for(i <- 1 to 3;j <- 1 to 3; if i==j)
    {
      print(i,j)
    }
  }
}