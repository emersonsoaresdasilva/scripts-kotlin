// Declarando a classe Animal
open class Animal() {

// Declarando uma propriedade com a denominação OPEN, quem poderá ser herdada
open var colour: String = "White"
}

// Criando a classe DOG que herda da classe Animal
class Dog: Animal() {
    override var colour: String = "Black"   // Sobrescrevendo a variável
    fun sound() {
        println("Dog makes a sound of woof woof")
    }
}

fun main(){
    var animal:Dog = Dog()
    animal.sound()
}