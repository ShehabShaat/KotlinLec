class Outer{
    var name :String="hello"
  // inner class Inner{ must put " inner" in inner claas
 class Inner{
        fun GetMsg():String{
            return "welcome"
        }
       fun GetName():String{
           return name //must put " inner" in inner claas | used in Activity iin Android
       }
    }
}

fun main(args: Array<String>) {
    val outer = Outer()
    println(outer.name)
    val inner :Outer.Inner =Outer.Inner()//new form to defined obj class
    print(inner.GetMsg())
}