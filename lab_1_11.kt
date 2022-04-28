fun main() {
    var a = 10;
    var num = 0;

    println("Введите целые числа a1...am:");
    for (i in 1..a){
        var n = readLine()?.toIntOrNull();
        if (n != null) {
            if (n>0){
                num+=1
            }
        }
    }
    println(num <= 5)
}
