package subtask2

class MiniMaxSum {

    fun getResult(input: IntArray): IntArray {
        var min = getMin(input)
        var max = getMax(input)

        val resultArray = IntArray(2)

        resultArray[0] = getMinSum(input, max)
        resultArray[1] = getMaxnSum(input, min)

        return resultArray
    }

    private fun getMin(input: IntArray): Int {
        var min = input[0]
        for (i in input.indices) {
            if (input[i] < min) min = input[i]
        }
        return min
    }

    private fun getMax(input: IntArray): Int {
        var max = input[0]
        for (i in input.indices) {
            if (input[i] > max) max = input[i]
        }
        return max
    }

    private fun getMinSum(input: IntArray, max: Int): Int {
        var sum = 0
        for (i in input.indices) {
            if (input[i] != max) sum += input[i]
        }
        return sum
    }

    private fun getMaxnSum(input: IntArray, min: Int): Int {
        var sum = 0
        for (i in input.indices) {
            if (input[i] != min) sum += input[i]
        }
        return sum
    }
}
