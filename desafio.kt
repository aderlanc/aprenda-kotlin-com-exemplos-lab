enum class Nivel{BASICO, INTERMEDIARIO, AVANCADO}

class Usuario(val nome: String)

data class ConteudoEducacional(val nome: String, val duracao: Int)

class Formacao(val nome: String, val nivel:Nivel, var conteudos: List<ConteudoEducacional>) {
    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("Usuário ${usuario.nome} matriculado com sucesso!!!")
    }
    
    fun detalhes() {
        var duracaoTotal = 0
        conteudos.forEach { duracaoTotal += it.duracao }
        println("Formação: $nome, Nível: $nivel, com duração total de $duracaoTotal minutos.")
        println("Conteúdos:")
        conteudos.forEach { println("  -> ${it.nome} - ${it.duracao} minutos") }
        println("")
    }
}

fun main() {
    val usuario1 = Usuario("Aderlan")
    val usuario2 = Usuario("Miguel")

    val conteudo1 = ConteudoEducacional("Introdução ao Kotlin", duracao = 30)
    val conteudo2 = ConteudoEducacional("Kotlin Avançado", duracao = 120)

    val nivel = Nivel.BASICO
    
    val formacao = Formacao("Kotlin para backend", nivel, listOf(conteudo1, conteudo2))
	
    formacao.detalhes()
    
    formacao.matricular(usuario1)
    formacao.matricular(usuario2)
    
}
