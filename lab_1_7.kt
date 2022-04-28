import java.lang.Math.pow

fun main() {
    var summa = 0.0;
    for (i in 1..11 step 2){
        summa += pow(2.0, i.toDouble()) / i;
    }
    println("Сумма ряда = " + summa)
}