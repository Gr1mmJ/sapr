

fun main() {
    var fuel = mapOf("92" to 47 , "95" to 51 , "98" to 60, "diesel" to 55)

    println("Введите тип топлива - 92,95,98,diesel: ");
    var fuel_type = readLine();
    println("Введите количество литров: ");
    var n = readLine()?.toIntOrNull();

    var res = fuel[fuel_type]?.times(n!!);
    println(res)
}