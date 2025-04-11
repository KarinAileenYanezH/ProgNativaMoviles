//PROBLEMA PROPUESTO 84
/*Confeccionar una función que calcule la superficie de un rectángulo y la retorne, la función recibe como parámetros
los valores de dos de sus lados:
                fun retornarSuperficie(lado1: Int,lado2: Int): Int
En la función main del programa cargar los lados de dos rectángulos y luego mostrar cual de los dos tiene una superficie mayor.*/
fun retornarSuperficie(lado1: Int,lado2: Int): Int {
    return lado1 * lado2
}
fun main(parametro: Array<String>) {
    println("Primer rectangulo")
    print("Ingrese lado menor del rectangulo:")
    val lado1 = readln().toInt()
    print("Ingrese lado mayor del rectangulo:")
    val lado2 = readln().toInt()
    println("Segundo rectangulo")
    print("Ingrese lado menor del rectangulo:")
    val lado3 = readln().toInt()
    print("Ingrese lado mayor del rectangulo:")
    val lado4 = readln().toInt()
    if (retornarSuperficie(lado1,lado2) == retornarSuperficie(lado3,lado4))
        print("Los dos rectangulos tiene la misma superficie")
    else
        if (retornarSuperficie(lado1,lado2) > retornarSuperficie(lado3,lado4))
            print("El primer rectangulo tiene una superficie mayor")
        else
            print("El segundo rectangulo tiene una superficie mayor")
}