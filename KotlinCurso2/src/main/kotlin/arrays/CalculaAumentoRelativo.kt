package main.kotlin.arrays

import java.math.BigDecimal
import java.math.RoundingMode

fun calculaAumentoRelativo(salario: BigDecimal, aumento: BigDecimal)
        : BigDecimal =
    if (salario < "5000".toBigDecimal()) {
        salario + "500".toBigDecimal()
    } else {
        (salario * aumento).setScale(2, RoundingMode.UP)
    }
