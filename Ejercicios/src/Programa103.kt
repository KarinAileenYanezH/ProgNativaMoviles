//PROBLEMA PROPUESTO 103
/*Desarrollar un programa que permita ingresar un arreglo de 8 elementos enteros, e informe:
El valor acumulado de todos los elementos.
El valor acumulado de los elementos que sean mayores a 36.
Cantidad de valores mayores a 50.
(Definir dos for, en el primero realizar la carga y en el segundo proceder a analizar cada elemento)*/
fun main(parametro: Array<String>) {
    val arreglo = IntArray(8)
    for(i in arreglo.indices) {
        print("Ingrese elemento:")
        arreglo[i] = readln().toInt()
    }
    var suma = 0
    var sumaMayor36 = 0
    var cantMayor50 = 0
    for(elemento in arreglo) {
        suma += elemento
        if (elemento > 30)
            sumaMayor36 += elemento
        if (elemento > 50)
            cantMayor50++
    }
    println("Valor acumulado del arreglo: $suma")
    println("Valor acumulado de los elementos mayores a 36: $sumaMayor36")
    println("Cantidad de elementos mayores a 50: $cantMayor50")
}
