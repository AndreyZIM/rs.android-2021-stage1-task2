package subtask3

import java.time.LocalDate
import kotlin.reflect.KClass

class Blocks {

    // TODO: Complete the following function
    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
        when (blockB) {
            Int::class -> {

                val intResultList: MutableList<Int> = mutableListOf()
                for (i in blockA.indices) {
                    if (blockA[i] is Int) intResultList.add(blockA[i] as Int)
                }
                return intResultList.sum()

            }
            String::class -> {

                val stringResultList: MutableList<String> = mutableListOf()
                for (i in blockA.indices) {
                    if (blockA[i] is String) stringResultList.add(blockA[i] as String)
                }
                var resultString = ""
                for (i in stringResultList.indices) resultString += stringResultList[i]
                return resultString

            }
            LocalDate::class -> {

                val dateResultList: MutableList<LocalDate> = mutableListOf()
                for (i in blockA.indices) {
                    if (blockA[i] is LocalDate) dateResultList.add(blockA[i] as LocalDate)
                }
                dateResultList.sort()
                return "${dateResultList.last().dayOfMonth}.${dateResultList.last().monthValue}.${dateResultList.last().year}"
            }
        }
        return ""
    }
}
