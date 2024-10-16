package `M3-E01`

/**
 * @author Asad
 */

fun main () {
    //Algoritme que demana les dades d'una piscina i mostra el volum en metres cúbics i en litres d'aigua.
    println("CALCULADORA DE PISCINAS:")

    println("Inserta la longitud de la piscina:")
    var longitud : Int = readln().toInt()

    println("Inserta la amplitud de la piscina:")
    var amplitud : Int = readln().toInt()

    println("Inserta la profundidad de la piscina:")
    var profunditat : Int = readln().toInt()

    var volumen : Int = longitud * amplitud * profunditat
    println("El volumen es de: $volumen metros cubicos")
    println("La cantidad en litros es de ${volumen * 1000}")

}
