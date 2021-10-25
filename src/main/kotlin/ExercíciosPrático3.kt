// Dado o exemplo abaixo, modifique a exceção para que seja considerado como senha fraca um valor menor do que 10 caracteres.
fun test(password: String) {
    if (password.length < 10)
    throw ArithmeticException("Senha Fraca")
    else
    println("Senha Forte")
    }

fun main(args: Array<String>) {  
    test("abcd")
}

// Crie uma nova classe com base no exemplo abaixo chamada Cat e implemente o método definido na classe Animal.
// Apresente valores em console da mesma forma que ocorre na Classe Dog, para a nova classe implementada. 
open class Animal() { 
	open var colour: String = "White"
}
 
class Dog: Animal() {
    override var colour: String = "Black"
    fun sound() {
        println("Dog makes a sound of woof woof")
    }
}
 
class Cat: Animal() {
    override var colour: String = "Black"
    fun sound() {
        println("Cat makes a sound of miau miau")
    }
}
 
fun main(){
    var Animal:Dog = Dog()
    Animal.sound()
    var Animal2:Cat = Cat()
    Animal2.sound()
}

// Dado o exemplo abaixo, realize a implementação de duas classes concretas chamadas Aluno e Professor que devem implementar o método imprimir.
// Apresente os resultados no console.
interface Usuario {
    fun imprimir()
}

class Aluno: Usuario {
    override fun imprimir(){
        println("Implementando uma função no aluno")
    }
}
 
class Professor: Usuario {
    override fun imprimir(){
        println("Implementando uma função no professor")
    }
}
 
class Leitura: Usuario {
    override fun imprimir(){
        println("Implementando uma função na leitura")
    }
}
fun main(){
    var user: Any? = null
    user = Leitura()
    user.imprimir()
    user = Professor()
    user.imprimir()
    user = Aluno()
    user.imprimir()
}

// O conteúdo do atributo deve ser fornecido em funções separadas fora do método construtor.
// O atributo valor deve ter seu conteúdo enviado por meio de uma  função setValor() e exibido na função getValor() a partir da função main.
open class Carro5{
    private var modelo: String
    private var ano: Int
    protected var velocidade: Int
    public var cor : String
    private var valor: Double = 0.0 // O atributo valor deve ser do modificador de acesso private.  
 
    constructor(novoModelo:String, novoAno:Int) {
        println("Iniciando construtor 1 ...")
        this.modelo = novoModelo
        this.ano = novoAno
        this.velocidade = 0    
        this.cor = "Branco"
    }    
 
    fun mudaModelo(novoModelo:String){
        this.modelo = novoModelo
    }
 
    fun escreveModelo(){
        println(this.modelo)
    }
 
    fun escreveAno(){
        println(this.ano)
    }
 
    // O atributo valor deve ter seu conteúdo enviado por meio de uma função setValor()...
    fun setValor(valor: Double){
        this.valor = valor
    }
    
    // e exibido na função getValor()
    fun getValor(): Double{
        return valor
    }
 
    open fun tipoTracao(): String{
        return "4X2"
    }
}
 
class Jeep(modelo:String, ano:Int, angulo:Int): Carro5(modelo,ano) {  
    var anguloDeEntrada: Int= angulo
    override fun tipoTracao(): String{
        return "4X4"
    }
    fun escreveVelocidade(){
        println(velocidade)
    }
}
 
fun main(){  
    var c: Carro5 = Carro5("Onix",2019)
    var j = Jeep("Troller",2013,47)
    println("--------")
    c.escreveModelo()
    c.escreveAno()
    println(c.cor)
    println(c.tipoTracao())
    println("--------")
    j.escreveModelo()
    j.escreveAno()
    j.setValor(100000.00)
    println(j.getValor())
    println(j.tipoTracao())
    println(j.anguloDeEntrada)
}

// Crie um novo método na interface, chamado estudo.
// Implemente em todas classes concretas o novo método, contendo uma simples mensagem e apresente os resultados em console. 
interface Estudo {
    val disciplina: String
}
 
class Hoje: Estudo {
    override val disciplina: String = "Linguagem de Programação Kotlin"
}
 
fun main(){
    val estudo = Hoje()
    println(estudo.disciplina)
}

// Crie uma classe ENUM contendo 4 notas dos alunos durante o semestre letivo.
// Exiba cada uma das propriedades em console. Repare que as notas devem ser inicializadas como Double.
enum class Conceitos(val notas: Double) {
    Aluno1(10.00),
    Aluno2(9.00),
    Aluno3(8.00),
    Aluno4(7.00);
}

fun main() {
    var alunos = Conceitos.values()
	for (nota in alunos) {
      println("$nota: ${nota.notas}")
  }
}