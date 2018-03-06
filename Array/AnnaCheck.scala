package main.scala

/**
 * Given two strings check to see if they are Anagrams 
 */


import scala.collection.mutable.Map

class AnnaCheckClass(s1:String,s2:String){

  
  def aCheck():Boolean={
    s1.replace(" ","").sorted==s2.replace(" ","").sorted

  }

  //anna_check("life is good","good is life")


  def aCheck1(s1:String,s2:String):Boolean=
  {
    val str1 = s1.replace(" ","")
    val str2 = s2.replace(" ","")

    if (s1.length != s2.length)
    { return (false)}

    var m = scala.collection.mutable.Map[Char,Int]()

    for ( l <- str1)
    {
      if (m.get(l) != None)
      { m(l)= m(l) + 1
      }
      else {
        m(l)=1
      }

    }
    for ( l <- str2)
    {
      if (m.get(l) != None)
      {
        m(l) = m(l) - 1
      }
      else
      {
        m(l) = 1
      }
    }
    for ( l <- m.values)
    {
      if(l !=0)
      {
        return (false)
      }

    }

    return (true)

  }
  //anna_check1("life is good","good is lifek")


}


object AnnaCheck {
  def main(args: Array[String]) {
 val n = new AnnaCheckClass("life is good","good is life")
 val x =  n.aCheck()
 println("Annagran Check Result------->" + x )
  }
}
