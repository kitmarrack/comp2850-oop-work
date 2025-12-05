package wordle

fun main() {
    val words = readWordList("data/words.txt") // assigning values in words.txt to words
    val target = pickRandomWord(words) // assigning random word form words to target
    var attempt = 0 // creating a pointer value
    while (attempt <= 6) { // loop allowing for 6 goes
        val guess = obtainGuess(attempt) // assigning valid guess from obtainGuess function and isValid function
        val check = evaluateGuess(guess, target) // creating the check list by calling evaluateGuess on guess and target
        displayGuess(guess, check) // using check to display the accuracy of the users guess
        attempt += 1
        if (guess == target) {
            println("\nCorrect!")
            break // breaking out of the loop as soon as the guess is correct
        }
    }
    println("\nThe word was $target")
}
