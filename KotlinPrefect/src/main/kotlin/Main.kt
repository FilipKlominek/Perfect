fun main() {
    val input = readLine()!!
    val int = input.toInt()
    for (i in 1..int) {
        if (isPerfect(i)) println(i)
    }
}
fun isPerfect(input: Int): Boolean {
    var sum = 0
    for (i in 1 until input) {
        if (input % i == 0) sum += i
    }
    return sum == input
}
