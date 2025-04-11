//PROBLEMA PROPUESTO 52
/*Confeccionar un programa que lea n pares de datos, cada par de datos corresponde a la medida de la base y la altura de un triángulo. El programa deberá informar:
a) De cada triángulo la medida de su base, su altura y su superficie (la superficie se calcula multiplicando la base por la altura y dividiendo por dos).
b) La cantidad de triángulos cuya superficie es mayor a 12.*/
fun main(parametro: Array<String>) {
    var cantidad = 0
    print("Cuantos triángulos procesará:")
    val n = readln().toInt()
    for(i in 1..n) {
        print("Ingrese el valor de la base:")
        val base = readln().toInt()
        print("Ingrese el valor de la altura:")
        val altura = readln().toInt()
        val superficie = base * altura / 2
        println("La superficie es de $superficie")
        if (superficie > 12)
            cantidad++
    }
    print("La cantidad de triángulos con superficie superior a 12 son: $cantidad")
}