class AlunoDois {
    var nome:String;
    var id:Int;
    var curso:String;

    constructor(nome: String, id: Int, curso: String) {
        this.nome = nome
        this.id = id
        this.curso = curso
    }

    companion object Teste {
        fun Chamada(nome: String, id: Int, curso: String) = println("O nome é $nome, o id é $id e o curso é$curso")
    }
}

fun main(){
    AlunoDois.Chamada("Pedro", 50, "Kotlin")
}