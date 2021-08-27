fun parOuImpar(a: Int): String {
return if (a % 2 == 0) "par" else "impar"
    
}

fun main(args: Array<String>) {
    println(parOuImpar(1))
    println(parOuImpar(2))
}