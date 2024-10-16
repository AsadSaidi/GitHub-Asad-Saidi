import java.lang.foreign.SymbolLookup
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var esPrimer : Boolean = true
    var num: Int = 0

    var valorCorrecte : Boolean = false

do {

    print("Introdueix un número enter major que 1: ")
    valorCorrecte = scanner.hasNextInt()

    if (valorCorrecte == false){
        println("ERROR: ha de ser un numero enter")
        scanner.nextLine()
    }else {
        num = scanner.nextInt()
        var primo = true
        for (i in 2..num - 1) {
            if (num % i == 0) {
                esPrimer = false
                println("El $num es divisible per: $i , llavors no es un numero primer.")
            }
        }
    }
}while (valorCorrecte == false)

    //SEGONA PART: TROBAR EL SEGUENT NUMERO PRIMER

        do {
            esPrimer = true
            num = num + 1
            for (i in 2..num - 1) {
                if (num % i == 0) {
                    esPrimer = false
                    println("El $num es divisible per $i , llavors no es un numero primer.")
                }
            }
        }while(esPrimer == false)
        println("El següent numero primer es: $num")
}
