enum class Color(val rgb: Int){ 
    RED(0xFF0000),  
    GREEN(0x00FF00),  
    BLUE(0x0000FF)
}

fun main(){
    var c = Color.RED 
    println(c.name) 
    println(c.ordinal)  
    println(c.rgb)
}