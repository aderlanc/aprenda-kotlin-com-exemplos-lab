// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario

data class ConteudoEducacional(vaL nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
    }
}

fun main() {
    TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
}

enum class Nivel{BASICO, INTERMEDIARIO, AVANCADO}

class Usuario(val nome: String)

data class ConteudoEducacional(val nome: String, val duracao: Int)

class Formacao(val nome: String, val nivel:Nivel, var conteudos: List<ConteudoEducacional>) {
    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
}

fun main() {
    val usuario1 = Usuario("Aderlan")
    val usuario2 = Usuario("Miguel")

    val conteudo1 = ConteudoEducacional("Introdução ao Kotlin", duracao = 30)
    val conteudo2 = ConteudoEducacional("Kotlin Avançado", duracao = 120)
    val nivel = Nivel.BASICO
    
    println(nivel)

    val formacao = Formacao("Kotlin para backend", nivel, listOf(conteudo1, conteudo2))
    
    println(formacao)
    
    println("Formação: ${formacao.nome}")

    formacao.matricular(usuario1)
    formacao.matricular(usuario2)

    println("Usuários inscritos na formação ${formacao.nome} de nível $nivel: ${formacao.inscritos}")
}