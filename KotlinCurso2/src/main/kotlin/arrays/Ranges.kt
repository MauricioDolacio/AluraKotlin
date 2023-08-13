package main.kotlin.arrays

fun Ranges() {
    val serie: IntRange = 1.rangeTo(10)
    for (s in serie) {
        print("$s ")
    }
    println()

    val numerosPares = 2..100 step 2
    //2.until(100) step 2 'nao contaria o 100'
    for (numeroPar in numerosPares) {
        print("$numeroPar ")
    }
    println()

    val numerosParesReverso = 100 downTo 0 step 2
    numerosParesReverso.forEach { print("$it ") }
    println()

    val intervalo = 1500.0..5000.0
    val salario = 4000.0
    if (salario in intervalo) {
        println("Esta dentro do intervalo")
    } else {
        println("Não esta dentro do intervalo")
    }

    val alfabeto = 'a'..'z'
    val letra = 'k'
    println(letra in alfabeto)
}