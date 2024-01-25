package poo

interface IConta {

    fun sacar (valor: Double): Double
    fun depositar (valor: Double): Double
    fun verSaldo ()
    fun vincularConta(cliente: Cliente)


}