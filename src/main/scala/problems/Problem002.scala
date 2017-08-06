package problems

import scala.annotation.tailrec

object Problem002 {
  def sumEvenFibonacciNumbersUnderLimit(limit : BigInt) : BigInt = {
    addFibNumbersFilteredLimited(limit, (v : BigInt) => v % 2 == 0)
  }

  @tailrec def addFibNumbersFilteredLimited(limit : BigInt, additionFilter : (BigInt) => Boolean, prev : BigInt = 0, next : BigInt = 1, count : BigInt = 0): BigInt = {
    if(count + next <= limit){
      val newCount = if (additionFilter(next)) count + next else count
      addFibNumbersFilteredLimited(limit, additionFilter, next, prev + next , newCount)
    } else {
      count
    }
  }
}
