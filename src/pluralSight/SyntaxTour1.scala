package pluralSight

object SyntaxTour1 {
  
  val language :String = "Scala"
  //this will make immutable constant name language of type string. Its like having a final keyword 
  
  //language ="ChangeLanguage" -> not allowed
  
  var lang ="Java" //this is a variable whose value can be changes later . Here no need to specify type as Scala is type inferred
  
  def main (args:Array[String]){
    println(language)
    
    println(lang)
    
    lang ="Scala" //perfectly fine as it was defined as a variable 
    
    println(lang)
    
    //operator precidence is same as java BODMAS
    
    val age =35
    var maxHeartRate = 210 -age*0.5
    
    print(maxHeartRate)
  }
  
}