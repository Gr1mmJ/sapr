import java.awt.Point

fun foo(z : Int): Boolean {
    if (z % 10 != 0 && z % 5 == 0) return true;
    else return false;
}

fun main() {
    println("Введите число z: ")
    var z = readLine()?.toIntOrNull();
    var k = 0;

    for (i in 1..n!!){
        println("Введите следующее число ai: ");
        if(foo(readLine()?.toIntOrNull()!!)) k+=1;
    }

    println(k)
}