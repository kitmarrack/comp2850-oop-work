// Task 7.7.1: stats for a numeric dataset
fun readData() = buildList<Float> {
    println("Enter values to add them to the list,  enter a non number to exit: ")
    var check = true
    while (check == true) {
        val num = readln().toFloatOrNull()
        if (num != null) {
            add(num)
        } else {
            check = false
        }
    }
}

fun median(dataList) {
    val sortedData = dataList.sorted()
    val listSize = dataList.size
    val middle = listSize / 2
    if (listSize % 2 == 1) {
        val medianValue = sorted[middle]
    } else {
        val medianValue = (sortedData[middle - 1] + sortedData[middle]) / 2
    }
    return medianValue
}

fun main() {
    val dataList = readData()
    val medianValue = median(dataList)
    println(dataList)
    println("The Median is $medianValue")
}