// Declarando uma classe abstrata
abstract class Employee(val name: String,val experience: Int) {  
    abstract var salary: Double // Declarando uma propriedade abstrata
    abstract fun dateOfBirth(date:String) //declarando um método abstrato

    // Declarando um método concreto
    fun employeeDetails() {
        println("Name of the employee: $name")  
        println("Experience in years: $experience")  
        println("Annual Salary: $salary")
        }
}

// Declarando a classe concreta Engineer que herda da classe Employee
class Engineer(name: String,experience: Int) :  Employee(name,experience) {
    override var salary = 500000.00  //sobrescrevendo a variável salary
    override fun dateOfBirth(date:String){  //sobrescrevendo o método abstrato dateOfBirth
        println("A data de nascimento é: $date")
    }
}

fun main(){
    var eng = Engineer ("Fabio", 12)  //INSTANCIANDO A CLASSE CONCRETA!! JAMAIS INSTANCIE UMA CLASSE ABSTRATA!!!
    eng.dateOfBirth("19/01/1993")
}