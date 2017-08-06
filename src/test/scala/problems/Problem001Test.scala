package problems

import org.scalatest._

class Problem001Test extends FlatSpec with Matchers {

  "sumFilteredInRange" should "return 55 when 11 is passed and no filter" in {
    val multiples = Problem001.sumFilteredInRange(11, (v : Int) => true)
    assert(multiples == 55)
  }

  "sumFilteredInRange" should "return 55 when 100 is passed and filtered to below 10 " in {
    val multiples = Problem001.sumFilteredInRange(11, (v : Int) => v < 10)
    assert(multiples == 55)
  }

  "sumMultiplesOf3And5" should "return 23 when 10 is passed" in {
    val multiples = Problem001.sumMultiplesOf3And5(10)
    assert(multiples == 23)
  }

  it should "should return 0 when 0 is passed" in {
    val multiples = Problem001.sumMultiplesOf3And5(0)
    assert(multiples == 0)
  }


}
