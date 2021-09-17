open class Pessoa(nome: String, idade: Int){
    val nome: String
    val idade: Int
    
    init{
        this.nome = nome
        this.idade = idade
    }
    
    open fun adicionarDesconto(desconto: Int){
        println("Desconto para a pessoa de $desconto")
    }

    override fun toString(): String{
        return "Pessoa: $nome\nIdade: $idade"
    }
}

class Aluno(nome: String, idade: Int): Pessoa(nome, idade){
    override fun adicionarDesconto(desconto: Int){
        println("Desconto para o aluno $nome é de R$$desconto")
    }
}

fun main(){
    val aluno = Aluno("Fabio", 28)
    println("Aluno: ${aluno.nome}\nIdade: ${aluno.idade}")
    aluno.adicionarDesconto(10)
}