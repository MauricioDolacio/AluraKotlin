fun main() {

    //val idades = IntArray(5)
    //    idades[0] = 25
    //    idades[1] = 19
    //    idades[2] = 33
    //    idades[3] = 20
    //    idades[4] = 55

    val idades = intArrayOf(25, 19, 33, 20, 55, 40)

    var maiorIdade = Int.MIN_VALUE
    for (idade in idades) {
        if (idade > maiorIdade) {
            maiorIdade = idade
        }
    }

    println(maiorIdade)

    var menorIdade = Int.MAX_VALUE
    idades.forEach { idade ->
        if(idade < menorIdade) {
            menorIdade = idade
        }
    }

    println(menorIdade)
}
