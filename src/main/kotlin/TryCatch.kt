fun main(args: Array<String>) {
    var a : Int = 10
    var b : Int = 0
    var c : Int = 5

    var sum : Int=a+b+c
    println(sum)
    var sub : Int=a-b-c
    println(sub)
    var mult : Int=a*b*c
    println(mult)
    try {
        var dev : Int=a/b/c
        print(dev)
    }catch (ex:Exception){
        println(ex.message)
    }



}