package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.modelo.Funcionario

class Auxiliar(
    nome: String,
    cpf: String,
    salario: Double,
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {
    override val bonificacao: Double
        get() = salario * 0.05
}
