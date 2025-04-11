//PROBLEMA PROPUESTO 108
/*Cargar un arreglo de n elementos. Imprimir el menor elemento y un mensaje si se repite dentro del arreglo.*/
fun cargarA(): IntArray {
    print("¿Cuántos elementos tendrá el arreglo?:")
    val cantidad = readln().toInt()
    val arreglo = IntArray(cantidad)
    for(i in arreglo.indices) {
        print("Ingrese elemento:")
        arreglo[i] = readln().toInt()
    }
    return arreglo
}

fun imprimirA(arreglo: IntArray) {
    println("Listado completo del arreglo")
    for(elemento in arreglo)
        println(elemento)
}

fun mayor(arreglo: IntArray): Int {
    var may = arreglo[0]
    for(elemento in arreglo)
        if (elemento > may)
            may = elemento
    return may
}

fun repite(arreglo: IntArray, buscar: Int): Boolean {
    var cant = 0
    for(elemento in arreglo)
        if (elemento == buscar)
            cant++
    if (cant > 1)
        return true
    else
        return false
}

fun main(parametro: Array<String>) {
    var arreglo = cargarA()
    imprimirA(arreglo)
    println("El elemento mayor es ${mayor(arreglo)}")
    if (repite(arreglo,mayor(arreglo)))
        println("Se repite el mayor en el arreglo")
    else
        println("No se repite el mayor en el arreglo")
}