package wordle

// Implement the six required functions here
import java.io.File

fun isValid(word: String): Boolean {
    if (word.length == 5) {
        for (i in 0..4) {
            if (word[i].isLetter() == false) {
                return false
            }
        } //ensures the length of guess is 5 characters
        return true
    } else {
        return false
    }
}

fun readWordList(filename: String): MutableList<String> { //stores the values in 'words.txt' into a mutable list and returns them
    val words: MutableList<String> = File(filename).readLines().toMutableList()
    return words
}

fun pickRandomWord(words: MutableList<String>): String { //picks a random target word from the array and returns it
    val randomWord = words.random()
    return randomWord
}

fun obtainGuess(attempt: Int): String { //prompts the user to enter a guess and continues to ask until the guess is valid
    var guess: String
    do {
        print("\nAttempt $attempt: ")
        guess = readln().uppercase()
        if (isValid(guess)) {
            break
        }
        println("Invalid Guess, Try Again")
    } while (true)
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