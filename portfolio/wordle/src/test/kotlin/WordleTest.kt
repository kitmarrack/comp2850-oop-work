package wordle

import io.kotest.assertions.withClue
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe


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
    
    //pickRandomWord

    //evaluateGuess
    }
)
