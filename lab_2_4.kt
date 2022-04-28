import java.awt.Point

fun foo(z : String): Boolean {
    if (z == z.reversed()) return true;
    else return false;
}

fun main() {
    println("Введите первое натуральное число: ")
    var z1 = readLine();
    println("Введите второе натуральное число: ")
    var z2 = readLine();

    if (foo(z1!!) || foo(z2!!)){
        println("Хотя бы одно из заданных чисел является палиндромом!")
    }
    else print("Ни одно из заданных чисел не является палиндромом!");

}