fun main() {
    print("PIZZA MENU\n(a) Margherita\n(b) Quattro Stagioni\n(c) Seafood\n(d) Hawaiian\nChoose your pizza (a-d): ")
    var answer = readln().lowercase()
    var valid = false
    while (valid == false) {
        if (answer.length == 1) {
            val ch = answer.single()
            if ((ch == 'a') || (ch == 'b') || (ch == 'c') || (ch == 'd')) {
                println("Order Accepted")
                valid = true
            } else {
                println("Invalid Choice")
                print("PIZZA MENU\n(a) Margherita\n(b) Quattro Stagioni\n(c) Seafood\n(d) Hawaiian\nChoose your pizza (a-d): ")
                answer = readln().lowercase()
            } 
        } else {
            println("Invalid Choice")
            print("PIZZA MENU\n(a) Margherita\n(b) Quattro Stagioni\n(c) Seafood\n(d) Hawaiian\nChoose your pizza (a-d): ")
            answer = readln().lowercase()
        }
    }
}
