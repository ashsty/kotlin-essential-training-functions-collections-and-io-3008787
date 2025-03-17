
fun checkType(input: Any) {
    // input.length
    // can not be processed because the type is "Any"

    if(input is String) { // type check using "is"
        println("$input is String with length ${input.length}") // SMART CASTING is on because the compiler knows that the input is string within this scope
    }

    if (input !is Int) {
        println("$input is not Int")
    }
}

fun checkTypeWithNull(input: Any?) {
    when (input) {
        null -> println("$input is null") // SMART CASTING
        is String? -> println("$input is String of length ${input.length}")
    }
}

fun main() {
    val aGenericVariable: Any = 5
    // val aIntVariable: Int = aGenericVariable
    // type mismatch

    val aIntVariable: Int = aGenericVariable as Int // casting using "as"

    val aGenericVariable2: Any = "String"
    // val aIntVariable2: Int = aGenericVariable2 as Int
    // ClassCastException, String class can not be cast as Int Class

    checkType(aGenericVariable2) // String is String with length 6, String is not Int
    checkTypeWithNull(aGenericVariable2) // String is String with length 6

}