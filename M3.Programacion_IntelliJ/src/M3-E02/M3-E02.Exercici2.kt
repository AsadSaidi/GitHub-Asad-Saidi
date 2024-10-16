package `M3-E02`

fun main() {
    //Algoritme que demana un número entre 0 i 10, i dona error si és menor de 0 o major de 10.


    do {
        print("Dame un numero del 1 al 10:")
        var num: Int = readln().toInt()
        if (num >= 0 && num <= 10)
            println("Gracies :)")
        else println("ERROR.Torna a probar.")

    }while (num < 0 || num > 10)

}