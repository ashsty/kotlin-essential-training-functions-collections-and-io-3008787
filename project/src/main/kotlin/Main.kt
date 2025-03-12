
fun main() {
    val aInt: Int = 0  // 32bit
    val anotherInt = 0

    val aByte: Byte = 0 // 8bit
    val aShort: Short = 0 // 16bit

    val aLong: Long = 0 // 62bit
    val inferredInt = 10 // 32bit
    val inferredLong = 1000000000 // 64bit

    val anotherLong = 10L // 32bit

    val unsignedInt: UInt = 0U
    val unsignedLong = 0UL

    val aDouble: Double = 0.0 // 64bit
    val aFloat: Float = 0.0F // 32bit

    val inferredDouble = 0.0
    val inferredFloat = 0.0F

    println(5 == 4)
    println(10f > 9.9)
    println(10.8.toInt())
    println(10.toFloat())
    println((5.toULong()))

    println(100_000_000.toByte()) // 0, 큰 값에서 작은 값으로 줄일 때는 주의
}