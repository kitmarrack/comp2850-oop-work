package wordle

import io.kotest.assertions.withClue
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.File


@Suppress("unused")
class WordleTest : StringSpec({
    // Write your tests here

    //isValid
    "Not isValid for a string that is longer than 5 characters" {
        withClue("hellol should not be isValid") {isValid("hellol") shouldBe false}
    }
    "Not isValid for a string that is shorter than 5 characters" {
        withClue("hell should not be isValid") {isValid("hell") shouldBe false}
    }
    "isValid for a string that is exactly 5 characters" {
        withClue("hello should be isValid") {isValid("hello") shouldBe true}
    }
    //readWordList
    "Mutable list of strings for readWordList of non empty text file" {
        val nonEmpty = File("wordle/data/nonEmpty.txt")
        nonEmpty.writeText("about\nbroke\ncrate")
        withClue("readWordList of nonEmpty text file should return mutable list of strings") {
            readWordList("wordle/data/nonEmpty.txt") shouldBe mutableListOf("about","broke","crate")}    
    }
    //"readWordList of an empty text file shoud return an empty mutable list" {

    //}
    //"readWordList of a non existent text file should not return anything" {

    //}

    //pickRandomWord

    //evaluateGuess
    }
)
