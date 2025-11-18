class PRATICAL1_6 {
}fun calculate(a: Double, b: Double) {
    println("Addition: ${a + b}")
    println("Subtraction: ${a - b}")
    println("Multiplication: ${a * b}")
    println("Division: ${if (b != 0.0)   a / b    else "Cannot divide by zero"}")
}

fun main() {
    print("Enter first number: ")
    val num1 = readLine()?.toDoubleOrNull()?:return


    print("Enter second number: ")
    val num2 = readLine()?.toDoubleOrNull()?:return

    calculate(num1, b = num2)
}