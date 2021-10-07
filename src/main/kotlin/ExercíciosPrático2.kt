// Crie uma variável global que indique o percentual de reajuste de um determinado produto,
// que deve ser calculado a partir do método main definido  na função.
// Calcule o novo salário e exiba-o em console. 
var reajuste = 3.0
fun main(){
    var salario = 1000.00
    reajuste = salario + ((salario * reajuste) / 100)
    println("O novo salário é R$${reajuste}")
}

// A classe Aluno possuí os atributos id, nome e curso.
// Receba todos os parâmetros no método construtor e exiba-os em console, sem a utilização de  métodos estáticos. 
class Aluno {
    var nome: String
    var id: Int
    var curso: String

    constructor(nome: String, id: Int, curso: String) {
        this.nome = nome
        this.id = id
        this.curso = curso
    }
}

fun main(){
    var aluno = Aluno("Igor", 15, "Python para Processamento de Linguagem Natural - PLN")
    println("ID: ${aluno.id}\nNome: ${aluno.nome}\nCurso: ${aluno.curso}")
}

// A classe Aluno possui os atributos id, nome e curso.
// Receba todos os  parâmetros no método construtor e exiba-os em console.
// Adicione um companion Object com a mensagem chamando método estático, que deve ser acessado sem realizar a instância direta da classe. 
class Aluno {
    var nome: String
    var id: Int
    var curso: String

    constructor(nome: String, id: Int, curso: String) {
        this.nome = nome
        this.id = id
        this.curso = curso
    }
    companion object Teste {
        fun Chamada(nome: String, id: Int, curso: String) = println("ID: $id\nNome: $nome\nCurso: $curso")
    }
}

fun main(){
    Aluno.Chamada("Emerson", 30, "Python para Processamento de Linguagem Natural - PLN")
}

// Crie uma expressão lambda que realiza a divisão de 2 valores e exiba os  resultados em console.
val dividir = {n1: Int, n2: Int -> n1.toDouble() / n2.toDouble()}

fun main(){
    print(dividir(5, 2))
}

// Inicialize a classe Carro modelo do tipo de dado String, ano do tipo de dado inteiro e velocidade do tipo de dado inteiro.
// Na classe Carro, o atributo ano deve ser iniciado com o valor 1900.
// Na função main, crie 3 instâncias da classe Carro, nomeadas como c0, c1 e c2.
// Inicialize o atributo ano de c2 com o valor 2020.
// Em seguida, exiba o ano do carro acessado por meio do objeto c1 e o ano do carro acessado por meio do objeto c2. 
class Carro(modelo: String, ano: Int, velocidade: Int){
    var modelo: String = ""
    var ano: Int = 1900
    var velocidade: Int = 0

    init{
        this.modelo = modelo
        this.ano = ano
        this.velocidade = velocidade
    }
}

fun main(){    
    var c0: Carro = Carro("Fusca", 1993, 20)
    var c1: Carro = Carro("EcoSport", 2016, 200)
	var c2: Carro = Carro("Porsche", 2020, 260)

    println("O ano do carro um é: ${c1.ano}")
    println("O ano do carro dois é: ${c2.ano}")
}

// Cria uma classe chamada Aluno com os atributos ID do aluno, nome do aluno e semestre.
// Passe 10 notas por meio da utilização de um ArrayList inicializadas no método construtor
// e imprima cada um dos valores em console a partir de uma nova função.
class Aluno(id: Int, nome: String, semestre: Int){
    val notas = arrayListOf<Double>()
    init {
   		this.notas.add(10.0)
        this.notas.add(9.0)
        this.notas.add(8.0)
        this.notas.add(7.0)
        this.notas.add(6.0)
        this.notas.add(5.0)
        this.notas.add(4.0)
        this.notas.add(3.0)
        this.notas.add(2.0)
        this.notas.add(1.0)

    	exibeNotas(notas, id, nome, semestre)
    }
    fun <T> exibeNotas(notas: ArrayList<T>, id:Int, nome:String, semestre:Int){
        println("ID: ${id}\nNome: ${nome}\nSemestre: ${semestre}º Semestre\nNotas do aluno ↓\n")
        for (nota in notas){
            println(nota)
        }
    }
}

fun main() {
    Aluno(1, "Emerson", 4)
}

// Crie três classes chamadas, Aluno, Turma e Professor.
// Na função main, crie  um atributo chamado obj instanciando uma das classes, valide se o atributo é do tipo da Classe Aluno, Turma ou Professor
// e exiba em console o tipo de dado que ele pertence.
class Aluno(){}
class Turma(){}
class Professor(){}
 
fun main(){
    var obj: Any? = null
    obj = Aluno()
    println("O atributo é do tipo: ${obj.javaClass.name}")
}

// Com base na resolução do exercício 4, se o atributo informado for do tipo  Aluno, instancie o objeto com o tipo da Classe Turma.
// Ao final, apresente o último  tipo do objeto instanciado.
class Aluno(){}
class Turma(){}
class Professor(){}

fun main(){
    var obj: Any? = null
    obj = Aluno()
    if (obj is Aluno){
    	obj = Turma()
    }
    println("Último tipo: ${obj.javaClass.name}")
}