fun main(parametro: Array<String>) {
    val arreglo = IntArray(5)
    for(i in arreglo.indices) {
        print("Ingrese elemento:")
        arreglo[i] = readLine()!!.toInt()
    }
    for(elemento in arreglo)
        println(elemento)
}