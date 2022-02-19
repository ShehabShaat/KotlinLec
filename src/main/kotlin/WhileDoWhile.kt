fun main() {
    for (item in 1..4){
        println("Hello")

    }
    println("=================")

    var count : Int = 1
    while (count<5){
        println("Hello")

        count+=1
    }
    println("=================")

    while (count<100){ //check before implement
        print("$count ")//print odd number
        count+=2
    }
    println()
    println("==============")

    var count2 :Int = 104

    do {//implement before check
        print("$count2 ")
        count2+=2
    }while (count2<100)
}