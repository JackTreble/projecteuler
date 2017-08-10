package problems

import scala.annotation.tailrec
import scala.math.BigInt

object Problem003 {

  def largestPrimeFactorOf(value: BigInt): BigInt = {
    primeFactorsOf(value).max
  }

  def primeFactorsOf(value: BigInt): Set[BigInt] = {
    @tailrec def primeFactors(value: BigInt, prime: BigInt = 2, facts: Set[BigInt] = Set()):
    Set[BigInt] = (value == 1, isPrime(prime), value % prime == 0) match {
      case (true, _, _) => facts
      case (_, true, true) => primeFactors(value / prime, prime, facts + prime)
      case (_, _, _) => primeFactors(value, prime + 1, facts)
    }

    primeFactors(value);
  }

  def isPrime(prime: BigInt): Boolean = {
    val two = BigInt.int2bigInt(2)
    !(two until prime exists (prime % _ == 0))
  }

}
