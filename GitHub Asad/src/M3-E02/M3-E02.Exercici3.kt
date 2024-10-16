package `M3-E02`

fun main() {
    //Algoritme que demana una nota entre 0 i 10, i mostra si és un aprovat o un suspès.

    do {
        print("Dame la nota que has conseguido: ")
        var nota: Int = readln().toInt()
        if (nota >= 0 && nota <= 10)
            if (nota < 5)
                println("Has suspendido el examen inutil :(")
            else
                println("Has aprobat l'examen")
        else println("ERROR.Torna a probar.")

    }while (nota < 0 || nota > 10)

}