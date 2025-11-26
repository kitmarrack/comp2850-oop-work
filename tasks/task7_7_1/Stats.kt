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

fun median(dataList: List<Float>): Float {
    val sortedData = dataList.sorted()
    val listSize = dataList.size
    val middle = listSize / 2
    if (listSize % 2 == 1) {
        val medianValue = sortedData[middle]
        return medianValue
    } else {
        val medianValue = (sortedData[middle - 1] + sortedData[middle]) / 2
        return medianValue
    }
}

//minimum, maximum, mean, median
fun displayValues(dataList: List<Float>) {
    val sortedData = dataList.sorted()
    val minimumValue = sortedData[0]
    val maximumValue = sortedData[(sortedData.size)-1]
    val meanValue = (sortedData.sum()/sortedData.size)
    val medianValue = median(dataList)
    println("Minimum value is $minimumValue")
    println("Maximum value is $maximumValue")   
    println("Mean value is $meanValue")
    println("Median value is $medianValue")
}




fun main() {
    val dataList = readData()
    displayValues(dataList)
}