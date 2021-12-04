import Direction.*
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class Day2KtTest {

    @Test
    fun inputReaderDay2Test() {

        val expectedResult: List<Movement> = listOf(
            Movement(direction = FORWARD, value = 5),
            Movement(direction = DOWN, value = 5),
            Movement(direction = FORWARD, value = 8),
            Movement(direction = UP, value = 3),
            Movement(direction = DOWN, value = 8),
            Movement(direction = FORWARD, value = 2),
        )

        val input =
            inputReaderDay2("src/test/resources/input_fixtures/day2.txt")

        assertEquals(input, expectedResult)


    }

    @Test
    fun solutionDay2Part1Test() {

        // given
        val expectedResult = 150

        // when
        val result =
            solutionDay2Part1(inputReaderDay2("src/test/resources/input_fixtures/day2.txt"))

        // then
        assertEquals(result, expectedResult)


    }

    @Test
    fun solutionDay2Part2Test() {

        // given
        val expectedResult:Int = 900

        // when
        val result =
            solutionDay2Part2(inputReaderDay2("src/test/resources/input_fixtures/day2.txt"))

        // then
        assertEquals(result, expectedResult)

    }


}
