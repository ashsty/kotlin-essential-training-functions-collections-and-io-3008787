import java.io.File

fun main() {
    print("Enter a file name: ")
    // val filename = readLine()
    val filename = readLine() ?: "" // handle null
    println("You entered: $filename") // project/gradle.properties

//    val isValidFile = File(filename).isFile
// Type mismatch because we can be sure that the entered filename is not null
    val isValidFile = File(filename).isFile

    if (isValidFile) {
        println("Your file is valid")
    } else {
        println("Your file is not valid")
    }
}
