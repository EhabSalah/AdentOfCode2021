import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class Day1KtTest {

    @Test
    fun `pass when result equals the test input file list`() {

        val expectedResult: List<Int> = listOf(199, 200, 208, 210, 200, 207, 240, 269, 260, 263)

        val result =
            inputReader("src/test/resources/input_fixtures/Day1Part1.txt")

        assertEquals(expectedResult, result)
    }

    @Test
    fun `pass when given increase numbers count equals result`() {

        val input =
            inputReader("src/test/resources/input_fixtures/Day1Part1.txt")

        assertEquals(getNumberOfIncreaseCount(input), 7)
    }

    @Test
    fun part2Test() {

        val input =
            inputReader("src/test/resources/input_fixtures/Day1Part1.txt")

        assertEquals(getNumberOfThreeMeasurementIncreaseCount(input), 5)
    }

}
