fun main() {
    var array=Array<Int>(5){0}
    println("Enter element array : ")
    //storage
    for (element in 0..4){
        array[element]= readLine()!!.toInt()
    }

    //print
    for (element in array){
        print("$element ")
    }
}