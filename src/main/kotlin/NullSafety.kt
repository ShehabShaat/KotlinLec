fun main(args: Array<String>) {
    var name: String?
    name = null
    println(name)
    // name = null
    //  println(name!!) cause error
    name = "car"
    println(name!!)// Doesn't cause  error
    name = "shehab"
    print(name)
}
/*

* null safety : means the program is "not executed" if it is null
To apply null safety, we put a "!!" after the variable name , like |  println(name!!)
*  println(name!!) | It means that this variable must have a value
* "!!" Force the variable to have a value
*"?"   var name : String?  : means This variable may or may not contain a value
 */


//note :
//you can't use the debug operation at the variable definition stage