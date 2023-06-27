package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Endereco
import br.com.alura.bytebank.teste.testaFuncionarios

fun main() {
    val endereco = Endereco(
        logradouro = "Rua vergueiro",
        complemento = "Alura",
        cep = "00000-000"
    )
    val enderecoNovo = Endereco(
        logradouro = "Rua vergueiro",
        complemento = "Alura",
        cep = "00000-000"
    )
    println(endereco)
    println(enderecoNovo)

    println(endereco.equals(enderecoNovo))
}

fun imprime(valor: Any) : Unit{
    println(valor)
}
