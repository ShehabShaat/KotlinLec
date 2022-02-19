fun main() {
    print("Enter your grate : ")
    var  grade :Int = readLine()!!.toInt()
    if (grade >= 50) {
        println("you pass exam ")
        grade +=5
        print("You got 5 extra points and your new score is $grade")

    }
    else {
        if (grade >= 45) {
            grade += 5
            print("You got 5 extra points and your new score is $grade")

        }else
            print("you fail")


    }
}