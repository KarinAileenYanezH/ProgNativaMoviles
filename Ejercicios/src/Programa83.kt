//PROBLEMA PROPUESTO 83
/*Elaborar una función que nos retorne el perímetro de un cuadrado pasando como parámetros el valor del lado.*/
fun retornarPerimetro(lado: Int): Int {
    val perimetro = lado * 4
    return perimetro
}

fun main(parametro: Array<String>) {
    print("Ingrese el lado del cuadrado:")
    val lado = readln().toInt()
    print("El perimetro es: ${retornarPerimetro(lado)}")
}