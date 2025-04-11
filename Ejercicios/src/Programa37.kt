//PROBLEMA PROPUESTO 37
/*En una empresa trabajan n empleados cuyos sueldos oscilan entre $100 y $500, realizar un programa que lea los
sueldos que cobra cada empleado e informe cuántos empleados cobran entre $100 y $300 y cuántos cobran más de $300.
Además el programa deberá informar el importe que gasta la empresa en sueldos al personal.*/
fun main(parametro: Array<String>) {
    print("Cuantos empleados tiene la empresa:")
    val n = readln().toInt()
    var x = 1
    var conta1 = 0
    var conta2 = 0
    var gastos = 0.0
    while (x <= n) {
        print("Ingrese el sueldo del empleado:")
        val sueldo = readln().toDouble()
        if (sueldo <= 300)
            conta1 = conta1 + 1
        else
            conta2 = conta2 + 1
        gastos = gastos + sueldo;
        x = x + 1
    }
    println("Cantidad de empleados con sueldos entre 100 y 300: $conta1")
    println("Cantidad de empleados con sueldos mayor a 300: $conta2")
    System.out.print("Gastos total de la empresa en sueldos: $gastos")
}
