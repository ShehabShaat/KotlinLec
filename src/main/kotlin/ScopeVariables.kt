//scope variables
var name :String = "Ahmed" //public var
fun main(args: Array<String>) {
    var str : String="shehab shaat" //local var
    show()
}
fun show(){//When the function is completed ,Variables are deleted by garbage collection like "age" is deleted
    var age : Int =10
    println(name)
    println(age)
}