interface operation{
    fun sum(num1:Int,num2:Int):Int
    fun sub(num1:Int,num2:Int)

}
class UserOp:operation{
    override fun sum(num1: Int, num2: Int):Int {
        return num1+num2
    }

    override fun sub(num1: Int, num2: Int) {
        print(" $num1 - $num2 ")
    }

}
class UserOp1:operation{
    override fun sub(num1: Int, num2: Int) {
        print(num1 - num2)
    }

    override fun sum(num1: Int, num2: Int): Int {
        return num1+num2+5
    }
}

fun main(args: Array<String>) {
    var userop =UserOp()
    userop.sub(5,5)
    userop.sum(5,5)
    var userop1 =UserOp1()
    userop1.sub(5,5)
    userop1.sum(5,5)
}
/**
 * interface used in android as listview and Gps , sensor
 * */