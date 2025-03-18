fun main() {
    /*val sortedScore = testScores.map { entry -> entry.value }
        .sorted()

    for (i in 0..2) {
        testScores.filter { entry -> entry.value == sortedScore[i] }
            .map { entry -> entry.key }
            .forEach(::println)
    }*/

    testScores.toList()
        .sortedBy { pair -> pair.second } // sort by test score
        .map { pair -> pair.first } // make a student id list
        .take(3) // take the lowest 3
        .forEach(::println)

    println()
    
    testScores.entries
        .sortedBy { pair -> pair.value }
        .take(3)
        .forEach { pair -> println(pair.key) }
}
