package problems

import org.scalatest.{FlatSpec, Matchers}

class Problem004Test extends FlatSpec with Matchers {

  "isPalindrome" should "return true when 12321 is passed" in {
    val isPalindrome = Problem004.isPalindrome(12321)
    assert(isPalindrome == true)
  }

  it should "return true when 12345 is passed" in {
    val isPalindrome = Problem004.isPalindrome(12345)
    assert(isPalindrome == false)
  }

  "findPalindromeProducts" should "return List(1, 2, 4, 3, 6, 9, 4, 8, 5, 6, 7, 8, 9, 11, 22, 33, 44, 55, 66, 77, 88, 99, 121, 272, 252, 171, 323)" in {
    val palindromeProducts = Problem004.findPalindromeProducts(20)
    assert(palindromeProducts == List(1, 2, 4, 3, 6, 9, 4, 8, 5, 6, 7, 8, 9, 11, 22, 33, 44, 55, 66, 77, 88, 99, 121, 272, 252, 171, 323))
  }

  "largestPalindromeProduct" should "return 9009 when 99 is passed" in {
    val palindrome = Problem004.largestPalindromeProduct(99)
    assert(palindrome == 9009)
  }

  //Euler Test
  it should "return 906609 when 999 is passed" in {
    val palindrome = Problem004.largestPalindromeProduct(999)
    assert(palindrome == 906609)
  }
}
