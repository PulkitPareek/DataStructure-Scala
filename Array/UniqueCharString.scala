package main.scala

/**
 * Given a string,determine if it is comprised of all unique characters.
 */
 
import scala.collection.mutable._
class UniqueCharStringClass(str: String){

  def uniqCharStr():Boolean={
  var chars = scala.collection.mutable.Set[Char]()
  
  for ( ch <- str) {
    if (!chars.contains(ch)){
      chars.add(ch)
      
      }
    else{
      println("String Contain duplicate characters")
      return false
     }
    }
  
  println("String Conatin unique characters")
  return true
  
  }
}

object UniqueCharString {
 def main(args: Array[String]) {
 val n = new UniqueCharStringClass("ABCDaba")
 n.uniqCharStr()
  }
}