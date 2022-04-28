import java.awt.Point

fun Perimeter(a:Point,b:Point,c:Point): Double {
    return (a.distance(b) + b.distance(c) + c.distance(a));
}
fun main() {
    println("Введите число координаты 1-й точки: ")
    var x1 = readLine()?.toDoubleOrNull();
    var y1 = readLine()?.toDoubleOrNull();
    var a = Point();
    a.setLocation(x1!!,y1!!);
    println("Введите число координаты 2-й точки: ")
    var x2 = readLine()?.toDoubleOrNull();
    var y2 = readLine()?.toDoubleOrNull();
    var b = Point();
    b.setLocation(x2!!,y2!!);
    println("Введите число координаты 3-й точки: ")
    var x3 = readLine()?.toDoubleOrNull();
    var y3 = readLine()?.toDoubleOrNull();
    var c = Point();
    c.setLocation(x3!!,y3!!);
    println(Perimeter(a,b,c));









}