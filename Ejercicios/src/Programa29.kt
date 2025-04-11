//PROBLEMA PROPUESTO P29
/*Escribir un programa que pida ingresar la coordenada de un punto en el plano, es decir dos valores enteros x e y (distintos a cero).
Posteriormente imprimir en pantalla en que cuadrante se ubica dicho punto. (1º Cuadrante si x > 0 Y y > 0 , 2º Cuadrante: x < 0 Y y > 0, etc.)*/
fun main(parametro: Array<String>) {
    print("Ingrese coordenada x:")
    val x = readln().toInt()
    print("Ingrese coordenada y:")
    val y = readln().toInt()
    if (x > 0 && y > 0)
        print("Se encuentra en el primer cuadrante")
    else
        if (x < 0 && y > 0)
            print("Se encuentra en el segundo cuadrante")
        else
            if (x < 0 && y < 0)
                print("Se encuentra en el tercer cuadrante")
            else
                if (x > 0 && y < 0)
                    print("Se encuentra en el cuarto cuadrante")
                else
                    print("Se encuentra en un eje")
}