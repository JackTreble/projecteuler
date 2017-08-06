package problems

import scala.annotation.tailrec

object Problem002 {
  def sumEvenFibonacciNumbersUnderLimit(limit : BigInt) : BigInt = {
    addFibNumbersFilteredLimited(limit, (v : BigInt) => v % 2 == 0)
  }

  @tailrec def addFibNumbersFilteredLimited(limit : BigInt, additionFilter : (BigInt) => Boolean, prev : BigInt = 1, next : BigInt = 2, count : BigInt = 0): BigInt = {
    if(next <= limit){
      val newCount = if (additionFilter(next)) count + next else count
      addFibNumbersFilteredLimited(limit, additionFilter, next, prev + next , newCount)
    } else {
      count
    }
  }
}
