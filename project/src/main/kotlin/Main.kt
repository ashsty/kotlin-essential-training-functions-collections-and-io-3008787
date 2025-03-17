
fun main() {
    var count = 0

    // 1
    while (count < 5) {
        print(count)
        count++
    }

    do {
        println(count)
        count++
    } while(count < 5)
    //012345

    //2
    for(i in 0 until count) print(i)

    println()
    //012345

    //3
    for(i in 0 .. count - 1 ) print(i)

    println()
    //012345

    //4
    for(i in 10 downTo 0) print(i)

    println()
    //109876543210

    //5
    for(i in 10 downTo 0 step 2) print(i)
    //1086420
}