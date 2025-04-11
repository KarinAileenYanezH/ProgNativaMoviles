//PROBLEMA PROPUESTO P4
/*Definir tres variables inmutables y cargar por asignación los pesos de tres personas
con valores Float. Calcular el promedio de pesos de las personas y mostrarlo.*/
fun main(argumento: Array<String>) {
    val peso1 = 89.4f
    val peso2 = 67f
    val peso3 = 87.45f
    val promedio = (peso1 + peso2 + peso3) / 3
    println("El promedio de los tres pesos de personas es $promedio")
}