 open class Operation{ //"open" meaning that this class can be inherited | 1
private  var presses :Int = 10
    open fun sum(num1:Int,num2:Int):Int{//protected : It cannot be accessed from the main method, but it can be accessed by the inherited class
         return num1+num2
     }
    public fun sub(num1:Int,num2:Int):Int{//public:  It can be accessed from the main method ,  inherited class or any place
         return num1-num2
     }
     /** fun GetPresses():Int{
     return presses no error
     }*/


 }
 class MultiOperation():Operation(){//focs, very important=> call constructor |2
     fun multi(num1:Int,num2:Int):Int{
         return num1*num2
     }
     fun dev(num1:Int,num2:Int):Int{
         return num1/num2
     }
    /** fun GetPresses():Int{
         return presses // error because presses is private but  if the process is protected, it can be accessed and no error occurs
     }*/
    override fun sum(num1:Int,num2:Int):Int{ //In the call, the function in the sub will be called
        super.sum(num1, num2)// anything outside my class can be reached" accesses " by super
                            //anything inside my class can be reached" accesses " by this

        return num1+num2+5
    }

 }

 fun main(args: Array<String>) {
     var op = Operation()
     op.sum(5,5)
     op.sub(5,6)
     var mult1=MultiOperation() as Operation
    println( mult1.sum(5,5))
    println( mult1.sub(6,5))
//    println( mult1.multi(7,5))
//     println( mult1.dev(10,5))
 }
