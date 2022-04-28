

fun main() {
    println("Введите число а: ")
    var a = readLine()?.toDoubleOrNull();
    println("Введите число b: ")
    var b = readLine()?.toDoubleOrNull();

    var z = minOf(a!!,3*b!!) * minOf(2*a!!-b!!,2*b!!)
    println("Число z = " + z.toString())
}