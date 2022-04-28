import kotlin.math.abs

fun main() {
    var num = 0;
    println("Введите 5 чисел: ");
    for (i in 1..5){
        var n = readLine()?.toDoubleOrNull();
        if (n!!>0){
            num++;
        }
    }
    println("Положительные среди ниж: " + num)
}
