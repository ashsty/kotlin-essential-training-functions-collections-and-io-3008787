fun main() {
    val readOnlyList = listOf(1, 2, 3)
    val readOnlySet = setOf(1, 2, 3)
    val readOnlyMap = mapOf(1 to "one", 2 to "two")

    val mutableList = mutableListOf(1, 2)
    val mutableSet = mutableSetOf(1, 2)
    val mutableMap = mutableMapOf(1 to "one", 2 to "two")

    readOnlySet.size
    mutableMap.size

    readOnlyMap.isEmpty()
    mutableSet.isNotEmpty()

    for (element in readOnlyList) {
        println(element) // 1, 2, 3
    }

    mutableList.forEach(::println) // 1, 2

    readOnlyList.first() // [1]
    mutableSet.first() // [1]

    mutableList.take(100) // [1, 2], take for the designated size
    readOnlySet.take(2) // [1, 2]

    mutableMap.filter { entry -> entry.key == 2 } // 2=two
    readOnlyList.filter { value -> value > 1 } // [2, 3]

    val languages = mapOf("kotlin" to 5, "java" to 3, "javascript" to 4, "c++" to 2, "python" to 6)

    languages.filter { it.value >= 4 }
        .map { it -> it.key } // turned to key List
        .sorted()
        .forEach(::println) // javascript, kotlin, python
}
