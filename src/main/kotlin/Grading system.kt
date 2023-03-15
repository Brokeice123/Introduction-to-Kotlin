fun main(args: Array<String>) {
    print("Enter Marks")

    var marks:Int = readLine()!!.toInt()

    if (marks >= 80){
        print("A. Congratulations for the excellent job. Keep it up!")
    }

    else if (marks >= 75){
        print("A-. Congratulations for the good job. Keep it up!")
    }

    else if (marks >= 70){
        print("B+. Congratulations for the good job. Keep it up!")
    }

    else if (marks >= 65){
        print("B. Congratulations for the good job. Keep it up!")
    }

    else if (marks >= 60){
        print("B-. Good job. Work harder!")
    }

    else if (marks >= 55){
        print("C+. Fair job. Work harder!")
    }

    else if (marks >= 50){
        print("C. Fair. Pull up your socks!")
    }

    else if (marks >= 45){
        print("C-. Low. Pull up your socks!")
    }

    else if (marks >= 40){
        print("D+. Low. Pull up your socks!")
    }

    else if (marks >= 35){
        print("D. Very Low. Pull up your socks!")
    }

    else if (marks >= 30){
        print("D-. Sorry, you will not proceed to the next level. Kindly retake the class!")
    }

    else{
        print("Fail. Kindly retake the Class!!")
    }

}