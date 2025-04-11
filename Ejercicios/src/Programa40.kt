//PROBLEMA PROPUESTO 40
/*Realizar un programa que permita cargar dos listas de 5 valores cada una. Informar con un mensaje cual de las
dos listas tiene un valor acumulado mayor (mensajes "Lista 1 mayor", "Lista 2 mayor", "Listas iguales")
Tener en cuenta que puede haber dos o más estructuras repetitivas en un algoritmo.*/
fun main(parametro: Array<String>) {
    var x = 1
    var suma1 = 0
    println("Ingreso de la primer lista de valores")
    while (x <= 5) {
        print("Ingrese valor:")
        val valor=readln().toInt()
        suma1 = suma1 + valor
        x = x + 1
    }
    println("Ingreso de la segunda lista de valores")
    x = 1
    var suma2 = 0
    while (x <= 5) {
        print("Ingrese valor:")
        val valor=readln().toInt()
        suma2 = suma2 + valor
        x = x + 1
    }
    if (suma1 > suma2)
        print("Lista 1 mayor.")
    else
        if (suma2 > suma1)
            print("Lista2 mayor.")
        else
            print("Listas iguales.")
}
