package exercicioskotlin

fun main () {

    println("Digite um número:")
    var n = readLine()!!.toInt()


    var verificacao = Verificacao()
    verificacao.verificar(n)

}


class Verificacao {

    fun verificar (n:Int) {

        if (n % 2 == 0) {
            println("É par")
        }
        else {
            println("É ímpar")
        }
    }

}

