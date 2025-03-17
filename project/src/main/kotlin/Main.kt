
fun getMessage(input: Int) = if (input > 3) { //
        "The value is greater than 3"
    } else { // has to cover every range
        "The value is no greater than 3"
    }

fun getMessageWithWhen(input: Int) = when (input) {
    3 -> "The value is 3"
    else -> "The value is not 3"
}

/*fun getMessage(input: Int): String {
    return if (input > 3) {
        "The value is greater than 3"
    } else {
        "The value is no greater than 3"
    }
}*/

fun main() {
    val someVariable = 3
    /*val message = if (someVariable > 3) {
        "The value is greater than 3"
    } else {
        "The value is no greater than 3"
    }*/

    println(getMessage(someVariable))  // The value is no greater than 3
    println(getMessageWithWhen(someVariable))  // The value is 3
}