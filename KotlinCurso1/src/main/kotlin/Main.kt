fun main() {
    var contaAlex = Conta()

    contaAlex.deposita(50.0)
    println("${contaAlex.saldo}")

    contaAlex.saca(20.0)
    println("${contaAlex.saldo}")

    contaAlex.saca(40.0)
    println("${contaAlex.saldo}")
}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0

    fun deposita(valor: Double) {
        this.saldo += valor
    }

    fun saca(valor: Double) {
        if(this.saldo >= valor) {
            saldo -= valor
        }
    }
}

fun testaCondicoes(saldo: Double) {
    when {
        saldo > 0.0 -> println("conta é positiva")
        saldo == 0.0 -> println("conta é neutra")
        else -> println("conta é negativa")
    }
}
