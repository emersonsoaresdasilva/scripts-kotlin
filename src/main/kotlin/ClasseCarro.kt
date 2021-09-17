class Carro(modelo: String, ano: Int = 1900, velocidade: Int){
    val modelo: String
	val ano: Int
    val velocidade: Int
    init {
		this.modelo = modelo
        this.ano = ano
        this.velocidade = velocidade
    }
    override fun toString(): String{
        return "Modelo: $modelo\nAno: $ano\nVelocidade: $velocidade km/h\n"
    }
}

fun main() {
    val carro1 = Carro("Fusca", 1935, 110) 
    val carro2 = Carro("Brasilia", 1973, 130)
    val carro3 = Carro("EcoSport", 2015, 220)
    if (carro1.ano < 2000){
        println("Prezado(a) motorista, é necessário realizar a venda do veículo.")}
    println(carro1)
    if (carro2.ano < 2000){
        println("Prezado(a) motorista, é necessário realizar a venda do veículo.")} 
    println(carro2)
    if (carro3.ano < 2000){
        println("Prezado(a) motorista, é necessário realizar a venda do veículo.")}
    println(carro3)
    //println("Modelo: ${carro1.modelo}\nAno: ${carro1.ano}\nVelocidade: ${carro1.velocidade}\n")
    //println("Modelo: ${carro2.modelo}\nAno: ${carro2.ano}\nVelocidade: ${carro2.velocidade}\n")
    //println("Modelo: ${carro3.modelo}\nAno: ${carro3.ano}\nVelocidade: ${carro3.velocidade}\n")
}