package subtask1

class DateFormatter {

    fun toTextDay(day: String, month: String, year: String): String {
        return if (month.toInt() in (1..12)) {
            if (day.toInt() in monthList[month.toInt() - 1].days) {
                var actualYear = year.toInt()
                val cho: List<Int> = listOf(0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4)
                if (month.toInt() < 3) actualYear--
                val dayWeek = daysOfWeek[(actualYear + actualYear / 4 - actualYear / 100 + actualYear / 400 + cho[month.toInt() - 1] + day.toInt()) % 7].day
                "$day ${monthList[month.toInt() - 1].month}, $dayWeek"
            } else "Такого дня не существует"
        } else "Такого дня не существует"
    }
}

data class DayOfWeek (val day: String)
data class Month(val month: String, var startDayOfWeek: Int, val days: IntRange)

private val monthList = listOf(
    Month("января", 4, (1..31)),
    Month("февраля", 0, (1..28)),
    Month("марта", 0, (1..31)),
    Month("апреля", 3, (1..30)),
    Month("мая", 5, (1..31)),
    Month("июня", 1, (1..30)),
    Month("июля", 3, (1..31)),
    Month("августа", 6, (1..31)),
    Month("сентября", 2, (1..30)),
    Month("октября", 4, (1..31)),
    Month("ноября", 0, (1..30)),
    Month("декабря", 2, (1..31))

)

private val daysOfWeek = listOf (
    DayOfWeek("воскресенье"), //6
    DayOfWeek("понедельник"), //0
    DayOfWeek("вторник"), //1
    DayOfWeek("среда"), //2
    DayOfWeek("четверг"), //3
    DayOfWeek("пятница"), //4
    DayOfWeek("суббота") //5
)
