//Threads:Performing more than one operation at the same time
//Threads:Converts a normal class into a class that runs on the processor in parallel
class MyThreads: Thread {//Thread is interface you need to implement it "need constructor"
    var str:String?=null
    constructor(str:String):super(){//To run for more than Threads|  :super() to initialize constructor the Threads class
        this.str=str
    }
    override fun run() { // implement automatically when call class||override means:change content method
        var count : Int=0
    while (count<10) {
        println("${ this.str} count : $count")
        try {
            Thread.sleep(1000)//Delay counter
        }catch (ex : Exception){
            println(ex.message)
        }
        count++

    }
    }

}

fun main(args: Array<String>) {
    // all work at the same time
    //Each line is executed separately , It means that "line 2 can be executed before line 1 and 3 and so on
    /**
     * يعني طريقة تنفيذ ال treads  ليس مهما ان يكون بالترتيب ولكن يتم تنفيذهم جميعا في ان واحد
     * المعالجة المتوازية : تأدية اكثر من عملية بوقت واحد
     * */
    var t1 =MyThreads("t1")
    t1.start()
    var t2 =MyThreads("t2")
    t2.start()
    var t3 =MyThreads("t3")
    t3.start()
    //t3.join() don't continue until t3 complete
    println("Threads is running")

}