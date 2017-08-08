package problems

import org.scalatest.{FlatSpec, Matchers}

class Problem004Test extends FlatSpec with Matchers {

  "isPalendrome" should "return true when 12321 is passed" in {
    val isPalendrome = Problem004.isPalendrome(12321)
    assert(isPalendrome == true)
  }

  it should "return true when 12345 is passed" in {
    val isPalendrome = Problem004.isPalendrome(12345)
    assert(isPalendrome == false)
  }

  //Euler Test
  it should "return 906609 when 999 is passed" in {
    val palendrome = Problem004.largestPalendromeProduct(999)
    assert(palendrome == 906609)
  }
}
