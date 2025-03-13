
fun main() {
    val aChar: Char = 'A'
    val aNumericChar = '0'
    val newLineChar = '\n'

//    val concatOption1 = 'a' + 'b'
//    val concatOption2 = 'ab'

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
    """.trimMargin("|")

    val concatString = "Hello" + "Kotlin!"
    val concatNumber = "The number" + 10

    val aNumber = 10
    val concatTemplate = "The number $aNumber"
    val concatTemplate2 = "The number ${aNumber + 1}"

    println(concatTemplate)
    println(concatTemplate2)

    val someString = "Banks Sucks"
    println(someString.isEmpty())
}