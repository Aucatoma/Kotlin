fun sumarNumeros(numeroUno: Int, numeroDos: Int): Int {
    return numeroUno + numeroDos
}

fun main(args: Array<String>) {
    println("Hello, world")
    println(sumarNumeros(2, 3))

    var nombre: String = "Daniel"
    var apellido: String? = "Aucatoma" //Question mark means that this variable could be null
    var edad: Int = 21
    var casado = false

    val edadActual = 21

    when (casado) {
        true -> {
            println("Está casado")
        }
        else -> {
            println("No está casado")
        }
    }

    val superHeroe = if (casado) {
        "jajaja"
    } else {
        "jojojo"
    }

    /* Template String */
    println("Superherore: $superHeroe")
}


class Persona {

    lateinit var edadActual: Integer

    //constructor(edadActual: Any)
    constructor(edadActual: Integer) {
        this.edadActual = edadActual
    //    iniciar(edad)
    }

    fun inciar(edad: Integer){
        edadActual = edad
    }
}

class PersonaDos(edad: Integer, nombre: String){
    var nEdad = edad
    var nNombre = nombre
    var nCedula: String? = null

    constructor(edad2: Integer, nombre2: String, cedula: String) : this(edad2, nombre2){
        nCedula = cedula
    }
}