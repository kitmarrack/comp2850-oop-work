// Implement the six required functions here
import java.io.File

fun isValid(word: String): Boolean {
    if (word.length == 5) {
        return true
    } else {
        return false
    }
}

fun readWordList(filename: String): MutableList<String> {
    val words: MutableList<String> = File(filename).readLines().toMutableList()
    return words
}

fun pickRandomWord(words: MutableList<String>): String {
    val randomWord = words.random()
    return randomWord
}

fun obtainGuess(attempt: Int): String {
    var guess: String
    do {
        print("\nAttempt $attempt: ")
        guess = readln().uppercase()
    } while (isValid(guess) == false)
    return guess
}


fun evaluateGuess(guess: String, target: String): List<Int> {
    var check: MutableList<Int> = mutableListOf(0,0,0,0,0)
    for (i in 0..4) {
        if (guess[i] in target) {
            if (guess[i] == target[i]) {
                check[i] = 2
            } else {
                check[i] = 1
            }
        }
    }
    return check
}
        
fun displayGuess(guess: String, check: List<Int>) {
    val reset = "\u001B[0m"
    val green = "\u001B[32m"
    val yellow = "\u001B[33m"
    //var displayList: MutableList<String> = mutableListOf("?","?","?","?","?")
    for (i in 0..4) {
        if (check[i] == 2) {
            print("$green${guess[i]}$reset")
        } else if (check[i] == 1) {
            print("$yellow${guess[i]}$reset")
        } else {
            print(guess[i])
        }
    }
}