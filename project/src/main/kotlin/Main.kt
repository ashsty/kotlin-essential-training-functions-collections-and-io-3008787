
fun printFormattedName(firstName: String, lastName: String, nameFormatter: (String, String) -> String) {
    println(nameFormatter(firstName, lastName))
}

val basicFormatter: (String, String) -> String = { first, last ->
    "$first $last"
}

val fancyFormatter: (String, String) -> String = { first, last ->
    "The first name is $first, last name is $last"
}

fun main() {
    printFormattedName("John", "Mike", basicFormatter) // John Mike
    printFormattedName("Mina", "Park", fancyFormatter) // The first name is Mina, last name is Park
    printFormattedName("Homer", "Simpson") { first, last ->
        "$first, $last" // Homer, Simpson
    }
}