package problems

import scala.annotation.tailrec

object Problem005 {

  def smallestMutliple(multiples : List[Int]): Int = {
    @tailrec def findMultiple(multiples : List[Int], value : Int): Int = areMultiplesOf(multiples, value) match {
      case true => value
      case false => findMultiple(multiples, value + 1)
    }
    findMultiple(multiples, multiples.max)
  }

  def areMultiplesOf(multiples : List[Int], value : Int) : Boolean = !(multiples exists (value % _ != 0))
}
