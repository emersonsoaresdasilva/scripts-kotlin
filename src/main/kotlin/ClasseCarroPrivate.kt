// Exemplo de classe em Kotlin e de construtores
class Carro(modelo: String, ano: Int, velocidade: Int){
     
    // Atributos da classe
    private var modelo: String = ""
    private var ano: Int = 1900
    private var velocidade: Int = 0
        
    // Realizando a inicialização das variáveis no construtor da classe
    init{
        this.modelo = modelo
        this.ano = ano
        this.velocidade = velocidade
    }
    
    // Métodos de acesso (get)
    fun getModelo(): String{
        return modelo
    }
    
    fun getAno(): Int{
        return ano
    }
    
    fun getVelocidade(): Int{
        return velocidade
    }
}

fun main(){    
    var c0: Carro = Carro("Fusca", 1993, 20)
    var c1: Carro = Carro("BMW", 2018, 200)
	var c2: Carro = Carro("Ferrari", 2021, 260)
      
    println("Valores atribuídos para o objeto c0 foram:")
    println(c0.getModelo())
    println(c0.getAno())
    println(c0.getVelocidade())
    
    println("Valores atribuídos para o objeto c1 foram:")
    println(c1.getModelo())
    println(c1.getAno())
    println(c1.getVelocidade())
    
    println("Valores atribuídos para o objeto c2 foram:")
    println(c2.getModelo())
    println(c2.getAno())
    println(c2.getVelocidade())
    
    if(c0.getAno()<2000 || c1.getAno()<2000 || c2.getAno()<2000){
		println("Você precisa realizar a venda de um ou mais veículos, por serem inferiores ao ano 2000")
    }
}