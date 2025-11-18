fun main() {
    val numbers = arrayListOf<Int>()

    println("Enter 5 numbers:")
    for (i in 1..5) {
        print("Number $i: ")
        val input = readLine()?.toIntOrNull() ?: 0
        numbers.add(input)
    }


    val LargestNumber = numbers.maxOrNull()

    println("\nEntered Numbers: $numbers")
    println("largest Number: $LargestNumber")
}