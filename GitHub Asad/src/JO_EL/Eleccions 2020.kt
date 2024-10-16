package JO_EL

import java.util.Scanner

fun main(){
    val lector : Scanner = Scanner(System.`in`)
    val num1 = lector.nextInt()
    val num2 = lector.nextInt()
    val num3 = lector.nextInt()

    when {
        num1 > num2 && num1 > num3 -> {
            print("Jiden")
        }

        num2 > num1 && num2 > num3 -> {
            print("Drump")
        }

        num3 > num1 && num3 > num2 -> {
            print("Banders")
        }
    }


}