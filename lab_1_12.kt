import kotlin.math.abs

fun main() {
    println("Введите х и у первой точки: ")
    var x1 = readLine()?.toIntOrNull();
    var y1 = readLine()?.toIntOrNull();
    println("Введите х и у второй точки: ")
    var x2 = readLine()?.toIntOrNull();
    var y2 = readLine()?.toIntOrNull();
    println("Введите х и у третей точки: ")
    var x3 = readLine()?.toIntOrNull();
    var y3 = readLine()?.toIntOrNull();



    var S : Double = abs( x1!! * (y2!! - y3!!) + x2!! *(y3!! - y1!!) + x3!! * (y1!! - y2!!) ) / 2.0
    println(S);
}
