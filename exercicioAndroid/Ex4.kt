package exercicioAndroid

fun main() {
    // Exercício 4 - Função Genérica

    // Função soma de dois inteiros
    fun soma(a: Int, b: Int): Int = a + b

    // Função concatenação de duas Strings
    fun cat(a: String, b: String): String = a + b

    // Função genérica que recebe uma operação
    fun <T> xpto(a: T, b: T, op: (T, T) -> T): T = op(a, b)

    //Imprime as funções
    println(xpto(2, 3, ::soma))     // saída: 5
    println(xpto("Jo", "ão", ::cat)) // saída: João
}