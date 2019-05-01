package kata02

class BinarySearch {
    def chop(key: Int, array: Array[Int]): Int = {
        if (array.length == 0) {
            return -1
        }

        val mid = array.length / 2
        val item = array(mid)
        if (item == key) {
            return mid;   
        }
        if (array.length > 1 && item > key) {
            return chop(key, array.slice(0, mid - 1))
        }
        if (array.length > 1 && item < key) {
            val x = chop(key, array.slice(mid + 1, array.length))
            return if (x == -1) x else mid + x
        }
        return -1
    }
}
