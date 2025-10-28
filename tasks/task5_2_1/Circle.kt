// Task 5.2.1: geometric properties of circles
import kotlin.math.PI

fun circleArea(radius: Double) = PI * radius * radius

fun circlePerimeter(radius: Double) = 2 * PI * radius

fun readDouble(prompt: String): Double {
    print(prompt)
    val radius = readln().toDouble()
    return radius
}

fun main () {
    val prompt = "Enter your radius: "
    val radius = readDouble(prompt)
    val cA = circleArea(radius)
    val cP = circlePerimeter(radius)
    println("Area = $cA")
    println("Perimeter = $cP")
}