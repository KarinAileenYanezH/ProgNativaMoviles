//PROBLEMA PROPUESTO 58
/*Se realiza la carga de 10 valores enteros por teclado. Se desea conocer:
a) La cantidad de valores ingresados negativos.
b) La cantidad de valores ingresados positivos.
c) La cantidad de múltiplos de 15.
d) El valor acumulado de los números ingresados que son pares.*/
fun main(parametro: Array<String>) {
    var negativos = 0
    var positivos = 0
    var mult15 = 0
    var sumapares = 0
    for(i in 1..10) {
        print("Ingrese valor:")
        val valor = readln().toInt()
        if (valor < 0)
            negativos++
        else
            if (valor > 0)
                positivos++
        if ( valor % 15 == 0)
            mult15++
        if (valor % 2 == 0)
            sumapares+=valor
    }
    println("Cantidad de valores negativos: $negativos")
    println("Cantidad de valores positivos: $positivos")
    println("Cantidad de valores múltiplos de 15: $mult15")
    println("Suma de los valores pares: $sumapares")
}