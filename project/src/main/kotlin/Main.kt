
fun printCalculatedValue(value1: Int, value2: Int, calculator: (Int, Int) -> Int) {
    println(calculator(value1, value2))
}

fun main() {
    printCalculatedValue(10, 12, { value1, value2 -> // higher-order function
        value1 + value2
    })

    printCalculatedValue(10, 9) { value1, value2 -> // trailing lambda syntax
        value1 - value2
    }
}
