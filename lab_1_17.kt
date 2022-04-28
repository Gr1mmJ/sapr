import java.lang.Math.pow
import kotlin.math.sqrt

fun main() {
    println("Количество минут: ")
    var a = readLine()?.toIntOrNull();

    if (a!!<=500){
        println("С вас 350р")
    }
    else {
        println("С вас " + (350 + (a!!-500)*2) + "p.")
    }
}