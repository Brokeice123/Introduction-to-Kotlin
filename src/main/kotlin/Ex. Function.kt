fun main(args: Array<String>) {
    separate1()
    addition()
    separate2()
    multiplication()
}

fun separate1(){
    println("Addition")
}

fun addition(){
    println("Enter First Number")
    var number1:Int = readln()!!.toInt()
    println("Enter Second Number")
    var number2:Int = readln()!!.toInt()

    var result = number1 + number2
    println(result)
}

fun separate2(){
    println("Multiplication")
}

fun multiplication(){
    println("Enter First Number")
    var number1:Int = readln()!!.toInt()
    println("Enter Second Number")
    var number2:Int = readln()!!.toInt()

    var result = number1 * number2
    println(result)
}