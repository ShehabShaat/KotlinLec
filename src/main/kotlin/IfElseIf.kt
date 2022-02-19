fun main() {
    print("Enter your grade : ")
    val grade : Int = readLine()!!.toInt()
    var score : String =""
   if(grade in 90..100) //if (grade>=90&&grade<=100)
       score+="A"
    else if (grade in 80..89)//if (grade>=80&&grade<=89)
       score+="B"
    else if (grade in 70..79)//if (grade>=70&&grade<=79)
       score+="C"
    else if (grade in 60..69)//if (grade>=60&&grade<=69)
       score+="D"
   else
       score+="Fail"

    print(score)

    /*
    when (grade) {
        in 90..100 //if (grade>=90&&grade<=100)
        -> print("A")
        in 80..89//if (grade>=80&&grade<=89)
        -> print("B")
        in 70..79//if (grade>=70&&grade<=79)
        -> print("C")
        in 60..69//if (grade>=60&&grade<=69)
        -> print("D")
        else -> print("Fail")
    }*/

    }
/*

* If you don't meet a certain condition, it will move to the other condition
* If a certain condition is met, it is moved outside the conditional statement and executed
* else if : Minimize execution steps
* */