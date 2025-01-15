fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val sum = list.fold(0) { acc, i ->
        if (i == 3) {
            throw Exception("Three is not allowed")
        }
        acc + i
    }
    println(sum)
}