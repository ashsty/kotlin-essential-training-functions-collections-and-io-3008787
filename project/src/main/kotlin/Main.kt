fun main() {
    // Set
    val languages: Set<String> = setOf("Java", "Kotlin", "Scala", "Kotlin") // do not allow duplication

    /*
    for(language in languages) {
        println(language)
    }
    */
    languages.forEach { println(it) } // Java, Kotlin, Scala

    println(languages.size) // 3
    println(languages.contains("Java")) // true

    val mutableLanguages = mutableSetOf("Java", "Kotlin")
    mutableLanguages.add("Scala")
    mutableLanguages.remove("Scala")

    // Map
    val testScores = mapOf(
        Pair(123, 91.2),
        Pair(122, 91.3),
        121 to 91.4
    ) // "to" is infix function, we called it on value 121 and pass 91.4 to it

    println(testScores[123]) // 91.2

    /*for (entry in testScores) {
        println("The student ID is ${entry.key} and the score is ${entry.value}")
    }*/

    for ((id, score) in testScores) {
        println("The student ID is $id and the score is $score")
    }

    testScores.containsKey(123)
    testScores.containsValue(91.2)

    testScores.keys.forEach(::println) // testScores.keys return Set of keys

    val mutableTestScores = mutableMapOf(
        Pair(123, 91.2),
        Pair(122, 91.3),
        121 to 91.4
    ) // "to" is infix function, we called it on value 121 and pass 91.4 to it

    mutableTestScores[124] = 100.0 // add
    mutableTestScores.put(123, 80.2) // update if the key is already exists
    mutableTestScores.remove(122)

    mutableTestScores.forEach(::println)
}
