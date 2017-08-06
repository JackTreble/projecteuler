package problems

import org.scalatest._

class Problem001Test extends FlatSpec with Matchers {

  "sumMultiplesOf3And5" should "return 23 when 10 is passed" in {
    val multiples = Problem001.sumMultiplesOf3And5(10)
    assert(multiples == 23)
  }

   it should "should return 0 when 0 is passed" in {
    val multiples = Problem001.sumMultiplesOf3And5(0)
    assert(multiples == 0)
  }

}
