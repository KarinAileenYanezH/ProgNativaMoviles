//PROBLEMA PROPUESTO 39
/*Mostrar los múltiplos de 8 hasta el valor 500. Debe aparecer en pantalla 8 - 16 - 24, etc.*/
fun main(parametro: Array<String>) {
    var mult8 = 8
    while (mult8 <= 500) {
        print("$mult8 -")
        mult8 = mult8 + 8
    }
}

