import java.util.*

fun main(args : Array<String>) {

    val reader = Scanner(System.`in`)

    print("Enter first name : ")
    var firstName :String ?=null
    firstName = readLine()
    println(firstName)
    print("Enter last name : ")
    val lastName = readLine()
    println(lastName)
    print("Enter Department : ")
    val department : String = readLine()!!
    print(department+"\n")
    print("Enter average : ")
    val avg :Double =  readLine()!!.toDouble()
    println(avg)
    print("Enter number : ")
    val num :Int =reader.nextInt()
    println(num)

}


/*  readLine() | Read data from console screen
 * val department : String = readLine()!! | "!!" means this variable cannot be null, and you must put it after readline statement
 * use readLine()  to read String vale
 * use readLine()!!.toDouble()  to read Double vale and so on.
 *  val lastName = readLine() | You don't need to put the !! after the readLine statement because you didn't specify the type of the variable
 *  firstName = readLine() | There is no objection because it is unknown what to print, either a String value or null
 */
