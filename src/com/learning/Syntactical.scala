package com.learning

class Customer(var Name : String , var Address : String) {
  var id ="";
  
}

object Customer{
  def main (args : Array[String])
  {
    val rohit = new Customer("Rohit","Pune");
    rohit.id =  "0001";
    println(rohit.Address + rohit.Name);
    println(rohit.id);
  }
}