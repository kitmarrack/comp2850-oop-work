package wordle
fun main() {
    val words = readWordList("data/words.txt")
    val target = pickRandomWord(words)
    println(target)
    var attempt = 0
    while (attempt <= 10) {
        val guess = obtainGuess(attempt)
        val check = evaluateGuess(guess, target)
        displayGuess(guess, check)
        attempt += 1
        if (guess == target) {
            println("\nCorrect!")
            break
        }        
    }

}
