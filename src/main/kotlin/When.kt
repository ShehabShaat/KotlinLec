fun main() {
    var number : Int = readLine()!!.toInt()
    when (number){
        1->{
            println("A")

        }
        2->{
            println("B")

        }
        3,4->{
            println("C")

        }

        5,6->{
            println("D")

        }
        in 7..8->{
            println("E")
        }
        !in 9..20->{
            print("F")
        }
    }

    when (readLine()!!.toInt()) {
       in 90..100 //if (grade>=90&&grade<=100)
       -> print("A")
       in 80..89//if (grade>=80&&grade<=89)
       -> print("B")
       in 70..79//if (grade>=70&&grade<=79)
       -> print("C")
       in 60..69//if (grade>=60&&grade<=69)
       -> print("D")
       else -> print("Fail")
   }
    //when as "menu" and like if else
}