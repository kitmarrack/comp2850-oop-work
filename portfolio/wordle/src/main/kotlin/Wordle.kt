// Implement the six required functions here
import java.io.File

isValid(word: String): Boolean {
}

readWordList(filename: String): MutableList<String> {
    val wordsFile = "data/words.txt" //opens the text file with words stored
    val wordArray: Array<String> = File(wordsFile).readlines().toTypedArray() //reads the lines and stores all the words in an array
}

pickRandomWord(words: MutableList<String>): String {
    val randomWord = wordArray.random()
    return randomWord
}

obtainGuess(attempt: Int): String {
    println("Enter your guess ")
    var guess = readLine()
    return guess
}

evaluateGuess(guess: String, target: String): List<Int> {
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
        
        
    




displayGuess(guess: String, matches: List<Int>) {

}