//PROBLEMA PROPUESTO 186
/*Confeccionar una agenda. Utilizar un MutableMap cuya clave sea de la clase Fecha:
data class Fecha(val dia: Int, val mes: Int, val año: Int)
Como valor en el mapa almacenar un String.
Implementar las siguientes funciones:
1) Carga de datos en la agenda.
2) Listado completo de la agenda.
3) Consulta de una fecha.*/
data class Fecha(val dia: Int, val mes: Int, val año: Int)

fun cargar(agenda: MutableMap<Fecha, String>) {
    do {
        println("Ingrese fecha")
        print("Ingrese el día:")
        val dia = readln().toInt()
        print("Ingrese el mes:")
        val mes = readln().toInt()
        print("Ingrese el año:")
        val año = readln().toInt()
        print("Ingrese todas las actividades para ese día:")
        val actividades = readln()
        agenda[Fecha(dia, mes, año)] = actividades
        print("Ingrese otra fecha (si/no):")
        val opcion = readln()
    } while (opcion == "si")
}

fun imprimir(agenda: MutableMap<Fecha, String>) {
    for((fecha, actividad) in agenda) {
        println("Fecha ${fecha.dia}/${fecha.mes}/${fecha.año}")
        println("Actividades: $actividad")
        println()
    }
}

fun consultaFecha(agenda: MutableMap<Fecha, String>) {
    println("Ingrese una fecha a consultar")
    print("Ingrese el día:")
    val dia = readln().toInt()
    print("Ingrese el mes:")
    val mes = readln().toInt()
    print("Ingrese el año:")
    val año = readln().toInt()
    val fecha = Fecha(dia, mes, año)
    if (fecha in agenda)
        println("Actividades: ${agenda[fecha]}")
    else
        println("No existen actividades registradas para dicha fecha")
}

fun main(args: Array<String>) {
    val agenda: MutableMap<Fecha, String> = mutableMapOf()
    cargar(agenda)
    imprimir(agenda)
    consultaFecha(agenda)
}
