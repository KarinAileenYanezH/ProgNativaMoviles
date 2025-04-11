//PROBLEMA PROPUESTO 95
/*Elaborar una función que muestre la tabla de multiplicar del valor que le enviemos como parámetro.
Definir un segundo parámetro llamado termino que por defecto almacene el valor 10.
Se deben mostrar tantos términos de la tabla de multiplicar como lo indica el segundo parámetro.
Llamar a la función desde la main con argumentos nombrados.*/
fun tabla(numero: Int, terminos: Int = 10) {
    for(i in numero..numero*terminos step numero)
        println(i)
}

fun main(parametro: Array<String>) {
    println("Tabla del 3")
    tabla(3)
    println("Tabla del 3 con 5 terminos")
    tabla(3, 5)
    println("Tabla del 3 con 20 terminos")
    tabla(terminos = 20, numero = 3)
}
