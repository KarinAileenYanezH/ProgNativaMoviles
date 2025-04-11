//PROBLEMA PROPUESTO 41
/*Desarrollar un programa que permita cargar n números enteros y luego nos informe cuántos valores
fueron pares y cuántos impares.Emplear el operador "%" en la condición de la estructura condicional:
	if (valor % 2 == 0)         //Si el if se verifica verdadero luego es par.*/
fun main(parametro: Array<String>) {
    var pares = 0
    var impares = 0
    print("Cuantos números ingresará:")
    val n = readln().toInt()
    var x = 1
    while (x <= n) {
        print("Ingrese el valor:")
        val valor = readln().toInt()
        if (valor % 2 == 0)
            pares = pares + 1
        else
            impares = impares + 1
        x = x + 1
    }
    println("Cantidad de pares: $pares")
    println("Cantidad de impares: $impares");
}
