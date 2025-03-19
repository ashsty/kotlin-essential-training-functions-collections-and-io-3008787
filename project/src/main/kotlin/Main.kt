import java.io.File
import kotlin.io.path.writeLines

fun main() {
    val scoresFile = File("scores.txt")

    scoresFile.forEachLine { line-> println(line) }

    val sortedLine = scoresFile.readLines().sorted()

    val outputFile = File("sorted_scores.txt").toPath()
    outputFile.writeLines(sortedLine)
}
