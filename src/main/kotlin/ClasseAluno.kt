class Aluno(nome: String, idade: Int){
    val nome: String
    val idade: Int
    init{ 
        /*
         * Método construtor
         * Bloco de inicialização
         */
        this.nome = nome // Acessa a propriedade da Classe Aluno
        this.idade = idade // this é usado para acessar a referência do objeto
    }
    override fun toString(): String { // Sobrescreve o método da classe princiapal e formata o conteúdo do objeto para String
        return "Aluno: $nome, idade: $idade"
    }
}

fun main(){
    val aluno1 = Aluno("Emerson", 20) // Instanciando a Classe Aluno
    println(aluno1)
    println("Aluno: ${aluno1.nome}, idade: ${aluno1.idade}")
}
