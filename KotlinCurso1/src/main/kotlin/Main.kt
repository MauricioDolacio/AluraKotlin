fun main() {
    var contaAlex = Conta(titular = "Alex", numero = 1000)
    var contaFran = Conta(titular = "Fran", numero = 1001)

    contaAlex.deposita(50.0)
    println("${contaAlex.saldo}")

    contaAlex.saca(20.0)
    println("${contaAlex.saldo}")

    contaFran.deposita(100.00)

    contaFran.transfere(50.0, contaAlex)
    println("conta fran ${contaFran.saldo}")
    println("conta alex ${contaAlex.saldo}")
}

class Conta(val titular: String, val numero: Int) {
    var saldo = 0.0
        private set

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    fun saca(valor: Double) {
        if (this.saldo >= valor) {
            saldo -= valor
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (this.saldo >= valor) {
            this.saldo -= valor
            destino.deposita(valor)
            return true
        } else {
            return false
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
