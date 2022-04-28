import java.lang.Math.pow
import java.util.*

fun main() {
    var items : ArrayList<Int> = arrayListOf()
    println("Введите количество предметов: ")
    val n = readLine()?.toIntOrNull();
    var res = 0;

    for (i in 1..n!!){
        println("Введите массу предмета №" + i)
        var s = readLine()?.toIntOrNull();
        if (s != null) {
            items.add(s);
        }
    }

    for (i in items){
        res+=i;
    }

    println("Общая масса груза: " + res)

}