package kata02

class BinarySearch {
    def chop(key: Int, array: Array[Int]): Int = {
        if (array.length == 0) {
            return -1
        }
        if (array.length == 1 && array(0) == key) {
            return if (array(0) == key) 0 else -1
        }
        val mid = divideForMid(array.length)
        val item = array(mid)
        if (item == key) {
            return mid
        }

        if (array.length > 1) {
            if (item > key) {
                val x = chop(key, array.slice(0, mid - 1))
                return x
            }

            if (item < key) {
                val x = chop(key, array.slice(mid + 1, array.length))
                return if (x < 0) x else mid + x
            }
        }
        -1
    }

    private def divideForMid(length: Int): Int = {
        length / 2
    }
}
