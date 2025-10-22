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
        withClue("silent should not be anagramOf ssilent"){"ssilent" anagramOf "silent" shouldBe false}
    }

    "Not an anagram for when one string is empty" {
        withClue("  should not be anagramOf silent"){"silent" anagramOf "" shouldBe false}
        withClue("silent should not be anagramOf  "){"" anagramOf "silent" shouldBe false}
    }

    "Is an anagram when two strings are non-empty and the exact same" {
        
        withClue("  should not be anagramOf  "){"" anagramOf "" shouldBe false}
    }

    "Is an anagram when two strings are non-empty and have the same characters in different order" {
        withClue("silent should be anagramOf listen"){"listen" anagramOf "silent" shouldBe true}
    }

    //Note case isnt sensitive when comparing characters

})

