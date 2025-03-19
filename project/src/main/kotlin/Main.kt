fun main(vararg args: String) {

    if (args.isEmpty()) {
        println("The command is empty")
        return
    }

    println("The input is ${args[0]}")

    for (element in args) {
        println(element)
    }
}

// edit configuration, program arguments
