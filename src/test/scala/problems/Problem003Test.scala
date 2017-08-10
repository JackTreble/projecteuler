package problems

import org.scalatest.{FlatSpec, Matchers}

class Problem003Test extends FlatSpec with Matchers {

  "isPrime" should "return true for input of 7" in {
    val isPrime = Problem003.isPrime(BigInt(7))
    assert(isPrime == true)
  }

  it should "return true for input of 6" in {
    val isPrime = Problem003.isPrime(BigInt(6))
    assert(isPrime == false)
  }

  it should "return true for input of 49" in {
    val isPrime = Problem003.isPrime(BigInt(49))
    assert(isPrime == false)
  }

  "factorsOf" should "return 2, 3 and 5 for input of 60" in {
    val factors = Problem003.primeFactorsOf(60)
    assert(factors == Set[BigInt](2, 3, 5))
  }

  it should "return 5, 7, 13 and 29 for input of 13,195" in {
    val factors = Problem003.primeFactorsOf(13195)
    assert(factors == Set[BigInt](5, 7, 13, 29))
  }

  "largestPrimeFactorOf" should "return 29 for input of 13,195" in {
    val largestPrimeFactorOf = Problem003.largestPrimeFactorOf(13195)
    assert(largestPrimeFactorOf == 29)
  }

  //Euler Test
  it should "return 6,857 for input of 600,851,475,143" in {
    val largestPrimeFactorOf = Problem003.largestPrimeFactorOf(BigInt("600851475143"))
    assert(largestPrimeFactorOf == 6857)
  }
}
