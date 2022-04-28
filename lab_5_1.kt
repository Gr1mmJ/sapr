fun main() {
    val dict = mapOf("big" to "большой","small" to "маленький","animal" to "животное","wall" to "стена");

    println("Введите слово: ")
    var word = readLine().toString();

    if (word in dict) println(dict[word])
    else println("Слова не в словаре.")
}