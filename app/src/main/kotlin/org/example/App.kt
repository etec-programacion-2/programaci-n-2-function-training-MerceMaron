/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example

fun main() {
    println("=== Etapa 1: Funciones Básicas ===")
    val promedio1 = calcularPromedio(10.0, 1.0) //se llama a la función calcularPromedio y se le pasan dos parámetros que corresponden a las notas
    println("El promedio es: $promedio1") //se muestra el promedio en pantalla

    val nota = 6.6
    val aprobado = esAprobado(nota) //se llama a la función esAprobado y se le pasa un parámetro que corresponde a la nota
    println("¿Está aprobado? $aprobado") //se muestra si el alumno está aprobado o no (con true or false)

    println("\n=== Etapa 2: Funciones con Múltiples Parámetros ===")
    val promedioTresNotas = calcularPromedioTresNotas(7.0, 8.0, 9.0)
    println("El promedio de las tres notas es: $promedioTresNotas")

    // TODO: Implementar función obtenerEstadoAlumno
    val estado = obtenerEstadoAlumno("Juan", "Pérez", 7.5)
    println(estado)

    println("\n=== Etapa 3: Funciones con Listas ===")
    // TODO: Implementar función calcularPromedioCurso
    val notas = listOf(7.0, 8.0, 6.5, 9.0, 7.5)
    val promedioCurso = calcularPromedioCurso(notas)
    println("El promedio del curso es: $promedioCurso")

    // TODO: Implementar función obtenerAlumnosAprobados
    val nombres = listOf("Ana", "Juan", "María", "Pedro", "Lucía")
    val notasAlumnos = listOf(7.0, 5.0, 8.0, 6.0, 9.0)
    val aprobados = obtenerAlumnosAprobados(nombres, notasAlumnos)
    println("Alumnos aprobados: $aprobados")

    println("\n=== Etapa 4: Funciones Avanzadas ===")
    // TODO: Implementar función generarBoletin
    val materias = listOf("Matemática", "Lengua", "Historia")
    val notasMaterias = listOf(8.0, 7.5, 9.0)
    val boletin = generarBoletin("Juan Pérez", materias, notasMaterias)
    println(boletin)

    // TODO: Implementar funciones de análisis de rendimiento
    println("Estadísticas del curso:")
    println("Promedio: ${calcularPromedioCurso(notas)}")
    println("Nota más alta: ${obtenerNotaMasAlta(notas)}")
    println("Nota más baja: ${obtenerNotaMasBaja(notas)}")
    println("Cantidad de aprobados: ${contarAprobados(notas)}")
}

// TODO: Implementar las siguientes funciones:

// Etapa 1
fun calcularPromedio(nota1: Double, nota2: Double): Double {
    val promedio1: Double = (nota1+nota2)/2 //se suman las dos notas y se divide por 2
    return promedio1
}

fun esAprobado(nota: Double): Boolean {
    if (nota>=6){ //se determina si la nota es mayor o igual a 6 y se devuelve un booleanoS
        return true
    } else {
        return false
    }
}

// Etapa 2
/*
2. Implementa la función `obtenerEstadoAlumno` que recibe nombre, apellido y nota, y retorna un String con el formato: "El alumno [nombre] [apellido] [está aprobado/está desaprobado]"
 */
fun calcularPromedioTresNotas(nota1: Double, nota2: Double, nota3: Double): Double {
    val promedioTres: Double = (nota1 + nota2 + nota3) / 3 //se suman las tres notas y se divide por 3
    return promedioTres
}

fun obtenerEstadoAlumno(nombre: String, apellido: String, nota: Double): String {
    //El alumno [nombre] [apellido] [está aprobado/está desaprobado]
    return ""
}

// Etapa 3
fun calcularPromedioCurso(notas: List<Double>): Double {
    // Implementar aquí
    return 0.0
}

fun obtenerAlumnosAprobados(nombres: List<String>, notas: List<Double>): List<String> {
    // Implementar aquí
    return emptyList()
}

// Etapa 4
fun generarBoletin(nombre: String, materias: List<String>, notas: List<Double>): String {
    // Implementar aquí
    return ""
}

fun obtenerNotaMasAlta(notas: List<Double>): Double {
    // Implementar aquí
    return 0.0
}

fun obtenerNotaMasBaja(notas: List<Double>): Double {
    // Implementar aquí
    return 0.0
}

fun contarAprobados(notas: List<Double>): Int {
    // Implementar aquí
    return 0
}
