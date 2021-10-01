// Exemplo de classe em Kotlin e de construtores
class Carro1(){     
    // Atributos da Classe
    private var modelo: String = ""
    private var ano: Int = 1900
    private var velocidade: Int = 0
    
    fun setModelo(modelo:String){
        this.modelo = modelo
    }
  
    fun setAno(ano: Int){
        this.ano = ano
    }
    
    fun setVelocidade(velocidade: Int){
        this.velocidade = velocidade
    }
    
    //Metodos de acesso (get)
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
    var c0: Carro1 = Carro1()    
    var c1: Carro1 = Carro1()
    var c2: Carro1 = Carro1()
     
    c0.setModelo("Fusca")
    c0.setAno(1993)
    c0.setVelocidade(20)
    
    c1.setModelo("BMW")
    c1.setAno(2020)
    c1.setVelocidade(300)
    
    c2.setModelo("Ferrari")
    c2.setAno(2021)
    c2.setVelocidade(350)

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