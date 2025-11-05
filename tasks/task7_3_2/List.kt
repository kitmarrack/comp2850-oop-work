// Task 7.3.1: list element access
fun main() {
    val numbers = mutableListOf(9, 3, 6, 2, 8, 5)
    numbers.addAll(numbers)
    println(numbers)
    numbers.remove(9)
    println(numbers)
    numbers.removeAt(1)
    println(numbers)
    numbers.clear()
    println(numbers)
    numbers.add(6)
    numbers.add(7)
    println(numbers)
}