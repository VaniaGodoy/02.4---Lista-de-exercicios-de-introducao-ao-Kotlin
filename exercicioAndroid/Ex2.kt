package exercicioAndroid

fun main() {
    // Exercício 2 - Map da Família
    val familiaMap: MutableMap<String, String> = mutableMapOf(
        Pair("Pai", "Pedro"),
        Pair("Mãe", "Marcela"),
        Pair("Filho", "João"),
        Pair("Caçula", "Cadu"),
        Pair("Pet", "Paçoca")
    )

    // percorre chave -> valor
    familiaMap.forEach { (chave, valor) ->
        println("$chave: $valor")
    }
}
