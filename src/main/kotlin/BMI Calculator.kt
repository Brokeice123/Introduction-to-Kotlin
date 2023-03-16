fun main(args: Array<String>) {
    var weight = 100
    var height = 1.5
    var square = height * height
    var result = weight / square

    if (result <= 18){
        println("Underweight")
    }
    else if (result <= 29){
        println("Normal weight")
    }
    else if (result <= 34){
        println("Over Weight")
    }
    else{
        println("Obese")
    }
}