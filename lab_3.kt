
class Computer(var name : String, var ip : String, var user : String, var password : String,var cores : Int, var ram_gb : Int, var hdd_gb : Int){
    var logged_in = false;


    fun UserInfo(){
        if (logged_in) println("В данный момент активен пользователь " + user)
        else println("Вы не авторизованы.")

    }

    fun TechInfo(){
        println("Технические характеристики компьютера: ")
        println("ip: " + ip + "\n Кол-во ядер: " + cores + "\n Объем оперативной памяти: " + ram_gb + "\n Объем жесткого диста: " + hdd_gb)
    }

    fun login(u : String, pass : String): Boolean {
        if (u == user && pass == password) logged_in = true;
        return logged_in;
    }

    fun unlogin(): Boolean {
        if (!logged_in){
            return false;
        }
        logged_in = false;
        return true;
    }

    fun change_password(pass : String): Boolean {
        if (!logged_in) {
            println("Невозможно изменить пароль. Вы не авторизованы.")
            return false
        };
        password = pass;
        println("Пароль изменен.")
        return true;
    }



}

fun main() {
    var comp1 = Computer("Alpha", "192.168.1.1", "Petya", "12345", 4, 8, 512);
    var comp2 = Computer("Beta", "192.168.0.1", "Vasya", "12345", 8, 32, 1024);
    var comp3 = Computer("Omega", "192.168.0.1", "Ivan", "12345", 2, 4, 128);



    comp1.UserInfo(); // Вы не авторизованы
    println(comp1.login("Petya", "12345")); // Авторизация
    comp1.UserInfo(); // Выведет инфу т.к. авторизовались

    comp1.change_password("1234567") // меняем пароль
    comp1.unlogin(); //выходим
    println(comp1.login("Petya", "12345")); // пробуем зайти по старому паролю - false

    comp2.TechInfo(); // Выведет
    comp2.change_password("pass") // false - не авторизованы
}