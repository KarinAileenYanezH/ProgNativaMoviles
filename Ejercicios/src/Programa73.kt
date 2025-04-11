//PROBLEMA PROPUESTO 73
/*Desarrollar una función que solicite la carga de tres valores y muestre el menor.
Desde la función main del programa llamar 2 veces a dicha función (sin utilizar una estructura repetitiva)*/
fun menorValor() {
    print("Ingrese primer valor:")
    val valor1 = readln().toInt()
    print("Ingrese segundo valor:")
    val valor2 = readln().toInt()
    print("Ingrese tercer valor:")
    val valor3 = readln().toInt()
    print("Menor de los tres:")
    when {
        valor1 < valor2 && valor1 < valor3 -> println(valor1)
        valor2 < valor3 -> println(valor2)
        else -> println(valor3)
    }
}

fun main(parametro: Array<String>) {
    menorValor()
    menorValor()
}
