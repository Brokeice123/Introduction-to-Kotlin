package OOP

class Vehicle(type:String, model:String, color:String, owner:String, price:Int){
    init {
        println("Vehicle type is $type")
        println("Vehicle model is $model")
        println("The vehicle color is $color")
        println("The owner is $owner")
        println("The price of the vehicle is $price")
    }
}

fun main(args: Array<String>) {
    var owner1 = Vehicle("Van", "Toyota", "Black", "Samuel", 2500000)
    var owner2 = Vehicle("Double Cabin", "Toyota", "White", "Grace", 7600000)
    var owner3 = Vehicle("Saloon", "Subaru", "Grey", "Kirui", 3400000)
}