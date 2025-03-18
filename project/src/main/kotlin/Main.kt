
fun main() {
    val ints = arrayOf(1, 2, 3, 4, null)

    val nulls = arrayOfNulls<Int>(5) // make a int array initialized with null

    val custom = Array(5) { index -> index + 1}

    val sizeOfArray = ints.size

    val firstValue = ints[0] // can be accessed like this
    // val firstValue = ints.get(0)

    ints[0] = 99;
    // ints.set(0, 99)

    val primitiveInts = intArrayOf(1, 2, 3, 4, 5) // setting these values into primitive form
    val primitiveUShorts = ushortArrayOf(1u, 2u, 3u, 4u, 5u)

    /*for(i in 0..custom.lastIndex) {
        println(custom[i])
    }

    for (i in 0 until custom.size) {
        println(custom[i])
    }

    for(element in custom) {
        println(element)
    }

    custom.forEach { println(it) }
    custom.forEach { element -> println(element) }
    */

    // greetThings("Hey", arrayOf("Kotlin", "Mina", "World"))
    greetThings("Hello", "Kotlin", "Mina", "World")

    val arrayForm = arrayOf("Hello", "Kotlin", "Mina", "World")
    greetThings("Hi", *arrayForm) // if passing the array, have to add "*" mark in front of the array name
}

fun greetThings(greeting: String, vararg items: Any) { // variable argument
    for (item in items) {
        println("$greeting, $item")
    }
}

/*
fun greetThings(greeting: String, items: Array<Any>) { // have to pass only array form
    for (item in items) {
        println("$greeting, $item")
    }
}*/
