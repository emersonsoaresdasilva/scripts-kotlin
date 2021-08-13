fun main() {       
	var n1: Double = 5.5
    var n2: Double = 4.5
    var media: Double = (n1 + n2) / 2

    if(media > 6){
        println("Aprovado!")
    }
    else{
        var n3 = 10
        media = (media+n3)/2
        if(media > 6){
            println("Aprovado!")
        }
        else{
            println("Reprovado")
        }
    }
}