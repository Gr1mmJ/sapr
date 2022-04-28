

fun main() {
    println("Введите возраст: ")
    var vosrast = readLine()?.toIntOrNull();

    if (vosrast!! <= 6) println("Дошкольник");
    else if (7 <= vosrast!! && vosrast!!<= 18) println("Школьник");
    else if (19 <= vosrast!! && vosrast!!<= 59) println("Рабочий");
    else if (60 <= vosrast!!) println("Пенсионер");
}