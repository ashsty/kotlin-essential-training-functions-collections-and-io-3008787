
fun printFormattedName(firstName: String, lastName: String, nameFormatter: (String, String) -> String) {
    println(nameFormatter(firstName, lastName))
}

fun main() {
    printFormattedName("John", "Mike") { firstName, lastName ->
        "Mr $firstName $lastName" // Mr John Mike
    }

    printFormattedName("Mina", "Park") { firstName, lastName ->
        "Ms $lastName $firstName" // Ms Park Mina
    }
}