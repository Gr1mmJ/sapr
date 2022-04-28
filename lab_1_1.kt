import kotlin.math.*

fun main(){
    println("Площадь квадрата: ")
    val plo_qva = readLine()?.toDoubleOrNull();

    println("Площадь круга: ")
    val plo_kru = readLine()?.toDoubleOrNull();

    if (sqrt(plo_qva!!) / 2 > sqrt(plo_kru!! / PI)){
        println("Круг уместится в квадрат.")
    }
    else {
        println("Круг не уместится в квадрат.")
    }
}