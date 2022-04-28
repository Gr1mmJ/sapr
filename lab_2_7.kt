
fun SumDigit(z : Int) : Int{
    if (z < 10) return z;
    else return SumDigit(z / 10) + z % 10;
}

fun DigitRoot (z : Int): Int {
    if (z < 10) return z;
    else return DigitRoot(SumDigit(z));
}

fun main() {
    println("Введите число: ");
    var z = readLine()?.toIntOrNull();
    println("Цифровой корень из числа " + z!! + " равен " + DigitRoot(z!!))
}