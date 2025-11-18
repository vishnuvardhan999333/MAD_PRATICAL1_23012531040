fun main() {
    print("Enter a Number: ")
    var num:Int?=readLine()?.toInt()

    if (num != null) {
        println(if (num % 2 == 0) "Number is Even" else "Number is Odd")
    } else {
        println("enter a valid number.")
    }
}