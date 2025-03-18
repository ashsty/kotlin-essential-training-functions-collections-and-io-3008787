fun main() {
    val languages = listOf("Kotlin", "Java", "c++", "Python")
        .filter { it.length > 4 } // ["Kotlin", "Python"]
        .map { it.length }  // 6, 6
    // cost a lot of resource because "filter" line will be work on every line before the "map" line executed

    // Sequence: depth-first approach
    // iterable: breadth-first approach

    val languageSequence = sequenceOf("Kotlin", "Java", "c++", "Python")

    val fromIterable = listOf("Kotlin", "Java", "c++", "Python").asSequence()

    languageSequence.filter { it.length > 4 } // ["Kotlin", "Python"]
        .map { it.length } // 6, 6
}
