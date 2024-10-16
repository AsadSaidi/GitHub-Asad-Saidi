package `M3-E01`

// @author: Asad Saidi
fun main(){
    //Algoritme que demana un preu en € i el torna en £.

    println("CONVERSOR DE € A £: ")

    println("Inserta el numero de euros que quieres conbvertir: ")
    var numConvertir: Int = readln().toInt()

    println("$numConvertir euros son ${numConvertir * (0.83)} libras")
}