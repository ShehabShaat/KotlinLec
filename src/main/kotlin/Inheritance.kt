 open class Operation{ //"open" meaning that this class can be inherited | 1

     fun sum(num1:Int,num2:Int):Int{
         return num1+num2
     }
     fun sub(num1:Int,num2:Int):Int{
         return num1-num2
     }
}
 class MultiOperation():Operation(){//focs, very important=> call constructor |2
     fun multi(num1:Int,num2:Int):Int{
         return num1*num2
     }
     fun dev(num1:Int,num2:Int):Int{
         return num1/num2
     }

 }

 fun main(args: Array<String>) {
     var mult1=MultiOperation()
    println( mult1.sum(5,5))
    println( mult1.sub(6,5))
    println( mult1.multi(7,5))
     println( mult1.dev(10,5))
 }
