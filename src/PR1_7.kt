fun factorial(n: Int): Int {
    if (n == 0 || n == 1) {
        return 1
    }
    return n * factorial(n - 1)
}

fun main() {
    print("Enter Number: ")
    val number = readLine()?.toIntOrNull()

    if (number != null && number >= 0) {
        val result = factorial(number)
        println("Factorial of $number :$result")
    } else {
        println("Please enter a valid non-negative number.")
    }
}