fun main() {
/**
    loop@ for(item in 1..10)
    {
        for (item2 in 1..3) {//internal repetition
            println("count $item ")
            if (item == 5) {
                break //In that case, it only "comes out "of internal repetition.
            }
        }
    }

 */


    println("==========================")

    loop@ for(item1 in 1..3)
    {
        for (item2 in 1..3) {
            println("count $item1 ")
            if (item2 == 3) {
                break@loop//In this case, he "comes out "of all the repetition.
            }
        }

    }

    println("==========================")

   /** for(item in 1..10)
    {
        if(item==5){
            continue //In this case, he only skips number 5 and completes.
        }
        println("count $item ")

    }*/
}