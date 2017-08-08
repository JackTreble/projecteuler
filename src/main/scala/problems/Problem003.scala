package problems

import scala.annotation.tailrec

object Problem003 {

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
    !(prime % 2 == 0 && prime % 3 == 0)
  }

  def largestPrimeFactorOf(value: BigInt): BigInt = {
    primeFactorsOf(value).max
  }


}
