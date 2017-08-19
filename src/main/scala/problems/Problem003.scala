package problems

import scala.annotation.tailrec
import scala.math.BigInt

object Problem003 {

  val two = BigInt.int2bigInt(2)

  def largestPrimeFactorOf(value: BigInt): BigInt = {
    primeFactorsOf(value).max
  }

  def primeFactorsOf(value: BigInt): Set[BigInt] = {
    @tailrec def primeFactors(value: BigInt, prime: BigInt = two, factors: Set[BigInt] = Set()):
    Set[BigInt] = {
      if(value == 1){
        factors
      } else {
        if(isPrime(prime) && value % prime == 0){
          primeFactors(value / prime, prime, factors + prime)
        } else {
          primeFactors(value, prime + 1, factors)
        }
      }
    }
    primeFactors(value);
  }

  def isPrime(prime: BigInt): Boolean = {
    !(two until prime exists (prime % _ == 0))
  }

}
