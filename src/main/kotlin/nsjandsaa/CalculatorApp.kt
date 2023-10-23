package nsjandsaa
// CaclculatorApp.kt
class CalculatorApp {
    var command: String = ""

    fun start() {
        println("Welcome to Fancy Calculator..")

        while (command != "exit") {
            when(command) {
                "+" -> {
                    val result = addition()
                    println("result is $result")
                }

                "-" -> {
                    val result = sub()
                    println("result is $result")
                }

                "*" -> {
                    val result = mult()
                    println("result is $result")
                }

                "/" -> {
                    val result = div()
                    println("result is $result")
                }
                else -> {
                    println("Command $command is not supported")
                }
            }
            println("------------------------")
            println("Supported commands: '+', '-', '*', '/'")
            println("Enter 'exit' to stop the program")
            command = readln()
        }
    }

    fun addition(): Double {
        println("Enter the your first number: ")
        val num1 = readln().toDouble()
        println("Enter the your second number: ")
        val num2 = readln().toDouble()

        return num1 + num2
    }

    fun sub(): Double {
        println("Enter your first number: ")
        val num1 = readln().toDouble()
        println("Enter your first number: ")
        val num2 = readln().toDouble()

        return num1 - num2

    }

    fun mult(): Double {
        println("Enter your first number: ")
        val num1 = readln().toDouble()
        println("Enter your second number")
        val num2 = readln().toDouble()

        return num1 * num2
    }

    fun div(): Double {
        println("Enter your first number: ")
        val num1 = readln().toDouble()
        println("Enter your second number: ")
        val num2 = readln().toDouble()

        return num1 / num2
    }
}
