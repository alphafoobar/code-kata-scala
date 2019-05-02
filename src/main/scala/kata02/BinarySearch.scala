package kata02

object BinarySearch {
    def chop(key: Int, array: Array[Int]): Int = {
        if (array.length == 0) {
            return -1
        }

        val mid = array.length / 2
        val item = array(mid)
        if (item == key) {
            return mid
        }
        if (item > key) {
            return chop(key, array.slice(0, mid))
        }
        if (item < key) {
            val start = mid + 1
            val x = chop(key, array.slice(start, array.length))
            if (x > -1) {
                return start + x
            }
        }
        -1
    }
}
