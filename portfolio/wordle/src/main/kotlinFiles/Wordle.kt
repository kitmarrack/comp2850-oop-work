// Implement the six required functions here
package kotlinFiles

import java.io.File

fun isValid(word: String): Boolean {
}

fun readWordList(filename: String): MutableList<String> {
    val wordsFile = "data/words.txt" //opens the text file with words stored
    val wordArray: Array<String> = File(wordsFile).readlines().toTypedArray() //reads the lines and stores all the words in an array
}

fun pickRandomWord(words: MutableList<String>): String {
    val randomWord = wordArray.random()
    return randomWord
}

fun obtainGuess(attempt: Int): String {
    println("Enter your guess ")
    var guess = readLine()
    return guess
}

fun evaluateGuess(guess: String, target: String): List<Int> {
    var guess = guess.toTypedArray()
    var randomWord = randomWord.toTypedArray()
    var check = arrayOf('0','0,'0','0','0')

    for (i in 0,4) {
        if guess[i] == randomWord[i] {
            check[i] = 2
        }
    }

    for (i in 0,4) {
        if check[i] != 2 {
            for j(0,4) {
                if guess[i] == randomWord[j] {
                    check[i] = 1
                }
            }
        }
    }
   

}
        
fun displayGuess(guess: String, matches: List<Int>) {
    val green = "\u001b[32m"
    val orange = "\u001b[38;5;208m"
    val reset = "\u001b[0m"
    for (i in 0,4) {
        if check[i] == 0 {
            println(guess[i])
        } else if check[i] == 1 {
            println(orange + guess[i] + reset)
        } else {
            println(green + guess[i] + reset)
        }
    }
}