package wordle
import java.io.File
import java.io.FileNotFoundException
import io.kotest.assertions.withClue
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.collections.shouldBeIn
import io.kotest.assertions.throwables.shouldThrow



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
    "Not isValid for a string that contains a special character" {
        withClue("hell! should not be isValid") {isValid("hell!") shouldBe false}
    }
    "Not isValid for a string that contains a number" {
        withClue("hell0 should not be isValid") {isValid("hell0") shouldBe false}
    }
    "isValid for a string that contains only lowercase letter characters" {
        withClue("hello should be isValid") {isValid("hello") shouldBe true}
    }
    "isValid for a string that contains only uppercase letter characters" {
        withClue("HELLO should be isValid") {isValid("HELLO") shouldBe true}
    }
    "isValid for a string that contains a mix of both lower and uppercase characters" {
        withClue("hElLo should be isValid") {isValid("hElLo") shouldBe true}
    }

    //readWordList
    "mutable list of strings for readWordList of non empty text file" {
        val nonEmpty = createTempFile()
        nonEmpty.writeText("about\nbroke\ncrate")
        withClue("readWordList of nonEmpty text file should return mutable list of strings") {readWordList(nonEmpty.path) shouldBe mutableListOf("about","broke","crate")}    
    }
    "empty mutable list for readWordList of empty text file" {
        val empty = createTempFile()
        empty.writeText("")
        withClue("readWordList of empty text file should return empty mutable list") {readWordList(empty.path) shouldBe mutableListOf()}
    }
    "FileNotFoundException for readWordList of non existent file" {
        withClue("readWordList of non existent text file should return FileNotFoundException") {shouldThrow<FileNotFoundException> {readWordList("doesNotExist.txt")}} 
    }

    //pickRandomWord
    "string that exists in list for pickRandomWord of non empty mutable list of strings, also only a single string returned" {
        val nonEmpty = mutableListOf("about","broke","crate")
        withClue("pickRandomWord of non empty mutable list should return a single string") {pickRandomWord(nonEmpty) shouldBeIn nonEmpty }
    }
    "NoSuchElementException for pickRandomWord of empty list" {
        val empty = mutableListOf<String>()
        withClue("pickRandomWord of empty mutable list should return NoSuchElementException") {shouldThrow<NoSuchElementException> {pickRandomWord(empty)}}
    }
    //evaluateGuess
    "characters in check are 2 when the same characters in guess and target are equal" {
        withClue("evaluateGuess of hello and hello should make check = [2,2,2,2,2]") {evaluateGuess("hello","hello") shouldBe listOf(2,2,2,2,2)}
    }
    "characters in check are 1 when the same character guess exists in target in a different position" {
        withClue("evaluateGuess of hello and lohel should make check = [1,1,1,1,1]") {evaluateGuess("hello","lohel") shouldBe listOf(1,1,1,1,1)}
    }
    "characters in check are 0 when the same character in guess doesnt appear in target" {
        withClue("evaluateGuess of abcde and fghij should make check = [0,0,0,0,0]") {evaluateGuess("abcde","fghij") shouldBe listOf(0,0,0,0,0)}
    }
}
)
