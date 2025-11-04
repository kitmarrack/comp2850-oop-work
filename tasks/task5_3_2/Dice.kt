// Task 5.3.2: dice rolling simulation
import kotlin.random.Random

fun rollDice(sides: Int = 6, noDice: Int = 1) {
    if (sides in setOf(4, 6, 8, 10, 12, 20)) {
        var total = 0
        repeat(noDice) {
            println("Rolling a d$sides...")
            val result = Random.nextInt(1, sides + 1)
            println("You rolled $result")
            total += result
        }
        println("Your total is $total")
    }
    else {
        println("Error: cannot have a $sides-sided die")
    }
}


fun main() {
    println("Enter the number of sides or leave blank for 6: ")
    val sides = readln()
    println("Enter the number of dice or leave blank for 1: ")
    val noDice = readln()

    when {
    sides.isBlank() && noDice.isBlank() -> rollDice()
    sides.isNotBlank() && noDice.isBlank() -> rollDice(sides.toInt())
    sides.isBlank() && noDice.isNotBlank() -> rollDice(noDice.toInt())
    else -> rollDice(sides.toInt(), noDice.toInt())
    }
}

