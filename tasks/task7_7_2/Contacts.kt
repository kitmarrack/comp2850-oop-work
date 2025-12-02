// Task 7.7.2: contact database, using a map
import java.io.File


fun readWordList(filename: String): MutableList<String> { //stores the values in 'words.txt' into a mutable list and returns them
    val contacts: MutableList<String> = File(filename).readLines().toMutableList()
    return contacts
}



fun main() {
    val contacts = readWordList("contacts.txt")
    println("Enter a contact: ")
    var contact = readln()
    while (contact != null) {
        for line in contacts {
            if contact == line[0]
        }
    }
}