package poo
open class Conta (var id: Double, var agencia: String, var saldo: Double) : IConta {

    lateinit var conta: String
    lateinit var cliente: Cliente
    var imposto: Double = 0.0

    override fun vincularConta(cliente: Cliente) {
        this.cliente = cliente
    }

    override fun sacar (valor: Double): Double {
        return saldo - valor
    }

    override fun depositar(valor: Double): Double {
        return saldo + valor
    }

    override fun verSaldo() {
        println("Seu saldo atual é: ${saldo}")
    }

    fun imposto() {
        imposto =  0.02 * saldo
        saldo = saldo - imposto
        print("Seu imposto retirado foi de ${imposto} e seu novo saldo é ${saldo}")

    }

}