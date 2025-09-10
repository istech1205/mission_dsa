fun main() {
  
  val str = "(())()(("
  var open =0
  var valid =0
  for(ch in str){
      println("char -- $ch")
      
      if(ch=='(')open++
      else if(ch==')' && open>0)
      {
          open--
          valid++
          
      }
  }  
  println("valid parenthesis -- $valid")
}

