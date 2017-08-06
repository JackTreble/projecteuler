package problems

object Problem001 {
  def sumMultiplesOf3And5(target : Int) : Int = (1 to target - 1).filter((v: Int) => v % 3 == 0 || v % 5 == 0).sum
}