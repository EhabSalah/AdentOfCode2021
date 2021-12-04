import java.io.File

fun main() {

    val inputDay2 = inputReaderDay2("src/main/resources/input/day2.txt");

    val solutionDay2Part1 = solutionDay2Part1(inputDay2)

    println("\n solutionDay2Part1= $solutionDay2Part1")

    val solutionDay2Part2 = solutionDay2Part2(inputDay2)

    println("\n solutionDay2Part2= $solutionDay2Part2")
}


data class Movement(val direction: Direction, val value: Int)

enum class Direction { UP, DOWN, FORWARD }

fun inputReaderDay2(inputPath: String): List<Movement> {

    val result = mutableListOf<Movement>()

    File(inputPath).useLines { lines ->
        lines.forEach {

            val value = it.replace("[^0-9]".toRegex(), "").toInt();
            val name = it.replace("[^a-z]".toRegex(), "");

            when (name) {
                Direction.UP.name.toLowerCase() -> {
                    result.add(
                        Movement(
                            value = value,
                            direction = Direction.UP,
                        )
                    )
                }
                Direction.DOWN.name.toLowerCase() -> {
                    result.add(
                        Movement(
                            value = value,
                            direction = Direction.DOWN,
                        )
                    )
                }
                Direction.FORWARD.name.toLowerCase() -> {
                    result.add(
                        Movement(
                            value = value,
                            direction = Direction.FORWARD,
                        )
                    )
                }
            }


        }
    }

    return result
}

fun solutionDay2Part1(movements: List<Movement>): Int {
    var horizontal = 0
    var depth = 0

    movements.forEach {
        when (it.direction) {
            Direction.UP -> depth -= it.value
            Direction.DOWN -> depth += it.value
            Direction.FORWARD -> horizontal += it.value
        }
    }

    return horizontal * depth
}

fun solutionDay2Part2(movements: List<Movement>): Int {
    var horizontal = 0
    var depth = 0
    var aim = 0

    movements.forEach {
        when (it.direction) {
            Direction.UP -> aim -= it.value
            Direction.DOWN -> aim += it.value
            Direction.FORWARD -> {
                depth += aim * it.value
                horizontal += it.value
            }
        }
    }

    return horizontal * depth
}
