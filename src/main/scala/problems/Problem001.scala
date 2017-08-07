package problems

object Problem001 {
  def sumMultiplesOf3And5(target : Int): Int ={
    sumFilteredInRange(target, (v: Int) => v % 3 == 0 || v % 5 == 0);
  }
  def sumFilteredInRange(target : Int, filter : (Int) => Boolean) : Int = (1 until target).filter(filter).sum
}