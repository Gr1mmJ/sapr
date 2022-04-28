import java.lang.Math.pow
import kotlin.math.*

fun main() {
    println("Введите порядковый номер дня: ")
    val day = readLine()?.toDoubleOrNull();
    if (day != null) {
        println(day % 7)
    }
}