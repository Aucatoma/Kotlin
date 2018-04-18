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

    var Juan = Persona("Juan", Integer(12))
    println(Juan)

    var daniel = PersonaDos(Integer(21), "Daniel", "1717985848")
    println(daniel)

    var cuadrado1 = Cuadrado("Cuadrado rojo", Integer(12))
    println(cuadrado1)
}


class Persona {

    lateinit var nombre: String
    lateinit var edadActual: Integer

    //constructor(edadActual: Any)
    constructor(nombre: String, edadActual: Integer) {
        this.nombre = nombre
        this.edadActual = edadActual
    //    iniciar(edad)
    }

    fun inciar(edad: Integer){
        edadActual = edad
    }

    override fun toString(): String {
        return "El nombre es $nombre, la edad actual es $edadActual"
    }
}

class PersonaDos(edad: Integer, nombre: String){
    var nEdad = edad
    var nNombre = nombre
    var nCedula: String? = null

    constructor(edad2: Integer, nombre2: String, cedula: String) : this(edad2, nombre2){
        nCedula = cedula
    }

    /* Código que se ejecuta después del constructor */
    init {
        iniciar(edad)
    }

    fun iniciar(edad: Integer){
        nEdad = edad
    }

    override fun toString(): String {
        return "$nNombre tiene $nEdad y su cédula es $nCedula"
    }
}

open class Figura(nombre: String){
    val nNombre = nombre
}

class Cuadrado(nombre: String, valorLado: Integer): Figura(nombre){
    var nValorLado = valorLado

    override fun toString(): String {
        return "El valor del lado del cuadrado es $nValorLado"
    }
}