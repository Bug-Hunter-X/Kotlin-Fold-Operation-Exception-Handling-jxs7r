fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    var sum = 0
    try {
        sum = list.fold(0) { acc, i ->
            if (i == 3) {
                throw Exception("Three is not allowed")
            }
            acc + i
        }
    } catch (e: Exception) {
        println("An error occurred: "+ e.message)
        sum = list.filter { it != 3 }.sum()
    }
    println("Sum: $sum")
}