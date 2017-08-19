package problems

import scala.annotation.tailrec

object Problem002 {
  def sumEvenFibonacciNumbersUnderLimit(limit: BigInt): BigInt = {
    sumFibonacciNumbers(limit, (v: BigInt) => v % 2 == 0)
  }


  def sumFibonacciNumbers(limit: BigInt, additionFilter: (BigInt) => Boolean = _ => true): BigInt = {
    @tailrec def sumFibonacci(prev: BigInt = 1, next: BigInt = 2, total: BigInt = 0): BigInt = {
      if (next <= limit) {
        val newTotal = if (additionFilter(next)) total + next else total
        sumFibonacci(next, prev + next, newTotal)
      } else {
        total
      }
    }
    sumFibonacci()
  }
}
