class Aluno(id: Int, nome: String){
	val lista = arrayListOf<Double>()
    init {
   		this.lista.add(10.0)
        this.lista.add(9.0)
        this.lista.add(8.0)

    	exibeLista(lista, id, nome)
    }
    fun <T> exibeLista(lista: ArrayList<T>, id:Int, nome:String){
        println("Aluno: $id\nNome: $nome\nNotas ↓")
        for (valor in lista){
            println(valor)
        }
    }
}

fun main() {
    Aluno(1, "Emerson")
}