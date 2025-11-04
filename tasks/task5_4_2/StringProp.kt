val String.tooLong: Boolean get() = this.length > 20

fun main() {
    println("Enter your string: ")
    val str = readln()
    if (str.tooLong) {
        println("This string is too long!")
    } else {
        println("This string is fine")
    }
}