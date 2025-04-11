//PROBLEMA PROPUESTO 111
/*Implementar una clase llamada Alumno que tenga como propiedades su nombre y su nota. Definir los métodos para inicializar
sus propiedades por teclado, imprimirlos y mostrar un mensaje si está regular (nota mayor o igual a 4) Definir dos objetos de la clase Alumno.*/
class Alumno {
    var nombre: String = ""
    var nota: Int = 0

    fun inicializar() {
        print("Ingrese el nombre del alumno:")
        nombre = readln().toString()
        print("Ingrese su nota:")
        nota = readln().toInt()
    }

    fun imprimir() {
        println("Alumno: $nombre tiene una nota de $nota")
    }

    fun mostrarEstado () {
        if (nota >= 4)
            println("$nombre se encuentra en estado REGULAR")
        else
            println("$nombre no está REGULAR")
    }
}

fun main(parametros: Array<String>) {
    val alumno1 = Alumno()
    alumno1.inicializar()
    alumno1.imprimir()
    alumno1.mostrarEstado()
    val alumno2 = Alumno()
    alumno2.inicializar()
    alumno2.imprimir()
    alumno2.mostrarEstado()
}

