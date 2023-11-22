import java.util.*

fun main(args: Array<String>) {


    var cliente = Cliente ("Ana", "096.893.509.51", "06.03.1995")
    var conta: ContaCorrente = ContaCorrente(1.0, "Bradesco", 2000.0)

    conta.vincularConta(cliente)
    println("O cliente ${conta.cliente.nome} é responsável pela conta ${conta.id}")

    println("Seja Bem vindo(a): ${cliente.nome}")
    println("Sua agência é: ${conta.agencia}")
    println("Seu saldo atual é de: ${conta.saldo}")

    //var novoSaldo = conta.sacar(1000.0)
    //println("Seu novo saldo é: ${novoSaldo}")

    //var novoDeposito = conta.depositar(500.0)
    //println("Seu novo saldo é: ${novoDeposito}")

    conta.imposto()











}






