package OOP

class House(owner:String, bedrooms:String, price:Int){

//Initialize our class
    init {
        println("Owner is $owner")
        println("Number of bedrooms are $bedrooms")
        println("Asking price is $price")
    }

}

fun main(args: Array<String>) {
    var house_one = House("Mike Joe", "2", 7500000)
}
