class Aluno(id: Int, nome: String, curso:String){
    companion object Factory {
        fun exibir(){
            println("Chamando método estático")
        }
    }
   
    init {
        println("ID: $id \nNome: $nome\nQCurso:$curso")
    }
}

fun main() {
    var obj = Aluno(99, "Fabio Pereira da Silva", "Análise e Desenvolvimento de Sistemas")
    Aluno.exibir()
}