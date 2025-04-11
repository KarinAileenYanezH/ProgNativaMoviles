//PROBLEMA PROPUESTO P14
/*Cargar un valor entero por teclado comprendido entre 1 y 99. Almacenar en otra variable la cantidad de dígitos que tiene el valor ingresado por teclado.
Mostrar la cantidad de dígitos del número ingresado por teclado.*/
fun main(parametro: Array<String>) {
    print("Ingrese un valor entero comprendido entre 1 y 99:")
    val valor=readln().toInt()
    var cantidad = if (valor <10) 1 else 2
    println("El número $valor tiene $cantidad dígito/s")
}