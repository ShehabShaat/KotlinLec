import java.util.*
import kotlin.math.abs

fun main(args: Array<String>) {
      // input
    print("Enter day : ")
    var dayBerth : Int = readLine()!!.toInt()
    print("Enter month : ")
    var monthBerth : Int = readLine()!!.toInt()
    print("Enter year :")
    var yearBerth : Int = readLine()!!.toInt()

    // process

    var Y = Calendar.getInstance().get(Calendar.YEAR)
    var M = (Calendar.getInstance().get(Calendar.MONTH)+1)
    var D = Calendar.getInstance().get(Calendar.DAY_OF_MONTH)

    var year: Int? =null
    if(M<monthBerth)
    year = ((Y - yearBerth)-1)
    else
        year = (Y - yearBerth)

    var month : Int = (12-abs (M-monthBerth))

    var day : Int = abs(D - dayBerth)

    // output
  print("your age is : $year year and $month month and $day days ")

}