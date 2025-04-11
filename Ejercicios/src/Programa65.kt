//PROBLEMA PROPUESTO 65
/*Realizar un programa que lea los lados de n triángulos, e informar:
a) De cada uno de ellos, qué tipo de triángulo es: equilátero (tres lados iguales), isósceles (dos lados iguales), o escaleno (ningún lado igual)
b) Cantidad de triángulos de cada tipo.*/
fun main(argumento: Array<String>) {
    var cant1 = 0
    var cant2 = 0
    var cant3 = 0
    print("Ingrese la cantidad de triángulos:")
    val n = readln().toInt()
    for(i in 1..n) {
        print("Ingrese lado 1:")
        val lado1 = readln().toInt()
        print("Ingrese lado 2:")
        val lado2 = readln().toInt()
        print("Ingrese lado 3:")
        val lado3 = readln().toInt()
        when {
            lado1 == lado2 && lado1 == lado3 -> {
                println("Es un triángulo equilatero.")
                cant1++
            }
            lado1 == lado2 || lado1 == lado3 || lado2 == lado3 -> {
                println("Es un triángulo isósceles.")
                cant2++
            }
            else -> {
                println("Es un triángulo escaleno.")
                cant3++
            }
        }
    }
    println("Cantidad de triángulos equilateros: $cant1")
    println("Cantidad de triángulos isósceles: $cant2")
    println("Cantidad de triángulos escalenos: $cant3")
}
