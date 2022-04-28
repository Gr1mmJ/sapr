

fun main() {
    var a=1;
    println("Число амеб на старте = 1")
    for (i in 3..24 step 3){
        a *= 2;
        println("Через " + i + "часов число амеб будет: " + a)
    }
}