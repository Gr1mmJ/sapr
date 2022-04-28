import java.lang.Math.pow
import kotlin.math.sqrt

fun main() {
    var code = "";
    println("Введите код от замка: ");
    code = readLine().toString();
    if (code == "1024") println("Код введен верно!")
    else println("Код введен не верно!")
}