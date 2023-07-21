package br.com.alura.bytebank.teste

import br.com.alura.bytebank.exception.FalhaAutenticacaoException
import br.com.alura.bytebank.exception.SaldoInsuficienteException
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

    try {
        contaFran.transfere(30.0, contaAlex, 1)
    } catch (e: SaldoInsuficienteException) {
        println("Falha na transferencia")
        println("Saldo Insuficiente")
        e.printStackTrace()
    } catch (e: FalhaAutenticacaoException) {
        println("Falha na transferencia")
        println("Falha na autenticação")
        e.printStackTrace()
    } catch (e: Exception) {
        println("Erro desconhecido")
        e.printStackTrace()
    }

    println("conta fran ${contaFran.saldo}")
    println("conta alex ${contaAlex.saldo}")
}
