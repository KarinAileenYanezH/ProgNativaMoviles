//PROBLEMA PROPUESTO 107
/*Desarrollar un programa que permita ingresar un arreglo de n elementos, ingresar n por teclado.
Elaborar dos funciones una donde se lo cree y cargue al arreglo y otra que sume todos sus elementos
y retorne dicho valor a la main donde se lo imprima.*/
fun cargarArra(): IntArray {
    print("¿Cuántos elementos tendrá el arreglo?:")
    val cantidad = readln().toInt()
    val arreglo = IntArray(cantidad)
    for(i in arreglo.indices) {
        print("Ingrese elemento:")
        arreglo[i] = readln().toInt()
    }
    return arreglo
}

fun imprimirArra(arreglo: IntArray) {
    println("Listado completo del arreglo")
    for(elemento in arreglo)
        println(elemento)
}

fun sumarArra(arreglo: IntArray): Int {
    var suma = 0
    for(elemento in arreglo)
        suma += elemento
    return suma;
}

fun main(parametro: Array<String>) {
    var arreglo = cargarArra()
    imprimirArra(arreglo)
    println("La suma de todos sus elementos es ${sumarArra(arreglo)}")
}

