package `M3-E01`

// @author: Asad Saidi
fun main(){
    //Algoritme que demana dos números i mostra el resultat de la suma, la resta, la multiplicació i la divisió d'ells dos.
    println("Escribe dos números de los cuales quieras saber sus operaciones:")
    val numUno = readln().toInt()
    val numDos = readln().toInt()

    println("OPERACIONS:")
    println("SUMA: $numUno + $numDos = ${numUno + numDos}")
    println("RESTA: $numUno - $numDos = ${numUno - numDos}")
    println("MULTIPLICACION: $numUno x $numDos = ${numUno * numDos}")
    println("DIVISION: $numUno : $numDos = ${numUno / numDos}")

}