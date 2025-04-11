//PROBLEMA PROPUESTO 38
/*Realizar un programa que imprima 25 términos de la serie 11 - 22 - 33 - 44, etc. (No se ingresan valores por teclado)*/
fun main(parametro: Array<String>) {
    var termino = 11
    var x = 1
    while (x <= 25) {
        println(termino)
        termino = termino + 11
        x = x + 1
    }
}