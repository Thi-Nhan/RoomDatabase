import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeParseException

fun main() {

    val formatter = DateTimeFormatter.ofPattern("d/M/yyyy")

    println("Nhập vào một ngày theo định dạng dd/MM/yyyy (ví dụ: 2/9/2023):")
    val input = readLine()

    if (input.isNullOrBlank()) {
        println("Dữ liệu nhập vào không hợp lệ.")
        return
    }

    try {

        val date = LocalDate.parse(input, formatter)

        val dayOfYear = date.dayOfYear

        println("Ngày $input là ngày thứ $dayOfYear của năm.")
    } catch (e: DateTimeParseException) {

        println("Ngày nhập vào không hợp lệ.")
    }
}
