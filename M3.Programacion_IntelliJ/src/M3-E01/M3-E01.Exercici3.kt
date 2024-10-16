package `M3-E01`

// @author: Asad Saidi
fun main() {
    //Algoritme que demana una distància en metres i mostra per pantalla la conversió a milles marines.

    val MENU: String = "\t1. Metros a millas" +
                        "\n \t2. Millas a metros"
    val subMenu1 : String = "Introduzca el numero de metros que quieres covertir:"
    val subMenu2 : String = "Introduzca el numero de millas marinas que quieres covertir:"
    var valorEntrada : Float
    var valorSortida : Float
    var respuesta : Int = 0


    println("CONVERSOR DE METROS A MILLAS MARINAS:")

    do {
        println("Que quieres convertir? ")
        println(MENU)
        respuesta = readln().toInt()

        if (respuesta < 1 || respuesta > 2)
            println("ERROR: Valor no acceptat")


    }while((respuesta < 1) || (respuesta > 2))
    // || = or
    //  }while ((respuesta ! = 1) && (respuesta ! = 2)). != negacion (ejemplo: != -> no igual)  &&= y/and

    when(respuesta) {
        1 -> {
            println(subMenu1)
            valorEntrada = readln().toFloat()
            valorSortida = valorEntrada * 0.00053996f
            println("$valorEntrada metros es igual a $valorSortida millas marinas")
        }
        2 -> {
            println(subMenu2)
            valorEntrada = readln().toFloat()
            valorSortida = valorEntrada * 1852
            println("$valorEntrada millas marinas es igual a $valorSortida metros")
        }
    }
}