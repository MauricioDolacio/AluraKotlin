package main.kotlin

fun main() {
    val nomes: Iterable<String> = setOf( //tipo mais generico
        "Alex",
        "Fran",
        "Gui",
        "Maria",
        "Ana"
    )
    for (nome in nomes.iterator()) {
        println(nome)
    }
    println(nomes)
    println("Tem o nome Alex? ${nomes.contains("Alex")}")
}
