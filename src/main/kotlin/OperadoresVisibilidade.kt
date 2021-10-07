// Operadores de visibilidade

// private >> torna o recurso visivel apenas na classe
// public >> torna o recurso visivel para todas as sub-classes e objetos.
// protected >> torna o recurso visivel para todas as sub-classes, mas não para os objetos.
// internal >> Apenas classes deste arquivo podem utilizar esse recurso.  
// O comando open permite que Carro4 se torne uma super classe.

open class Carro5{
    // Atributos da Classe
    private var modelo: String 
    private var ano: Int 
    protected var velocidade: Int
    public var cor : String
    // Construtor
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
    
    // Permite que o método tipoTracao possa ser sobre escrito.
    open fun tipoTracao(): String{
        return "4X2"
    }
}