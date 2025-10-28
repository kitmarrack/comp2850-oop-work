fun main() {
    print("PIZZA MENU\n(a) Margherita\n(b) Quattro Stagioni\n(c) Seafood\n(d) Hawaiian\nChoose your pizza (a-d): ")
    var answer = readln().lowercase()
    if (answer.length == 1) {
        val ch = answer.single()

        if ((ch != 'a') && (ch != 'b') && (ch != 'c') && (ch != 'd')) {
            println("Invalid Choice!")
        } else {
            println("Order Accepted")
        }
    } else {
        println("Invalid Choice!")
    }
}