//PROBLEMA PROPUESTO P22
/*Un postulante a un empleo, realiza un test de capacitación, se obtuvo la siguiente información: cantidad total de preguntas que se
le realizaron y la cantidad de preguntas que contestó correctamente. Se pide confeccionar un programa que ingrese los dos datos por
teclado e informe el nivel del mismo según el porcentaje de respuestas correctas que ha obtenido, y sabiendo que:

	Nivel máximo:	Porcentaje>=90%.
	Nivel medio:	Porcentaje>=75% y <90%.
	Nivel regular:	Porcentaje>=50% y <75%.
	Fuera de nivel:	Porcentaje<50%.*/
fun main(parametro: Array<String>) {
    print("Ingrese la cantidad total de preguntas del examen:")
    val totalPreguntas = readln().toInt()
    print("Ingrese la cantidad total de preguntas contestadas correctamente:")
    val totalCorrectas = readln().toInt()
    val porcentaje = totalCorrectas * 100 / totalPreguntas;
    if ( porcentaje >= 90)
        println("Nivel máximo")
    else
        if (porcentaje >= 75)
            System.out.print("Nivel medio")
        else
            if ( porcentaje >= 50)
                println("Nivel regular")
            else
                println("Fuera de nivel")
}