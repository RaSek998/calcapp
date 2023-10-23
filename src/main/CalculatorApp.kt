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
                    val result = substraction()
                    println("result is $result")
                }

                "*" -> {
                    val result = multiplication()
                    println("result is $result")
                }

                "/" -> {
                    val result = dividation()
                    println("result is $result")
                }
                else -> {
                    println("Command $command is not supported")
                }
            }
            println("------------------------")
            println("Supported commands: '+', '-', '*', '%'")
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

    fun substraction(): Double {
        println("Enter your first number: ")
        val num1 = readln().toDouble()
        println("Enter your second number: ")
        val num2 = readln().toDouble()

        return num1 - num2
    }

    fun multiplication(): Double {
        println("Enter your first number: ")
        val num1 = readln().toDouble()
        println("Enter your second number: ")
        val num2 = readln().toDouble()

        return num1 * num2
    }

    fun dividation(): Double {
        println("Enter your first number: ")
        val num1 = readln().toDouble()
        println("Enter your second number: ")
        val num2 = readln().toDouble()

        return num1 / num2
    }
}