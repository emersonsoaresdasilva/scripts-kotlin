class Turma(idTurma: Int, nomeTurma: String, quantidadeAlunos: Int){
    val idTurma: Int
    val nomeTurma: String
    val quantidadeAlunos: Int
    
    init{
    	this.idTurma = idTurma
    	this.nomeTurma = nomeTurma
    	this.quantidadeAlunos = quantidadeAlunos
    }
	override fun toString(): String{
    	return "ID: $idTurma\nNome da turma: $nomeTurma\nQuantidade de alunos: $quantidadeAlunos"
	}
}

fun main(args: Array<String>){
    val turma = Turma(1, "ADS/SI", 55)
    println(turma)
}