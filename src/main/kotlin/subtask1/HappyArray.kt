package subtask1

class HappyArray {

    fun convertToHappy(sadArray: IntArray): IntArray {
        var happyList = sadArray.toMutableList()
        var tempList = checkIsHappy(happyList)

        while (happyList != tempList) {
            happyList = tempList
            tempList = checkIsHappy(happyList)
        }
        return happyList.toIntArray()
    }

    private fun checkIsHappy(happyList : MutableList<Int>) : MutableList<Int>  {
        val tempList : MutableList<Int> = mutableListOf()
        for (i in 0 until happyList.size) {
            if (i == 0 || i == happyList.size - 1 || (happyList[i - 1] + happyList[i + 1]) > happyList[i]) tempList.add(happyList[i])
        }
        return tempList
    }
}
