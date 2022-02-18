fun main(args: Array<String>) {
    val n1 : Int = readLine()!!.toInt()
    val n2 : Int = readLine()!!.toInt()
    val n3 : Int = readLine()!!.toInt()
    var sum :Int?=null

    sum=n1+n2*n3-3 // 6*4 => +5 => -3 | sum = 26
    println(sum)

    sum=(n1+n2)*n3-3 // (5+6)*4-3 | sum = 41
    println(sum)
    sum = ((n1+n3)*5)*2+n2 //5+4 => 9*5 => 45*2 => 90+6 | sum = 96
    println(sum)
    /* Math Priorities
    * ()
    * ^
    * { *,/ }
    * { +,- }
    * =
    * Compares mathematical operations from left to right in order of priority
    * */


}