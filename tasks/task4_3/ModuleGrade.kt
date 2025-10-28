import kotlin.math.roundToInt

fun main(args: Array<String>) {
    if (args.size != 3) {
        println("Must provide 3 Args!")
    } else {
        val arg1 = args[0].toFloat().roundToInt()
        val arg2 = args[1].toFloat().roundToInt()
        val arg3 = args[2].toFloat().roundToInt()
        val avgMark = (arg1 + arg2 + arg3)/3

        val grade = when(avgMark) {
            in 0..39    -> "Fail"
            in 40..69   -> "Pass"
            in 70..100  -> "Distinction"
            else        -> "?"
        }
        println(grade)

    }
}