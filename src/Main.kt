fun sumarNumeros(numeroUno: Int, numeroDos: Int): Int{
    return numeroUno + numeroDos
}

fun main (args: Array<String>){
    println("Hello, world")
    println(sumarNumeros(2, 3))

    var nombre: String = "Daniel"
    var apellido: String = "Aucatoma"
    var edad: Int = 21
    var casado = false

    val edadActual = 21

    when(casado){
        true -> {
            println("Está casado")
        }
        else -> {
            println("No está casado")
        }
    }
}