import java.time.LocalDate
import java.time.format.DateTimeParseException
import java.util.*


fun foo (y : String,m : String,d : String) {
    var d = y+"-"+m+"-"+d;
    try {
        var date = LocalDate.parse(d)
        println("Дата корректна");
    }
    catch ( e : DateTimeParseException){
        println("Дата не корректна");
    }
}
fun main() {
    println("Введите день: ")
    var d = readLine();
    println("Введите месяц: ")
    var m = readLine();
    println("Введите год: ")
    var y = readLine();

    foo(y!!,m!!,d!!);
}