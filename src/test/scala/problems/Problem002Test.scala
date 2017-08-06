package problems

import org.scalatest.{FlatSpec, Matchers}

class Problem002Test extends FlatSpec with Matchers {

  "sumEvenFibonacciNumbersUnderLimit" should "return 44 when 100 is passed" in {
    val evenNumbers = Problem002.sumEvenFibonacciNumbersUnderLimit(100)
    assert(evenNumbers == 44)
  }

  it should "should return 0 when 0 is passed" in {
    val evenNumbers = Problem002.sumEvenFibonacciNumbersUnderLimit(0)
    assert(evenNumbers == 0)
  }

  "addFibNumbersFilteredLimited" should "return 20 when filtered to less than 10" in {
    val evenNumbers = Problem002.addFibNumbersFilteredLimited(20, (v : BigInt)=> v < 10)
    assert(evenNumbers == 20)
  }
}
