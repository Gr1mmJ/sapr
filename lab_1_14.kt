import kotlin.math.abs

fun main() {
    println("Является ли првильной дробь a/b?");
    println("Введите а: ");
    var a = readLine()?.toIntOrNull();
    println("Введите b: ");
    var b = readLine()?.toIntOrNull();

    println(a!!<b!!);
}
