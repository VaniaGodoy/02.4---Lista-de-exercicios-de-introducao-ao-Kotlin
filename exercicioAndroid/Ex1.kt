package exercicioAndroid

fun main() {

    // Exercício 1 - Lista de Cursos
    val listaCursos: MutableList<String> = mutableListOf(
        "Sistemas para Dispositivos Móveis",
        "Análise e Desenvolvimento de Sistemas")

    // adicionando cursos na Lista
    listaCursos.add("Técnico em Informática para Internet")
    listaCursos.add("Manutenção de Aeronaves")
    listaCursos.add("Técnico em Células")
    listaCursos.add("Processos Gerenciais")

    // filtra apenas os cursos que tenha a palavra "Sistemas"
    val listaSistemas = listaCursos.filter { it.contains("Sistemas") }

    // imprime com índice
    listaSistemas.forEachIndexed { index, curso ->
        println("$index - $curso")
    }
}
