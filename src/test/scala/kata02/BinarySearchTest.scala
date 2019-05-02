package kata02

import org.scalatest._

class BinarySearchTest extends FlatSpec with Matchers {

    private val arrayOfThree = Array[Int](1, 3, 5)
    private val arrayOfFour = Array[Int](1, 3, 5, 7)

    private val search = BinarySearch

    it should "return negative 1 if there is nothing to find" in {
        search.chop(3, Array[Int]()) should be(-1)
    }

    it should "return negative 1 if the key does not exist in the list" in {
        search.chop(3, Array[Int](1)) should be(-1)
    }

    it should "find the key in an array with one item" in {
        search.chop(1, Array[Int](1)) should be(0)
    }

    it should "find the 1st in an array of 3" in {
        search.chop(1, arrayOfThree) should be(0)
    }

    it should "find the 2nd in an array of 3" in {
        search.chop(3, arrayOfThree) should be(1)
    }

    it should "find the 3rd in an array of 3" in {
        search.chop(5, arrayOfThree) should be(2)
    }

    it should "return -1 in an array of 3" in {
        search.chop(0, arrayOfThree) should be(-1)
        search.chop(2, arrayOfThree) should be(-1)
        search.chop(4, arrayOfThree) should be(-1)
        search.chop(6, arrayOfThree) should be(-1)
    }

    it should "handle lists with 4 items" in {
        search.chop(1, arrayOfFour) should be(0)
        search.chop(3, arrayOfFour) should be(1)
        search.chop(5, arrayOfFour) should be(2)
        search.chop(7, arrayOfFour) should be(3)
    }

    it should "return -1 with an array of 4" in {
        search.chop(0, arrayOfFour) should be(-1)
        search.chop(2, arrayOfFour) should be(-1)
        search.chop(4, arrayOfFour) should be(-1)
        search.chop(6, arrayOfFour) should be(-1)
        search.chop(8, arrayOfFour) should be(-1)
    }
}

