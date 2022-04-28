import java.util.*


fun main() {
    val set1 = mutableSetOf<String>()
    val set2 = mutableSetOf<String>()

    println("Введите товары первого пользователся(для прекращения введите break): ")
    while (true) {
        var n = readLine()?.toString();
        if (n!! == "break") break
        set1.add(n!!);
    }

    println("Введите товары второго пользователся(для прекращения введите break): ")
    while (true) {
        var n = readLine()?.toString();
        if (n!! == "break") break
        set2.add(n!!);
    }

    println("Общие товары пользователей: ");
    println(set1.intersect(set2))

    println("Уникальные товары для 1-го пользователя: ")
    println(set1 - set1.intersect(set2))

    println("Все товары 1-го пользователся: ")
    println(set1)

    println("Все товары 2-го пользователся: ")
    println(set2)
}