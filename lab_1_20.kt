

fun main() {
    println("Введите натуральное число a:");
    var a = readLine()?.toIntOrNull();
    println("Введите натуральное число b:");
    var b = readLine()?.toIntOrNull();

    var res = "";

    for (i in a!!..b!!){
        res += i.toString() + " ";
    }

    println(res);
}