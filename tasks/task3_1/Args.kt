// Task 3.1: command line arguments

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 2) {
        println("2 Arguments must be supplied")
        exitProcess(1)
    } else {
        println(args[0])
        println(args[1])
        exitProcess(0)
    }
    
}