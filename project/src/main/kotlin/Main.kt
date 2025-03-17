
var greetingFunction: () -> Unit = {
    println("Hello World!")
}

var greetingFunction2: (String) -> String = { thingToGreet ->
    "Hello $thingToGreet" // no need to use "return"
}

/*var greetingFunction2: (String) -> String = {
    "Hello $it"
}*/

fun main() {
    greetingFunction() // Hello World!

    greetingFunction = {
        println("Hello Kotlin!")
    }

    greetingFunction.invoke() // Hello Kotlin!

    println(greetingFunction2("Mina!")) // Hello Mina!

    greetingFunction2 = {
        "Is this gonna change something?"
    }

    println(greetingFunction2.invoke("Still need one argument because of the signature of this function, but not gonna do anything with it")) // Is this gonna change something?
}