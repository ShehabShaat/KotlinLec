import oop.HelloInterface
import oop.HelloInterface1

fun main(args: Array<String>) {
    var hello = HelloInterface()
    hello.sub(5,5)
    println(hello.sum(5,5))
    var hello1 = HelloInterface1()
    hello1.sub(5,5)
    println( hello1.sum(5,5))
}
