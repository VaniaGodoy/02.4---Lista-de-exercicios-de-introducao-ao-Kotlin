package exercicioAndroid

fun main() {
    // Exercício 3 - Funções de Alta Ordem (foo/bar)

    // Funções simples
    fun soma(i: Int, j: Int) = i + j
    fun cat(i: String, j: String) = "$i$j"

    // Funções de alta ordem
    fun foo(a: Int, b: Int, op: (Int, Int) -> Int) = op(a, b)
    fun bar(a: String, b: String, op: (String, String) -> String) = op(a, b)

    // Chamadas
    println(foo(10, 20, ::soma))    // 30
    println(bar("Ped", "ro", ::cat)) // Pedro
}
