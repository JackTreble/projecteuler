package problems

import scala.annotation.tailrec

object Problem004 {

  def largestPalendromeProduct(value: Int): Int = {

    @tailrec def findPallendrome(lValue: Int, rValue: Int, oValue : Int, largePal : Int = 0):
    Int = (isPalendrome(lValue * rValue) && lValue * rValue > largePal, lValue, lValue > rValue) match {
      case(_, 0, _) => largePal
      case(true, _, false) => findPallendrome(oValue, rValue - 1, oValue, lValue * rValue)
      case(true, _, true) => findPallendrome(lValue - 1, rValue, oValue, lValue * rValue)
      case(false, _, false) => findPallendrome(oValue, rValue - 1, oValue, largePal)
      case(false, _, true) => findPallendrome(lValue - 1, rValue, oValue, largePal)
    }

    findPallendrome(value, value, value)
  }

  def isPalendrome(value: Int): Boolean = {
    value.toString == value.toString.reverse
  }
}
