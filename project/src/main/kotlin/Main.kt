
fun main() {
    val message = try {
        "The value is ${10 / 0}"
    } catch (error: Throwable) {
       "Error: ${error.message}"
    }

    println(message) // Error: / by zero

    /*try {
        val message = "The value is ${10 / 0}"
    } catch (error: Throwable) {
        println("Error: ${error.message}")
    }*/
}