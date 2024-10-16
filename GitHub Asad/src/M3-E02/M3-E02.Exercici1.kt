package `M3-E02`

//Algoritme que demana l'edat, i mostra missatges diferents en funció de si s'és major d'edat o menor.
fun main() {
do {
    print("Inserta tu edad: ")
    val edat : Int = readln().toInt()
    if (edat > 0)
        if (edat >= 18)
            println("Bienvenido a tu cuenta de banco :)")
        else
            println("No tienes la edad suficiente para tener una cuenta de banco")
    else
        println("ERROR: no puedes tener años negativos")

}while (edat < 0)

    }




