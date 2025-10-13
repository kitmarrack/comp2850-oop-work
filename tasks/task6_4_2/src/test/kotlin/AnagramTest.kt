// Task 6.4.2

import io.kotest.assertions.withClue
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

@Suppress("unused")
class AnagramTest: StringSpec({
  
    //"Grade of Distinction for marks between 70 and 100" {
    //    withClue("Mark=100") { grade(100) shouldBe "Distinction" }
    //    withClue("Mark=85") { grade(85) shouldBe "Distinction" }
    //   withClue("Mark=70") { grade(70) shouldBe "Distinction" }
    //}

    "Not an anagram for two strings that are different lengths" {
        silent anagramOf ssilent shoudBe false
        silent anagramOf naskcil shouldBe false
    }

    "Not an anagram for when one string is empty" {
        "" anagramOf silent shouldBe false
        silent anagramOf "" shouldBe false

    }

    "Is an anagram when two strings are non-empty and the exact same" {
        "" anagramOf "" shouldBe false
        silent anagramOf silent shouldBe true 

    }

    "Is an anagram when two strings are non-empty and have the same characters in different order" {
        silent anagramOf listen shouldBe true
    }

    //Note case isnt sensitive when comparing characters

})

