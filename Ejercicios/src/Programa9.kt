//PROBLEMA PROPUESTO P9
/*Realizar un programa que lea por teclado cuatro valores numéricos
enteros e informar su suma y promedio.*/
fun main(parametro: Array<String>) {
    print("Ingrese primer valor:")
    val v1 = readln().toInt()
    print("Ingrese segundo valor:")
    val v2 = readln().toInt()
    print("Ingrese tercer valor:")
    val v3 = readln().toInt()
    print("Ingrese cuarto valor:")
    val v4 = readln().toInt()
    val suma = v1 + v2 + v3 + v4
    println("La suma de los cuatro valores es $suma")
    val prom = suma / 4
    println("El promedio de los cuatro valores es $prom")
}