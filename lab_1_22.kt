

fun main() {
    var n = 0;

    println("Введите целое число: ");
    var num = readLine()?.toIntOrNull();
    for (i in num!!downTo 1 step 1){
        if (num!! % i == 0){
            println(i.toString() + " ")
            n+=1;
        }
    }
    println("Кол-во делителей: " + n!!)
}