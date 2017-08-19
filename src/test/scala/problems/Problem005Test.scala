package problems

import org.scalatest.{FlatSpec, Matchers}

class Problem005Test extends FlatSpec with Matchers {

  val twoToTen = (2 to 10).toList
  val twoToTwenty = (2 to 20).toList

  "areMultiplesOf" should "return true when List(1 to 10) and 2520 is passed" in {
    val multipleOf = Problem005.areMultiplesOf(twoToTen, 2520);
    assert(multipleOf == true)
  }

  it should "return false when List(1 to 10) and 1111 is passed" in {
    val multipleOf = Problem005.areMultiplesOf(twoToTen, 1111);
    assert(multipleOf == false)
  }

  "smallestMultiple" should "return 2520 when List(1 to 10) is passed" in {
    val smallestMultiple = Problem005.smallestMultiple(twoToTen);
    assert(smallestMultiple == 2520)
  }

  it should "return 232792560 when List(1 to 20) is passed" in {
    val smallestMultiple = Problem005.smallestMultiple(twoToTwenty);
    assert(smallestMultiple == 232792560)
  }
}
