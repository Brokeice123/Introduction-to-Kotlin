fun main(args: Array<String>) {
    print("Enter Your Age")
    var age: Int = readLine()!!.toInt()
        if (age >= 18){
        print("Welcome to The Club")
        }
    else {
        print("Sorry we can't admit underage")
    }
}