package problems

import scala.annotation.tailrec

object Problem005 {

  def smallestMultiple(multiples : List[Int]): Int = {
    @tailrec def findMultiple(value : Int): Int = {
      if(areMultiplesOf(multiples, value)){
        value
      } else {
        findMultiple(value + 1)
      }
    }
    findMultiple(multiples.max)
  }

  def areMultiplesOf(multiples : List[Int], value : Int) : Boolean = !(multiples exists (value % _ != 0))
}
