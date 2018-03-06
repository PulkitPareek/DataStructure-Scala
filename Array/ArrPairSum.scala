package main.scala



/**
 * Given an integer array, output all the unique pairs that sum up to a specific value k
 */
import scala.collection.mutable.Set

class ArrPairSumClass(arr:Array[Int],v: Int){

 
def arrayPairSum()={

  if(arr.length < 2)
  {
    println("Please provide array with more elements")
  }

  var seen = scala.collection.mutable.Set[Int]()
  var output = scala.collection.mutable.Set[(Int,Int)]()

  for(num <- arr)
  {

   var target = v - num
    if( !seen.contains(target)){
      seen += num
    }
    else{
      output.add((List(num,target).min,List(num,target).max))
    }

  }
  println("Unique Pairs --> ")
  for( i <- output)
  {
    println(i)
  }

}
}


object ArrPairSum {
 def main(args: Array[String]) {
 val n = new ArrPairSumClass(Array(3,3,5,1,4,2),6)
 n.arrayPairSum()
 
  }
}

