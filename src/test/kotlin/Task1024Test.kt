import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

class Task1024Test {
    private val input = StandardInputStream()
    private val output = StandardOutputStream()

    @BeforeEach
    fun setUp() {
        System.setIn(input)
        System.setOut(output)
    }

    @AfterEach
    fun tearDown() {
        System.setIn(null)
        System.setOut(null)
    }
    // private fun calcCombination(n: Int, r: Int): Long {
    //     return when {
    //         n < 0 || r < 0 -> throw IllegalArgumentException("Arguments must be 0 and over.")
    //         n == r || r == 0 -> 1
    //         n < r -> 0
    //         else -> {
    //             var result: Long = 1
    //             for (i in 1..r) {
    //                 result = result * (n - i + 1) / i
    //             }
    //             result
    //         }
    //     }
    // }

    // /** 重複なしの順列 */
    // private fun <T> List<T>.permutationWithoutRepetition(k: Int): Sequence<List<T>> {
    //     require(k in 0..size) { "引数 k は 0 以上かつ $size 以下でなければなりません。k: $k" }
    //     return pcSequenceFactory<T> { options, i ->
    //         options.take(i) + options.drop(i + 1)
    //     }(this, k)
    // }
    // /** 重複なしの組み合わせ */
    // private fun <T> List<T>.combinationWithoutRepetition(k: Int): Sequence<List<T>> {
    //     require(k in 0..size) { "引数 k は 0 以上かつ $size 以下でなければなりません。k: $k" }
    //     return pcSequenceFactory<T> { options, i ->
    //         options.drop(i + 1)
    //     }(this, k)
    // }
    // /** 重複ありの順列 */
    // private fun <T> List<T>.permutationWithRepetition(k: Int): Sequence<List<T>> {
    //     require(k >= 0) { "引数 k は 0 以上でなければなりません。k: $k" }
    //     return pcSequenceFactory<T> { options, i ->
    //         options
    //     }(this, k)
    // }
    // /** 重複ありの組み合わせ */
    // private fun <T> List<T>.combinationWithRepetition(k: Int): Sequence<List<T>> {
    //     require(k >= 0) { "引数 k は 0 以上でなければなりません。k: $k" }
    //     return pcSequenceFactory<T> { options, i ->
    //         options.drop(i)
    //     }(this, k)
    // }
    // private fun <T> pcSequenceFactory(
    //     selecteds: List<T> = emptyList(),
    //     filter: (options: List<T>, i: Int) -> List<T>
    // ): (options: List<T>, k: Int) -> Sequence<List<T>> =
    //     { options, k ->
    //         sequence {
    //             if (k == 0) {
    //                 yield(selecteds)
    //                 return@sequence
    //             }
    //             options.forEachIndexed { i, option ->
    //                 pcSequenceFactory(selecteds + option, filter).let {
    //                     it(filter(options, i), k - 1)
    //                 }.forEach {
    //                     yield(it)
    //                 }
    //             }
    //         }
    //     }

    fun main() {
        val (n, m) = readLine()!!.split(" ").map { it.toInt() }
        var count: Long = 0
        for (x in 1..n) {
            for (y in 1..n) {
                val sum = x + y
                if (m <= sum) continue
                count += m - sum
            }
        }

        println(count)
    }

    @Test
    fun a_1() {
        input.inputln("2 4")

        main()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("4")))
    }

    @Test
    fun a_2() {
        input.inputln("1000 2022")

        main()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("843614540")))
    }

    @Disabled
    @Test
    fun a_3() {
        input.inputln("")

        main()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("")))
    }

    @Disabled
    @Test
    fun a_4() {
        input.inputln("")

        main()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("")))
    }

    @Disabled
    @Test
    fun a_5() {
        input.inputln("")

        main()

        val result = output.readLines()
        assertThat(result, equalTo(listOf("")))
    }

//         assertThat(result.first().toDouble(), closeTo(2.23606797749978969, 0.0005))
}