package oop

interface UserOp{
    fun sum(num1:Int,num2:Int):Int
    fun sub(num1:Int,num2:Int)

}
class HelloInterface :UserOp{
    override fun sum(num1: Int, num2: Int):Int {
        return num1+num2
    }

    override fun sub(num1: Int, num2: Int) {
        print(num1 - num2 )
    }

}
class HelloInterface1:UserOp{
    override fun sub(num1: Int, num2: Int) {
        println(num1 - num2)
    }

    override fun sum(num1: Int, num2: Int): Int {
        return num1+num2+5
    }
}


/**
 * interface used in android as listview and Gps , sensor
 * */