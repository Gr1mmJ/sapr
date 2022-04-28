
fun sum(z : Int) : Int{
    if (z < 10) return z;
    else return sum(z / 10) + z % 10;
}

fun main() {
    println("Введите число: ")
    println(readLine()?.toIntOrNull()?.let { sum(it) })
}