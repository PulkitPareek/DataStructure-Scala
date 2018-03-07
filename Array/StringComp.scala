package main.scala

/**
 * Given a string in the form 'AAAABBBBCCCCCDDEEEE' compress it to become 'A4B4C5D2E4'
 */
 
import scala.collection.mutable._
class StringCompressClass(str: String){

 
def stringComp()= {


  var m = scala.collection.mutable.Map[Char,Int]()

  for (l <- str) {
    if (m.get(l) != None) {
      m(l) = m(l) + 1
    }
    else {
      m(l) = 1
    }
  }

  val l = m.toSeq.sortBy(_._1).map(p => p._1 + p._2.toString).mkString

  print("Compressed String is: " + l)


}

}


object StringCompress {
 def main(args: Array[String]) {
 val n = new StringCompressClass("AAAAABBBBAAA")
 n.stringComp()

 
  }
}