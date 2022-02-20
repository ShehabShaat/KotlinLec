/**Store data as key and value
Used in dealing with  networking
//<Int,String> key , value
Data is Key defined.
HashMab can receive object or any data type
 */
fun main() {
    var map = HashMap<Int,String>()
    map.put(1,"shehab")
    map.put(2,"essam")
    map.put(3,"shaat")
    map.put(3,"shat") //update
    println(map[1])//map[1]==map(1)
    println(map.get(2))
    println(map.get(3))
    println("=============")
    for (key in map.keys)
        println(map[key])
}