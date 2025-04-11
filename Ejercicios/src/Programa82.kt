//PROBLEMA PROPUESTO 82
/*Elaborar una función que reciba tres enteros y nos retorne el valor promedio de los mismos.*/
fun retornarPromedio(v1: Int, v2: Int, v3: Int): Int {
    val promedio = (v1 + v2 + v3) / 3
    return promedio
}

fun main(parametro: Array<String>) {
    print("Ingrese primer valor:")
    val valor1 = readln().toInt()
    print("Ingrese segundo valor:")
    val valor2 = readln().toInt()
    print("Ingrese tercer valor:")
    val valor3 = readln().toInt()
    println("Valor promedio de los tres números ingresados es ${retornarPromedio(valor1, valor2, valor3)}")
}
