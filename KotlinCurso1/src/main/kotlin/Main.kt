fun main() {
    println("Bem vindo ao Bytebank")

    for (i in 5 downTo 1 step 2) {

        val titular: String = "Mauricio"
        val numeroConta: Int = 1000 + i
        var saldo = i + 10.0

        println("titular: $titular")
        println("numero da conta: $numeroConta")
        println("saldo da conta: $saldo")
        println()
    }

    //testaCondicoes(saldo)
}


fun testaCondicoes(saldo: Double) {
    when {
        saldo > 0.0 -> println("conta é positiva")
        saldo == 0.0 -> println("conta é neutra")
        else -> println("conta é negativa")
    }
}
