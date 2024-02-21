fun main (args: Array<String>) {
    val check: String? = readLine()
    val checkVal: Float = check?.toFloat() ?: 0f

    val friend: String? = readLine()
    val friendCount: Int = friend?.toInt() ?: 0

    val tip: String? = readLine()
    val tipVal: Float = tip?.toFloat() ?: 0f

    val tips = ((checkVal / 100) * tipVal)
    val result = (checkVal + tips) / friendCount

    if (checkVal.toInt() <= 0 || friendCount.toInt() <= 0) {
        println("Inappropriate values")
    }
    else {
        println(result)
    }


}