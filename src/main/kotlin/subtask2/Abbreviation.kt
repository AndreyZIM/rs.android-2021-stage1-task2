package subtask2

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
        val indexes: MutableList<Int> = Array(b.length) { -1 }.toMutableList()
        for (i in b.indices) {
            for (j in a.indices) {
                if (a[j].toUpperCase() == b[i]) indexes[i] = j
            }
        }
        for (i in (1 until indexes.size))
            if (indexes[i] < indexes[i - 1]) return "NO"
        for (i in indexes.indices)
            if (indexes[i] == -1 ) return  "NO"
        return "YES"
    }
}
