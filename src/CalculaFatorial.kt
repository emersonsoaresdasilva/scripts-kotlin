// Inicialize uma variável e realize o cálculo do seu fatorial.

fun main(){
    var fatorial: Int = 1
    var numero: Int = 10
    for (i in 1..numero){
        fatorial *= i
    }
    println("Fatorial de $numero = $fatorial")
}