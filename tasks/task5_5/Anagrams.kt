infix fun String.anagramOf(second: String) = this.lowercase().toList().sorted() == second.lowercase().toList().sorted()


fun main () {
    print("Enter your first string: ")
    val first = readln()
    print("Enter your first string: ")
    val second = readln()
    if (first anagramOf second) {
        println("$first is an anagram of $second")
    }
}