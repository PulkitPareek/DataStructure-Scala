package main.scala

/**
 * Given these two arrays, find which element is missing in the second array.
 */
import scala.collection.mutable.Set

class LargeContSumClass(arr:Array[Int]){

 
def lgContSum()={

  
  var startPt,endPt=0
  var currSum, maxSum = arr(0)

  for ( (num,pos) <- arr.tail.zipWithIndex){
      if(currSum + num < num){
        startPt = pos
      }
    currSum = List(currSum + num,num).max
    maxSum = List(currSum, maxSum).max
        if(num>0){
          endPt = pos
        }
  }

  println(s"Max Sum: $maxSum , Start Positionof Array: $startPt, End Position of Array: $endPt" )

}
}


object LargeContSum {
 def main(args: Array[String]) {
 val n = new LargeContSumClass(Array(-1,2,3,4,5))
 n.lgContSum()

 
  }
}
