//PROBLEMA PROPUESTO 46
/*En un banco se procesan datos de las cuentas corrientes de sus clientes. De cada cuenta corriente se conoce: número de cuenta y saldo actual.
El ingreso de datos debe finalizar al ingresar un valor negativo en el número de cuenta. Se pide confeccionar un programa que lea los datos de
las cuentas corrientes e informe:
a)De cada cuenta: número de cuenta y estado de la cuenta según su saldo, sabiendo que:
             Estado de la cuenta	'Acreedor' si el saldo es >0.
			'Deudor' si el saldo es <0.
			'Nulo' si el saldo es =0.
b) La suma total de los saldos acreedores.*/
fun main(parametro: Array<String>) {
    var suma = 0.0
    do {
        print("Ingrese número de cuenta:")
        val cuenta = readln().toInt()
        if ( cuenta >= 0) {
            print("Ingrese saldo:")
            val saldo = readln().toDouble()
            if (saldo > 0) {
                println("Saldo Acreedor.")
                suma += saldo
            } else
                if (saldo < 0)
                    println("Saldo Deudor.")
                else
                    println("Saldo Nulo.")
        }
    } while(cuenta>=0)
    println("Total de saldos Acreedores: $suma")
}
