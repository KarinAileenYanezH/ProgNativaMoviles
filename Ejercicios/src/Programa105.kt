fun cargar(arreglo: IntArray) {
    for(i in arreglo.indices) {
        print("Ingrese elemento:")
        arreglo[i] = readLine()!!.toInt()
    }
}
fun imprimirArr(arreglo: IntArray) {
    for(elemento in arreglo)
        println(elemento)
}
fun main(parametro: Array<String>) {
    val arre = IntArray(5)
    cargar(arre)
    imprimirArr(arre)
}
