// Task 5.1.2: die rolling simulation
import kotlin.random.Random

fun rollDie(sides: Int = 6) {
    if (sides in setOf(4, 6, 8, 10, 12, 20)) {
        println("Rolling a d$sides...")
        val result = Random.nextInt(1, sides + 1)
        println("You rolled $result")
    }
    else {
        println("Error: cannot have a $sides-sided die")
    }
}

fun readInt(sides: String): Int {
    var sides = sides.toInt()
    return sides
}

fun main () {
    println("Enter dice side number: ")
    var sides = readln()
    if (sides.isEmpty()) {
        rollDie()
    } else {
        rollDie(readInt(sides))
    }
}





