package `M3-E01`

// @author: Asad Saidi
// TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //Algoritme d'una aplicació que demana un número i mostra per pantalla els números anterior i posterior a aquest.
    val num: Int
    println("Escribe un número cualquiera: ")
    num = readln().toInt()

    println("El número posterior es " + (num + 1) + ". El número anterior es " + (num - 1))
}
    // o println("Escribe ... ${num+1}")