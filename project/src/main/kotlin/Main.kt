
fun main() {
    val stringList: List<String> = listOf("kotlin", "java")
    val listOfInt = listOf(1, 2, 3, null)

    val emptyStringList = emptyList<String>()
    val emptyStringList2: List<String> = emptyList()

    val doubleValues = List<Int>(5) { index ->
        2 * index
    }

    doubleValues.forEach {
        println(it)
    }

    val firstInt = listOfInt.get(0)
    val secondInt = listOfInt[1]

    /*
    listOfInt.add(0)
    listOfInt[1] = secondInt

    can not be modified this way
    because "List" is unmodifiable
    */

    val languages = mutableListOf("java", "kotlin")

    languages.add("Python")
    languages[0] = "Java"
    languages.set(1, "Kotlin")
    languages.add(1, "Javascript")
    languages.remove("Javascript")
    languages.removeAt(1)

    languages.forEach { println(it) } // Java, Python

    //val aList: List<String> = mutableListOf("dog", "cat") // upcasting to immutable list, you can not modify aList

    val mutableList = mutableListOf("dog", "cat") // 가변 리스트
    val aList: List<String> = mutableList         // 읽기 전용 리스트로 캐스팅

    mutableList.add("rabbit")  // ✅ 가능! 원본 리스트 수정됨

    println(aList)  // 출력: [dog, cat, rabbit] (aList도 변경됨!)
}