
private fun getGreeting(): String {
    return "Hello world!"
}

/*
* fun getGreeting() = "Hello world!" -> single expression function
* fun printGreeting() = println("Hello Kotlin") -> Unit single expression func
* */

fun main(): Unit {
    fun getGreeting2() = "Hello Kotlin!" // local function, only can be accessed inside of the main() func

    println(getGreeting())
    println(getGreeting2())
    return Unit
}