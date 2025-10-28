// Task 5.1.1: anagram checking using a function
fun anagrams(first: String, second: String): Boolean {
    if (first.length != second.length) {
        return false
    }
    val firstChars = first.lowercase().toList().sorted()
    val secondChars = second.lowercase().toList().sorted()
    return firstChars == secondChars
}

fun main () {
    print("Enter your first string: ")
    val first = readln()
    print("Enter your first string: ")
    val second = readln()
    println(anagrams(first, second))
}