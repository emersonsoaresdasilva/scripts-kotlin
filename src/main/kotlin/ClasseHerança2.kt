// Definindo uma classe como Open para trabalhar com o relacionamento de herança
open class Pessoa(nome: String, idade: Int) {
    val nome: String
    val idade: Int
    
    // Inicializando as propriedades da classe por meio da utilização do THIS para acesso a referência do objeto
    init {
        this.nome = nome
        this.idade = idade
    }
    
	// Criando o método adicionar desconto. A utilização do OPEN permite que este método seja herdado
    open fun adicionarDesconto(desconto: Int) {
        println("Desconto para a pessoa de $desconto")
    }

    // Trabalhando a formatação do conteúdo do objeto
    override fun toString(): String {
        return "Pessoa: $nome, idade: $idade"
    }
}

// Criando a classe Aluno que herda da Classe Pessoa 
class Aluno(nome: String, idade: Int): Pessoa(nome, idade) {
    
// Sobrescrevendo o método adicionarDesconto da classe Pessoa
    override fun adicionarDesconto(desconto: Int) {
        println("Desconto para o aluno de $desconto")
    }
}

fun main(args: Array<String>) {
    val a1 = Aluno("Fabio", 28)
    println(a1)
    println("Aluno: ${a1.nome}, idade: ${a1.idade}")
    a1.adicionarDesconto(10)
}