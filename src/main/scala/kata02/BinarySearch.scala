package kata02

class BinarySearch {
    def chop(key: Int, array: Array[Int]): Int = {
        if (array.length == 0) {
            return -1
        }

        val mid = array.length / 2
        val item = array(mid)

            if (item > key) {
                val x = chop(key, array.slice(0, mid - 1))
                return x
            }

            if (item < key) {
                val x = chop(key, array.slice(mid + 1, array.length))
                return if (x < 0) x else mid + x
            }

        return if (item == key) mid else -1
    }
}
