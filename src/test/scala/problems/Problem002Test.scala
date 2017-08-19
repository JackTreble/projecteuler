package problems

import org.scalatest.{FlatSpec, Matchers}

class Problem002Test extends FlatSpec with Matchers {

  "sumFibonacciNumbers" should "return 18 when filtered to less than 10" in {
    val evenNumbers = Problem002.sumFibonacciNumbers(18, (v : BigInt)=> v < 10)
    assert(evenNumbers == 18)
  }

  "sumEvenFibonacciNumbersUnderLimit" should "return 44 when 100 is passed" in {
    val evenNumbers = Problem002.sumEvenFibonacciNumbersUnderLimit(100)
    assert(evenNumbers == 44)
  }

  it should "return 0 when 0 is passed" in {
    val evenNumbers = Problem002.sumEvenFibonacciNumbersUnderLimit(0)
    assert(evenNumbers == 0)
  }

  //Euler Test
  it should "return 4,613,732 when 4,000,000 is passed" in {
    val evenNumbers = Problem002.sumEvenFibonacciNumbersUnderLimit(4000000)
    assert(evenNumbers == 4613732)
  }
}
