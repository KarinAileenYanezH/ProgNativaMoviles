//PROBLEMA PROPUESTO 89
/*Elaborar una función que nos retorne el perímetro de un cuadrado pasando como parámetros el valor del lado.*/
fun devolverPerimetro(lado: Int) = lado * 4

fun main(parametro: Array<String>) {
    print("Ingrese el lado del cuadrado:")
    val lado = readln().toInt()
    print("El perimetro es: ${devolverPerimetro(lado)}")
}