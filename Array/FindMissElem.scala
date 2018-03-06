package main.scala

/**
 * Given these two arrays, find which element is missing in the second array.
 */
import scala.collection.mutable.Set

class FindMissElemClass(arr1:Array[Int],arr2:Array[Int]){

 
def missElem()={

  var m = scala.collection.mutable.Map[Int,Int]()

  for ( l <- arr2)
  {
        if (m.get(l) != None)
        { 
          m(l)= m(l) + 1
        }
        else 
        {
            m(l)=1
        }

  }
  
  for ( l <- arr1){
    if (m.get(l) == None){
      println("Missing element is: " + l)
    }
  }

}
}


object FindMissElem {
 def main(args: Array[String]) {
 val n = new FindMissElemClass(Array(1,2,3,4,5),Array(1,2,3,4))
 n.missElem()

 
  }
}

