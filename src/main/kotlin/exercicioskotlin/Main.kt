fun main(args: Array<String>) {

    solicitar()

   }

fun solicitar() {

    println("Digite um número a: ")
    var a = readLine()!!.toInt()

    println("Digite um número b: ")
    var b = readLine()!!.toInt()

    var soma = calcular(a,b)

    println("Sua soma é: $soma")

}
fun calcular (a:Int, b: Int): Int {
    return a + b
}



