// Task 6.4.2: anagram checking function

infix fun String.anagramOf(other: String) = when {
    this.length != other.length -> false 
    (this.length == 0) and (other.length == 0) -> false
    else -> {
        val theseChars = this.lowercase().toList().sorted()
        val otherChars = other.lowercase().toList().sorted()
        theseChars == otherChars   
    }
}
