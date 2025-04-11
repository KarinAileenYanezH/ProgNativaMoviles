//PROBLEMA PROPUESTO 63
/*Se ingresa por teclado un valor entero, mostrar una leyenda por pantalla que indique si el número es positivo, nulo o negativo.*/
fun main(parametro: Array<String>){
    print("Ingrese un valor entero:")
    val valor = readln().toInt()
    when {
        valor == 0 -> println("Se ingresó el cero")
        valor > 0 -> println("Se ingresó un valor positivo")
        else -> println("Se ingresó un valor negativo")
    }
}