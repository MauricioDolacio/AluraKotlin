fun testaComportamentosConta() {
    val contaAlex = ContaCorrente(titular = "Alex", numero = 1000)
    val contaFran = ContaPoupanca(titular = "Fran", numero = 1001)

    contaAlex.deposita(50.0)
    println("${contaAlex.saldo}")

    contaAlex.saca(20.0)
    println("${contaAlex.saldo}")

    contaFran.deposita(100.00)

    contaFran.transfere(50.0, contaAlex)
    println("conta fran ${contaFran.saldo}")
    println("conta alex ${contaAlex.saldo}")
}
