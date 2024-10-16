package `M3-E04-ExercicisScanner`

import java.util.Scanner

/**
 * @author: Asad Saidi
 */

fun main() {

    val opcion : Scanner
    val valor : Int
    println("MENU: " +
            "Que quieres hacer?" +
            "\n\t1. Cual es mi signo zodiaco?" +
            "\n\t2. Propiedades de los triangulos" +
            "\n\t3. Numeros primers" +
            "\n\t4. Divisores de un numero" +
            "\n\t5. Cuanta suerte tengo?")
    opcion = Scanner(System.`in`)
    valor = opcion.nextInt()



    do {
        when(valor) {
            1  -> {
                println("MI SIGNO ZODIACO")


                    print("Cual es tu dia de nacimiento? ")
                    var dia: Int
                    dia = opcion.nextInt()

                    if (dia >= 1 && dia <= 31) {
                        println("$dia / ?? / ????")

                        do {
                            println("\nEn que mes naciste?")
                            var mes: Int
                            mes = opcion.nextInt()
                        } while (mes < 1 || mes > 12)
                    } else {

                    }

            }


            }
    }while(valor <= 5 && valor >= 1)
}