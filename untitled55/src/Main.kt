class Main {


}

class Fruit(var name: String, var price: Int, var discount: Int) {

}

data class FruitList(
    var name: String,
    var age: Int,
    var discount: Int
)

fun main() {
    val arrayFruit: ArrayList<Fruit> = ArrayList()
    arrayFruit.add(Fruit("Banana", 150, 5))
    arrayFruit.add(Fruit("Apple", 100, 1))
    arrayFruit.add(Fruit("Mandarin", 180, 8))

    for (i in arrayFruit)
        println("${i.name} ${i.price} ${i.discount}")


}