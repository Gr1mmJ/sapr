import java.lang.Math.pow
import kotlin.math.*

fun main() {
    println("Двузначное число: ")
    val a = readLine()?.toDoubleOrNull();

    val b = n?.div(10)?.let { Math.floor(it) };
    val c = n?.rem(10);


    if (a != null && b != null && c != null) {
        val result: Boolean = (a * a == 4 * (pow(x, 3.0) + pow(y, 3.0)))
        println(result);
    }
}