import java.util.*

fun main() {
    val reader = Scanner(System.`in`)
    var array1 = Array<Int>(5){0}
    var array2 = Array<Int>(5){0}
    println("Enter array1 :")
    for (arr in array1.indices) {
        array1[arr]= reader.nextInt()
    }

    println("Enter array2 :")
    for (arr in array2.indices) {
        array2[arr]= reader.nextInt()
    }
    println("=======================")

    for (item in array1.indices){
    var sum: Int = num(array1[item],array2[item] )
    println("sum [ "+array1[item] +" , "+array2[item]+ " ] = $sum")
    }

    println("=======================")
    name("shehab")
    println("=======================")
    name()

}
fun num (num1:Int,num2:Int):Int{
    return num1+num2
}
fun name(name:String){
    print(name)
}

fun name(){
    print("name")
}