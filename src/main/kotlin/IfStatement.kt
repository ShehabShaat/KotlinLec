//We said earlier that the program executes "line by line"

/** if Statement
 * Execution Statement  "under certain conditions"
 *  */

/** if(condition=true){
 * block of code
 * }
 * */
//Block of code implement when condition=true
fun main(args: Array<String>) {
print("Enter number : ")
    var num:Int = readLine()!!.toInt()
    if (num in 1..100) {//if(num>=1&&num<=100){
        println("The number inside range")

    }
    println("end")


}