//PROBLEMA PROPUESTO 77
/*En la función main solicitar que se ingrese una clave dos veces por teclado.
Desarrollar una función que reciba dos String como parametros y muestre un mensaje si las dos claves ingresadas son iguales o distintas.*/
fun verificarClaves(clave1: String, clave2:String) {
    if (clave1 == clave2)
        println("Se ingresaron las dos veces la misma clave")
    else
        print("No se ingresó las dos veces con el mismo valor")
}

fun main(parametro: Array<String>) {
    print("Ingrese primer clave;")
    val clave1 = readln()
    print("Repita el ingreso de la misma clave;")
    val clave2 = readln()
    verificarClaves(clave1, clave2)
}