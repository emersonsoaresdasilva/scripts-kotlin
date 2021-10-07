// Criando a interface Autenticável
interface Autenticavel { 
    val password: String
}

// Criando a classe Usuário que implementa a interface Autenticável
class Usuario : Autenticavel {
    override val password: String = "123" // Sobrescrevendo a variável password definida na interface Autenticável
}

fun main(){
    val user = Usuario()
    println(user.password)
}