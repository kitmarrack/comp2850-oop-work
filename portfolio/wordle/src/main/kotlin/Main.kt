package wordle
fun main() {
    val words = readWordList("data/words.txt") //calls readWordList, assigning its contents to a mutable list called words
    val target = pickRandomWord(words) //calls pickRandomWord on words, choosing a random word and assigning it to target
    var attempt = 0 //creating a pointer value 
    while (attempt <= 6) { //loop allowing for 6 goes
        val guess = obtainGuess(attempt) //calling obtain guess which in turn calls isValid and assigning the resulting input to guess
        val check = evaluateGuess(guess, target) //creating the check list by calling evaluateGuess on guess and target
        displayGuess(guess, check) //using check to display the accuracy of the users guess
        attempt += 1 
        if (guess == target) {
            println("\nCorrect!")
            break //breaking out of the loop as soon as the guess is correct
        }        
    }
    println("\nThe word was $target")

}
