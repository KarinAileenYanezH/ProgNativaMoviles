//PROBLEMA PROPUESTO P3
/*Definir una variable inmutable con el valor 50 que representa el lado de un cuadrado, en otras dos variables inmutables almacenar la superficie y el perímetro del cuadrado.
Mostrar la superficie y el perímetro por la Consola.*/
fun main(argumento: Array<String>){
    val lado = 50
    val perimetro = lado * 4
    val superficie = lado * lado
    print("El perímetro de un cuadrado de lado $lado es $perimetro y su superficie es $superficie")
}