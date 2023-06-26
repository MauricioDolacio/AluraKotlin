package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaComportamentosConta() {

    val alex = Cliente(nome = "Alex", cpf = "", senha = 1)
    val contaAlex = ContaCorrente(titular = alex, numero = 1000)

    val fran = Cliente(nome = "Fran", cpf = "", senha = 2)
    val contaFran = ContaPoupanca(titular = fran, numero = 1001)

    contaAlex.deposita(50.0)
    println("${contaAlex.saldo}")

    contaAlex.saca(20.0)
    println("${contaAlex.saldo}")

    contaFran.deposita(100.00)

    contaFran.transfere(50.0, contaAlex)
    println("conta fran ${contaFran.saldo}")
    println("conta alex ${contaAlex.saldo}")
}
