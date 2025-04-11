fun calcularSuperficieCuadrado(lado: Int) = lado * lado

fun main(parametro: Array<String>) {
    print("Ingrese el valor del lado del cuadrado:")
    val la = readLine()!!.toInt()
    println("La superficie del cuadrado es ${calcularSuperficieCuadrado(la)}")
}
