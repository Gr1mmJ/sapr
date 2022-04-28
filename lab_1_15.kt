import java.lang.Math.pow
import kotlin.math.sqrt

fun main() {
    println("Введите х и у точки А: ")
    var x1 = readLine()?.toDoubleOrNull();
    var y1 = readLine()?.toDoubleOrNull();
    println("Введите х и у точки В: ")
    var x2 = readLine()?.toDoubleOrNull();
    var y2 = readLine()?.toDoubleOrNull();

    if ( sqrt( pow(x1!!,2.0) + pow(y1!!,2.0) ) < sqrt( pow(x2!!,2.0) + pow(y2!!,2.0) ) ){
        println("Точка А ближе к началу координат.")
    }
    else{
        println("Точка В блиэе к началу координат.")
    }
}