package wordle

// Implement the six required functions here
import java.io.File

fun isValid(word: String): Boolean { // returns true if and only if there are 5 characters that are all letters
    if (word.length == 5) { // check word length is exactly 5
        for (i in 0..4) { // check that every character is a letter, returns false if they are not
            if (word[i].isLetter() == false) {
                return false
            }
        }
        return true
    } else {
        return false
    }
}

fun readWordList(filename: String): MutableList<String> { // stores the values in 'words.txt' into a mutable list
    val words: MutableList<String> = File(filename).readLines().toMutableList()
    return words
}

fun pickRandomWord(words: MutableList<String>): String { // picks a random target word from the array and returns it
    val randomWord = words.random() // assigning the random value to a variable which will be returned
    return randomWord
}

fun obtainGuess(attempt: Int): String { // prompts the user to enter a guess and loop until the guess is valid
    var guess: String // creates an empty string variable. did this so the variable exists outside the do..while loop
    do { // using do..while so the user is prompted and can enter a guess before any condition needs to be met
        print("\nAttempt $attempt: ")
        guess = readln().uppercase()
        if (isValid(guess)) { // breaking out of the loop is the guess is valid so the guess can be returned
            break
        }
        println("Invalid Guess, Try Again")
    } while (true)
    return guess
}

fun evaluateGuess(guess: String, target: String): List<Int> { // creates a check list used to display the guess
    var check: MutableList<Int> = mutableListOf(0, 0, 0, 0, 0) // uses 0's by default to reduce if statements
    for (i in 0..4) {
        if (guess[i] in target) {
            if (guess[i] == target[i]) {
                check[i] = 2 // check character set to 2 if the same characters in guess and target are equal.
            } else {
                check[i] = 1 // check character set to 1 if guess character is in a different place in target
            }
        }
    }
    return check
}

fun displayGuess(guess: String, check: List<Int>) { // printing the users guess in varying colours
    val reset = "\u001B[0m" // creating the colour variables that are used to print different colours
    val green = "\u001B[32m"
    val yellow = "\u001B[33m"
    for (i in 0..4) {
        if (check[i] == 2) { // printing a character in green if the corresponding guess and target characters are equal
            print("$green${guess[i]}$reset")
        } else if (check[i] == 1) { // printing in yello if the guess character is in target but in a different location
            print("$yellow${guess[i]}$reset") // reset used incase the next character of guess isnt in target
        } else {
            print(guess[i])
        }
    }
}
