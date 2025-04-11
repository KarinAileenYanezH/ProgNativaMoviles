//PROBLEMA PROPUESTO 64
/*Plantear una estructura que se repita 5 veces y dentro de la misma cargar 3 valores enteros. Acumular solo el mayor del cada lista de tres valores.*/
fun main(parametro: Array<String>) {
    var suma = 0
    for(i in 1..5) {
        print("Ingrese primer valor:")
        val valor1 = readln().toInt()
        print("Ingrese segundo valor:")
        val valor2 = readln().toInt()
        print("Ingrese tercer valor:")
        val valor3 = readln().toInt()
        suma += when {
            valor1 > valor2 && valor1 > valor3 -> valor1
            valor2 > valor3 -> valor2
            else -> valor3
        }
    }
    println("El valor acumulado de los mayores de cada lista de 3 valores es : $suma")
}
