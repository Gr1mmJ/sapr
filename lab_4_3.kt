
class Enclosure(var name : String, var amount : String, var sound : String){
    fun Info(){
        var res = "Вальер с животными: " + name +".В нем обитает " + amount + "  животных. Они издают звуки: " + sound;
        println(res)
    }
}

class Menu(){
    var enclosures = mutableListOf<Enclosure>();

    fun check(){
        println("Наименование вольера, к которому хотите подойти: ")
        for (i in enclosures){
            println(i.name)
        }
        var ch = readLine().toString();
        for (i in enclosures){
            if(i.name == ch){
                i.Info();
            }
        }
    }

    fun add(enclosure : Enclosure){
        enclosures.add(enclosure);
    }
}



fun main() {
    var enc1 = Enclosure("Муравьеды", "4", "Шипят")
    var enc2 = Enclosure("Медведи", "6", "Рычат")
    var enc3 = Enclosure("Дикие кошки", "7", "Мурлычат")
    var enc4 = Enclosure("Собаки", "10", "Гавкают")

    var menu = Menu();

    menu.add(enc1)
    menu.add(enc2)
    menu.add(enc3)
    menu.add(enc4)

    menu.check();
}