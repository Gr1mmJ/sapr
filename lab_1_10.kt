fun main() {
    println("Введите натуральное число a: ");
    var a = readLine()?.toIntOrNull();
    println("Введите целое число n: ");
    var n = readLine()?.toIntOrNull();

    var num = 0;
    var sum = 0;

    println("Введите целые числа a1...am:");
    for (i in 1..a!!){
        var s = readLine()?.toIntOrNull();
        if (s != null) {
            if (s % n!! == 0){
                sum += s;
                num+=1
            }
        }
    }
    println(sum/num)
}
