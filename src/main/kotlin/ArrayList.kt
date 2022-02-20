// in array list you don't need to specify the size.
fun main() {
    var arraylist = ArrayList<String>()
    arraylist.add("shabby")
    arraylist.add("esaam")
    arraylist.add("shaat")

    println(arraylist)
    print("Search name :")
    var search :String= readLine()!!.toString()
    if (arraylist.contains(search))
        print("the name is found")
    else
        print("the name is not found")

}



