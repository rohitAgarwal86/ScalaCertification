package classNov24

object higerOrderFunction {
  
  def main (args:Array[String]){
    
    def iden(x:Int) : Int = {return x}
    
   // To add the Ints between to given numbers. (2,4) => 2 + 3 + 4 = 9
         def sumInts(a:Int, b:Int) : Int = {
           return if(a > b) 0 else a + sumInts(a + 1, b)
         }
         
        // To calculate sum of Squares between 2 givern numbers. (2,4) = 2*2 + 3*3 + 4*4 = 4 + 9 + 16 = 29
         def square(x:Int) : Int = {return x * x}
         
         def sumOfSquares(a:Int, b:Int) : Int = {
           return if(a > b) 0 else square(a) + sumOfSquares(a + 1, b)
         }
         
         // To calculate sum of Power of two between 2 given numbers. (2,4) = 2^2 + 2^3 + 2^4 = 4 + 8 + 16 =28
         def powerTwo(x : Int) : Int = {if (x==0) 1 else 2 * powerTwo(x-1)}
         
         def sumOfPowerTwo(a:Int, b:Int) : Int = {
           return if(a > b) 0 else powerTwo(a) + sumOfPowerTwo(a + 1, b)
         }
         
         println("Sum of Ints : " + sumInts(2,4))
         println("Sum of Squares : " + sumOfSquares(2,4))
         println("Sum of Power Of Two : " + sumOfPowerTwo(2,4))
         println("============================================")
         
         // Higher Order Function
          def sum(f: Int => Int, a:Int, b:Int) : Int = {
                         return if(a > b) 0 else f(a) + sum(f, a + 1, b)
          }
         println("Sum of Ints : " + sum(iden, 2, 4))
         println("Sum of Squares : " + sum(square, 2, 4))
         println("Sum of Power Of Two : " + sum(powerTwo, 2, 4)) 
  }
  
}