package main.kotlin.arrays

import java.math.BigDecimal
import java.math.RoundingMode


fun testaBigDecimals() {
    val salarios = bigDecimalArrayOf("1500.55", "2000.00", "5000.00", "10000.00")

    println(salarios.contentToString())

    val aumento = "1.1".toBigDecimal()
    val salariosComAumento: Array<BigDecimal> = salarios
        .map { salario -> calculaAumentoRelativo(salario, aumento) }
        .toTypedArray()

    println(salariosComAumento.contentToString())

    val gastoInicial = salariosComAumento.somatoria()
    println(gastoInicial)

    val meses = 6.toBigDecimal()
    val gastoTotal = salariosComAumento.fold(gastoInicial) { acumulator, salario ->
        acumulator + (salario * meses).setScale(2, RoundingMode.UP)
    }
    println(gastoTotal)

    val media = salariosComAumento
        .sorted()
        .takeLast(3)
        .toTypedArray()
        .media()
    println(media)

    val mediaMenoresSalarios = salariosComAumento
        .sorted()
        .take(3)
        .toTypedArray()
        .media()

    println(mediaMenoresSalarios)
}