fun main (args: Array<String>){    
    // Tente realizar a operação
    try{
        var int = 10/0
        println(int)
        // Obtenha o erro se houver
    } 
    catch (e: Exception){
        println(e)
    } 
    // Finaliza o tratamento de exceção e sempre será apresentado
    finally{
        println("This block always executes")
    }
}