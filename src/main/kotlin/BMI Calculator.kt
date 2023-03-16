fun main(args: Array<String>) {
    println("Enter your Weight")
    var weight:Int = readLine()!!.toInt()

    println("Enter your Height")
    var height:Float = readLine()!!.toFloat()

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