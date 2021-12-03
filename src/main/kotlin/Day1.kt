import java.io.File

fun main() {

    val depthMeasurements = inputReader(inputPath = "src/main/resources/input/day1-part1.txt")

    // part 1
    val p1 = getNumberOfIncreaseCount(depthMeasurements)
    println("part-1 result: $p1")

    // part 2
    val p2 = getNumberOfThreeMeasurementIncreaseCount(depthMeasurements)
    println("part-2 result: $p2")

}

fun getNumberOfIncreaseCount(depthMeasurements: List<Int>): Int {

    var depthMeasurementIncreaseTimes = 0

    depthMeasurements.forEachIndexed { i: Int, measurement: Int ->
        if (i >= depthMeasurements.count() - 1) return@forEachIndexed

        if (measurement < depthMeasurements[i + 1]) {
            depthMeasurementIncreaseTimes++
        }

    }
    return depthMeasurementIncreaseTimes
}

fun getNumberOfThreeMeasurementIncreaseCount(depthMeasurements: List<Int>): Int {

    val threeWindowMeasurementIncreaseList = mutableListOf<Int>()

    depthMeasurements.forEachIndexed { i: Int, measurement: Int ->
        if (i >= depthMeasurements.count() - 2) return@forEachIndexed


        threeWindowMeasurementIncreaseList.add(
            measurement
                    + depthMeasurements[i + 1]
                    + depthMeasurements[i + 2]
        );
    }
    return  getNumberOfIncreaseCount(threeWindowMeasurementIncreaseList);
}


fun inputReader(inputPath: String): List<Int> {

    val result = mutableListOf<Int>()

    File(inputPath).useLines { lines ->
        lines.forEach { result.add(it.toInt()) }
    }

    return result
}
