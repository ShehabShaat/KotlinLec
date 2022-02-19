fun main(args: Array<String>) {
    var isMarried: Boolean =false




    /** and Statement
     * false && false = false
     * false && true =false
     * true && false =false
     * true && true = true
     * */
    var andStatement :Boolean= 5<3 && 5>9
    /** or Statement
     * false || false = false
     * false || true =true
     * true || false =true
     * true || true = true
     * */

    var orStatement :Boolean= 5<3 || 5>9
    /** not Statement
     * false = true
     * true = false
     * */

    var notStatement : Boolean =!(5<10)

    println(isMarried)       //false
    println(andStatement)   //false
    println(orStatement)   //false
    println(notStatement) //false


    //Example
    var num :Int= 10
    var statement :Boolean? =null
    statement = (num>=10&&num<=10)||(num>=50&&num<=70)
    print(statement)
}