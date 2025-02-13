fun main () {
    val secuenciaCasos = generateSequence {
        readln().split(" ").takeIf { it[0].toInt() != 0 }?.let { it[0].toInt() to it[1] }
    }

    secuenciaCasos.forEach { (numFilas, caracter) ->
        (0..numFilas / 2).forEach { i -> // parte superior
            println(" ".repeat(numFilas / 2 - i) + caracter.repeat(2 * i + 1))
        }
        (numFilas / 2 - 1 downTo 0).forEach { i -> // parte inferior
            println(" ".repeat(numFilas / 2 - i) + caracter.repeat(2 * i + 1))
        }
        println("-".repeat(32)) // separador
    }
}