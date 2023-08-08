fun MaiorIdade() {
    //val idades = IntArray(5)
    //    idades[0] = 25
    //    idades[1] = 19
    //    idades[2] = 33
    //    idades[3] = 20
    //    idades[4] = 55

    val idades = intArrayOf(12, 15, 25, 19, 33, 20, 55, 40)

    var maiorIdade = Int.MIN_VALUE
    for (idade in idades) {
        if (idade > maiorIdade) {
            maiorIdade = idade
        }
    }

    println(maiorIdade)

    var menorIdade = Int.MAX_VALUE
    idades.forEach { idade ->
        if (idade < menorIdade) {
            menorIdade = idade
        }
    }

    println(menorIdade)

    val maxIdade = idades.max()
    println("Maior Idade: $maxIdade")

    val minIdade = idades.min()
    println("Menor Idade: $minIdade")

    val media = idades.average()
    println("Média: $media")

    val todosMaiores = idades.all { it >= 18 }
    println("Todos maiores? $todosMaiores")

    val existeMaior = idades.any { it >= 18 }
    println("Algum aluno é maior de idade? $existeMaior")

    val maiores = idades.filter { it >= 18 }
    println("Maiores: $maiores")

    val busca = idades.find { it >= 18 }
    println("Busca: $busca")
}
