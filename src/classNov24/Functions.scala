package classNov24

object Functions {
  
  def main(args:Array[String])
  {
      
    def add (x:Double =3, y:Double =7) : Double = {
      var sum =0.0;
      sum =x+y;
      return sum;
    }
    
    println("SUM =" + add(2,8))
  
 
  def square(x:Double) :Double ={
    var square:Double =0;
    square = x*x
    return square
  }
    
    def sumofSquare(x:Double, y:Double ) : Double ={
      return square(x) + square(y)
    }
  
  println(sumofSquare(6, 7))
  println("Sum Of Square" + add(square(6),square(7)))
  }
}