class Curso(){
    // Atributos da Classe
    public var nome: String = ""
    public var turma: String = ""
    public var predio: String = ""
}

fun main(){
    var c1: Curso = Curso()
    c1.nome = "Veterinário"
    c1.turma = "Zebra"
    c1.predio = "Zoológico"

    println(c1.nome)
    println(c1.turma)
    println(c1.predio)
}