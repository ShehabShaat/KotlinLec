fun main() {
   var msg : String ="Welcome to nasa"
    println(msg)
    print("msg[5] = "+msg[5])

    for (index in 0..msg.length-1){
        println("msg[$index]= " + msg[index])
    }
   /** for(element in msg){
        print(element)
    }*/
    var name : String ="shehab"
    var str : String = "$msg , $name"
    println(str.lowercase())
    println(str.uppercase())
    println(str.trim())
    println(msg.split(" "))
    println(str.split(","))
}