
fun main() {
    val someVariable = 3

    when {
        someVariable > 3 -> println("$someVariable is greater than 3")
        someVariable > 2 -> println("$someVariable is greater than 2") // This one will be printed
        else -> println("No shit")
    }

    /*if (someVariable > 3) {
        println("$someVariable is greater than 3")
    } else if (someVariable > 2) {
        println("$someVariable is greater than 2")
    } else {
        println("No shit")
    }*/

    when (someVariable) {
        0, 1 -> println("The value is 0 or 1")
        2 -> println("The value is 2")
        3 -> println("The value is 3") // This one will be printed
        in 4..Int.MAX_VALUE -> println("The value is greater than 4")
    }
}