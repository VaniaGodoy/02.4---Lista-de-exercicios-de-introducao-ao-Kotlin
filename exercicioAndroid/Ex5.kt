package exercicioAndroid

// Funções de alta ordem
fun processaInteiro(i: Int, f: (Int) -> Int): Int {
    return f(i)
}
fun processaInteiros(i: Int, j: Int, f: (Int, Int) -> Int): Int {
    return f(i, j)
}

// Funções
fun soma(i: Int, j: Int): Int {
    return i + j
}
fun multiplica(i: Int, j: Int): Int {
    return i * j
}
fun raizQuadrada(numero: Int): Int {
    for (n in 1..numero) {
        if (n * n == numero)
            return n
    }
    return -1
}

// Main
fun main() {

    // 1. Chamadas do primeiro passo (funções nomeadas)
    println("-- Usando funções nomeadas --")
    println(processaInteiros(10, 20, ::soma))        // 30
    println(processaInteiros(7, 6, ::multiplica))    // 42
    println(processaInteiro(9, ::raizQuadrada))      // 3

    // 2. Chamadas do segundo passo (lambdas equivalentes)
    println("-- Usando lambdas equivalentes --")
    println(processaInteiros(10, 20) { a, b -> a + b }) // 30
    println(processaInteiros(7, 6) { a, b -> a * b })   // 42
    println(processaInteiro(9) { n ->
        var r = -1
        for (x in 1..n) {
            if (x * x == n) {
                r = x
                break
            }
        }
        r
    }) // 3
}