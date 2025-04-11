//PROBLEMA PROPUESTO 69
/*Realizar la carga de la cantidad de hijos de 10 familias. Contar cuantos tienen 0,1,2 o más hijos. Imprimir dichos contadores.*/
fun main(parametro: Array<String>) {
    var conta1 = 0
    var conta2 = 0
    var conta3 = 0
    var conta4 = 0
    for(i in 1..10) {
        print("Ingrese la cantidad de hijos de la familia:")
        val cantidad = readln().toInt()
        when (cantidad) {
            0 -> conta1++
            1 -> conta2++
            2 -> conta3++
            else -> conta4++
        }
    }
    println("Cantidad de familias con 0 hijos: $conta1")
    println("Cantidad de familias con 1 hijos: $conta2")
    println("Cantidad de familias con 2 hijos: $conta3")
    println("Cantidad de familias con más de 2 hijos: $conta4")
}