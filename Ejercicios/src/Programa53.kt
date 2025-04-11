//PROBLEMA PROPUESTO 53
/*Desarrollar un programa que solicite la carga de 10 números e imprima la suma de los últimos 5 valores ingresados.*/
fun main(parametro: Array<String>) {
    var suma = 0
    for(i in 1..10) {
        print("Ingrese un valor entero:")
        val valor = readln().toInt()
        if (i > 5)
            suma += valor
    }
    print("La suma de los últimos 5 valores es: $suma");
}
