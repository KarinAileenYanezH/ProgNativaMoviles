fun main(parametros: Array<String>) {
    var cant = 0
    print("Cuantos valores ingresará para analizar:")
    val cantidad = readLine()!!.toInt()
    for(i in 1..cantidad) {
        print("Ingrese valor:")
        val valor = readLine()!!.toInt()
        if (valor % 2 ==0)
            cant++
    }
    println("Cantidad de pares: $cant")
}