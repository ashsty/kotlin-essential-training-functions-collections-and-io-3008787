
fun main() {
    var aNullableString: String? = null;
    /*
    println(aNullableString.length) compile error
    Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?

    1) println(aNullableString!!.length)  ensure that the value is not null  if it is, throws NPE exception
    2) println(aNullableString?.length) // return 'null' when it is null
    3) println(aNullableString?.length ?: "the value was null")
    */
    println(aNullableString?.length ?: "the value was null")
}