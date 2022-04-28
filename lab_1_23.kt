

fun main() {
    println("Число для проверки: ")
    var a = readLine()?.toIntOrNull();
    var simple = true;

    for (i in 2..a!!){
        if (a!! % i == 0 && a!! != i){
            simple = false;
            break
        }
    }

    println(simple)
}