package `M3-E02`

fun main() {
    //Algoritme que demana una nota entre 0 i 10, i mostra si és un suspès (0-4), un suficient (5), un bé (6), un notable (7-8) o un excel·lent (9-10).
    do {
        print("Dame la nota que has conseguido: ")
        var nota: Float = readln().toFloat()
        if (nota >= 0 && nota <= 10){
            if (nota < 5 && nota > 0)
                println("Has suspendido el examen inutil :(")
            if (nota < 5 && nota < 6)
                println("Tienes un suficiente en el examen :/")
            if (nota >= 6 && nota < 7)
                println("Tienes un bien en el examen :|")
            if (nota >= 7 && nota <= 8)
                println("Tienes un notable en el examen :)")
            if (nota >= 9 && nota <= 10)
                println("Tienes un excelente en el examen!! :)")
        }
        else println("ERROR.Vuelve a porbar")


    }while (nota < 0 || nota > 10)

}