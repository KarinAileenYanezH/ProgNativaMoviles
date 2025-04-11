//PROBLEMA PROPUESTO 78
/*Confeccionar una función que reciba tres enteros y los muestre ordenados de menor a mayor.
En la función main solicitar la carga de 3 enteros por teclado y proceder a llamar a la primer función definida*/
fun ordenadrMayorMenor(valor1: Int, valor2: Int, valor3: Int) {
    when {
        valor1 < valor2 && valor1 < valor3 -> {
            if (valor2 < valor3)
                println("$valor1 $valor2 $valor3 ")
            else
                println("$valor1 $valor3 $valor2 ")
        }
        valor2 < valor3 -> {
            if (valor1 < valor3)
                println("$valor2 $valor1 $valor3")
            else
                println("$valor2 $valor3 $valor1")
        }
        else -> {
            if (valor1 < valor2)
                println("$valor3 $valor1 $valor2")
            else
                println("$valor3 $valor2 $valor1")
        }

    }
}

fun main(parametros: Array<String>) {
    print("Ingrese primer valor:")
    val valor1 = readln().toInt()
    print("Ingrese segndo valor:")
    val valor2 = readln().toInt()
    print("Ingrese tercer valor:")
    val valor3 = readln().toInt()
    ordenadrMayorMenor(valor1, valor2, valor3)

}