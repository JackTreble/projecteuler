package problems

import scala.annotation.tailrec

object Problem002 {
  def sumEvenFibonacciNumbersUnderLimit(limit: BigInt): BigInt = {
    addFibNumbersFilteredLimited(limit, (v: BigInt) => v % 2 == 0)
  }

  @tailrec def addFibNumbersFilteredLimited(limit: BigInt, additionFilter: (BigInt) => Boolean, prev: BigInt = 1, next: BigInt = 2, count: BigInt = 0): BigInt = (next <= limit, additionFilter(next)) match {
    case (false, _) => count
    case (true, true) => addFibNumbersFilteredLimited (limit, additionFilter, next, prev + next, count + next)
    case (true, false) => addFibNumbersFilteredLimited (limit, additionFilter, next, prev + next, count)
  }
}
