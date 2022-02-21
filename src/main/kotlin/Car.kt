class Car (Type:String,Model:Int,Price:Double,MilesDrive:Int ,Owner:String){
    init {//A function called automatically Once done instance from claas
        println("Type : $Type")
        println("Model : $Model")
        println("Price : $Price")
        println("MilesDrive : $MilesDrive")
        println("Owner : $Owner")
    }

}
class Car2 {
   var Type:String?= null
   var Model:Int?=null
   var Price:Double?=null
   var MilesDrive:Int? =null
   var Owner:String?=null
    constructor(){
        this.Type="BMW"
        this.Model=2020
        this.Price=10000.0
        this.MilesDrive=55
        this.Owner="sh.sh"
    }
    constructor(Type:String,Model:Int,Price:Double,MilesDrive:Int ,Owner:String) {
        //A function called automatically Once done instance from claas
        println("Type : $Type")
        this.Type=Type
        println("Model : $Model")
        this.Model=Model
        println("Price : $Price")
        this.Price=Price
        println("MilesDrive : $MilesDrive")
        this.MilesDrive=MilesDrive
        println("Owner : $Owner")
        this.Owner=Owner

    }
  //@JvmName("getPrice1")
  fun GetPrice():Double?{
      return this.Price!!-(this.MilesDrive!! *10)
  }
  // @JvmName("getOwner1")
    fun GetOwner():String?{
        return this.Owner!!
    }

}

fun main(args: Array<String>) {
    var car1= Car("KIA",2020,16000.5,70,"sh.shat")
    println("==================Car2 Constructor=================================")


    var car2= Car2("BMW",2026,32000.5,100,"Eng  sh.shat")
    println("=====================car2.GetPrice()==============================")

    println(car2.GetPrice())
    println("=================car2.GetOwner()==================================")

    println(car2.GetOwner())

}