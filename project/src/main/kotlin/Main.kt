
private fun printGreeting() = println("Hello World!")

fun main() {
    fun getGreeting(thingToGreet: String) = "Hello $thingToGreet"
    fun getGreeting2(thingToGreet: Int) = "Hello $thingToGreet"
    fun getGreeting3(greeting: String, thingToGreet: String) = "$greeting $thingToGreet"
    fun getGreeting4(greeting: String = "Hi", thingToGreet: String = "Mina") = "$greeting $thingToGreet"

    println(getGreeting("Kotlin")) // Hello Kotlin
    println(getGreeting2(5)) // Hello 5
    println(getGreeting3("Hello", "DH")) // Hello DH
    println(getGreeting4()) // Hi Mina
    println(getGreeting4("Hey")) // Hey Mina
    println(getGreeting4(thingToGreet = "DH")) // Hi DH, -> named argument
    println(getGreeting4(thingToGreet = "DH", greeting = "Hiya")) // Hiya DH -> no need to overload
}