//PROBLEMA PROPUESTO 72
/*Desarrollar un programa con dos funciones. La primer solicite el ingreso de un entero y muestre el cuadrado de dicho valor.
La segunda que solicite la carga de dos valores y muestre el producto de los mismos. LLamar desde la main a ambas funciones.*/
fun calculaCuadrado() {
    print("Ingrese un entero:")
    val valor = readln().toInt()
    val cuadrado = valor * valor
    println("El cuadrado es $cuadrado")
}

fun calcularProducto() {
    print("Ingrese primer valor:")
    val valor1 = readln().toInt()
    print("Ingrese segundo valor:")
    val valor2 = readln().toInt()
    val producto = valor1 * valor2
    println("El producto de los valores es: $producto")
}

fun main(parametro: Array<String>) {
    calculaCuadrado()
    calcularProducto()
}
