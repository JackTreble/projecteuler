package problems

object Problem004 {

  def largestPalindromeProduct(value: Int): Int = {
    findPalindromeProducts(value).max
  }

  def findPalindromeProducts(value: Int) : List[Int] = {
    (1 to value).flatMap(i => (1 to i).filter(j => isPalindrome(i * j)).map(i * _)).toList
  }

  def isPalindrome(value: Int): Boolean = {
    value.toString == value.toString.reverse
  }

}
