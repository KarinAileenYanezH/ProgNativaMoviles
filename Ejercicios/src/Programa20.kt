//PROBLEMA PROPUESTO P20
/*Se ingresa por teclado un valor entero, mostrar una leyenda que indique si el número es positivo, nulo o negativo.*/
fun main(parametro: Array<String>){
    print("Ingrese un valor entero:")
    val valor = readln().toInt()
    if (valor == 0)
        println("Se ingresó el cero")
    else
        if (valor > 0)
            println("Se ingresó un valor positivo")
        else
            println("Se ingresó un valor negativo")
}
