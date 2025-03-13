
fun main() {
    val aChar: Char = 'A'
    val aNumericChar = '0'
    val newLineChar = '\n'

//    val concatOption1 = 'a' + 'b' don't support
//    val concatOption2 = 'ab' more than 2 letters

    val aString: String = "Hello World"
    val escaped = "Hello \nWorld"
    val raw = """
        Some
        multiline
       text
            is going on
         here
    """

    val raw2 = """
        |Some
        multiline
       text
            |is going on
         here
    """.trimMargin("|") // remove the margins if the line starts with |

    val concatString = "Hello" + "Kotlin!"
    val concatNumber = "The number" + 10 // The number 10

    val aNumber = 10
    val concatTemplate = "The number $aNumber" // The number 10
    val concatTemplate2 = "The number ${aNumber + 1}" // The number 11

    println(concatTemplate)
    println(concatTemplate2)

    val someString = " "
    println(someString.isEmpty()) // false
    println(someString.isBlank()) // true
}