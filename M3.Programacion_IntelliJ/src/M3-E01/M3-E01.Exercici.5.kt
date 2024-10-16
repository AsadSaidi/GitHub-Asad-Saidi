package `M3-E01`

// @author: Asad Saidi
fun main() {
    //Algoritme que demana les dades d'una piscina i mostra el volum en metres cúbics i en litres d'aigua.
    println("CALCULADORA DE PISICNAS:")

    println("Inserta la longitud de la piscina:")
    var longitud : Int = readln().toInt()

    println("Inserta la amplitud de la piscina:")
    var amplitud : Int = readln().toInt()

    println("Inserta la profunditat de la piscina:")
    var profunditat : Int = readln().toInt()

   println("El volum es : ${longitud * amplitud * profunditat}")

}