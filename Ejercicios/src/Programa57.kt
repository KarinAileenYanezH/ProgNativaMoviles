//PROBLEMA PROPUESTO 57
/*Escribir un programa que pida ingresar coordenadas (x,y) que representan puntos en el plano.
Informar cuántos puntos se han ingresado en el primer, segundo, tercer y cuarto cuadrante.
Al comenzar el programa se pide que se ingrese la cantidad de puntos a procesar.*/
fun main(parametro: Array<String>) {
    var cant1 = 0
    var cant2 = 0
    var cant3 = 0
    var cant4 = 0
    print("Cantidad de puntos a ingresar:")
    val cantidad = readln().toInt()
    for(i in 1..cantidad) {
        print("Ingrese coordenada x:")
        val x = readln().toInt()
        print("Ingrese coordenada y:")
        val y = readln().toInt()
        if (x > 0 && y > 0)
            cant1++
        else
            if (x < 0 && y > 0)
                cant2++;
            else
                if (x < 0 && y < 0)
                    cant3++
                else
                    if (x > 0 && y < 0)
                        cant4++
    }
    println("Cantidad de puntos en el primer cuadrante: $cant1")
    println("Cantidad de puntos en el segundo cuadrante: $cant2")
    println("Cantidad de puntos en el tercer cuadrante: $cant3")
    println("Cantidad de puntos en el cuarto cuadrante: $cant4")
}