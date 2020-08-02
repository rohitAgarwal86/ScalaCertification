

package classNov24

object factorial {
  
  def main(args:Array[String])
  {
     var num =3;
     var factorial =1
     
    
     while(num>=1)
     {
       factorial =factorial * num
       num=num -1
     }
     
     println("Factorial of Number :" + factorial)
  }
}