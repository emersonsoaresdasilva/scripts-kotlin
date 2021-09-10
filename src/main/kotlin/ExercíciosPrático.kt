// Inicialize o ano de nascimento e o ano atual. Calcule e mostre a sua idade e  quantos anos terá daqui a 25 anos.
fun exibeIdadeDaqui25Anos(idadeAtual: Int) {
    var idade_25: Int = idadeAtual + 25

    println("Idade atual: $idadeAtual")
    println("Idade após 25 anos: $idade_25")
}

fun main(){
    var anoAtual: Int = 2021
    var anoNascimento: Int = 2001
    var idadeAtual: Int = anoAtual - anoNascimento

    exibeIdadeDaqui25Anos(idadeAtual)
}

// Receba os valores em x e y.
// Efetua a troca de seus valores e mostre seus  conteúdos
fun trocaValores(x: String, y: String){
	var old: String = x
	var x = y
	var y = old
	println("Valor de X é: $x\nValor de Y é: $old")
}

fun main(){
	println("Digite o valor de X:")
    var x: String = readLine()!!
	println("Digite o valor de Y:")
	var y: String = readLine()!!

	trocaValores(x, y)
}

// Receba o valor de um depósito em poupança.
// Calcule e mostre o valor após  1 mês de aplicação sabendo que rende 1,3% a. m.
fun main(){
	println("Digite o valor do depósito:")
	var deposito: Int = readLine()!!.toInt()
	var rendeu: Double = deposito + (deposito * 0.013)
	val rendimento = String.format("%.2f", rendeu)

	println("\nDepósito inicial: $deposito com 1,3% a. m.")
	println("\nDepósito + rendimento: $rendimento")
}

// Inicialize o dia, mês e ano de nascimento e apresente cada uma das as variáveis  em console. Apresente também os valores concatenados no formato  DD/MM/YYYY.
fun exibeDataNascimento(dia: String, mes: String, anoNascimento: String) {
    println("Apresente cada uma das variáveis em console:")
    println(dia)
    println(mes)
    println(anoNascimento)

    println("\nApresente também os valores concatenados no formato DD/MM/YYYY:")
    println("$dia/$mes/$anoNascimento")
}

fun main(){
    var dia: String = "01"
    var mes: String = "08"
    var anoNascimento: String = "2001"

    exibeDataNascimento(dia, mes, anoNascimento)
}

// Inicialize o salário atual, calcule o novo salário acrescido de 20%
fun novoSalario(salarioAtual: Double){
    println("Salário atual: $salarioAtual")
	var novoSalario = salarioAtual + (salarioAtual * 0.20)
    println("Novo salário: $novoSalario")
}

fun main(){
    var salarioAtual: Double = 2000.00
	novoSalario(salarioAtual)
}

//Inicialize 3 variáveis de tipos de dados inteiros, compare se alguma delas é maior do que 1000 ou menor do que 100.
//Exiba qual é a variável que está dentro do range.
fun verificaRange(valor1: Int, valor2: Int, valor3: Int){
	var valores = intArrayOf(valor1, valor2, valor3)
	var indice = 1
	for (valor in valores){
		if (valor in 100..1000){
			println("A variável valor[$indice] = $valor está no range!")}
		else{
			println("A variável valor[$indice] = $valor NÃO está no range!")}
	indice++
	}
}

fun main(){
	var valor1: Int = 99
	var valor2: Int = 100
	var valor3: Int = 1001
	verificaRange(valor1, valor2, valor3)
}

// Inicialize dois valores, calcule e apresente a diferença do maior pelo menor.
fun diferencaValores(a: Int, b: Int){
    println("A: $a\nB: $b\n")

    if(a > b){
        println("A diferença entre o números lidos é ${a - b}")}
    else{
        println("A diferença entre o números lidos é ${b - a}")}
}

fun main(){
	var a: Int = 100
    var b: Int = 1
    diferencaValores(a, b)
}

// Inicialize as notas dos alunos, N1, N2 e N3. Verifique se a média das três é  maior do que 6. Se sim, exiba uma mensagem indicando que o aluno foi  aprovado. Senão Inicialize uma nova nota N4 e verifique se o aluno foi aprovado.
fun mediaNotas(n1: Double, n2: Double, n3: Double){
    var media: Double = (n1 + n2 + n3) / 3
    if(media > 6){
        println("O aluno foi aprovado!")}
    else{
        var n4 = 10
        media = (media + n4) / 3
        if(media > 6){
            println("O aluno foi aprovado!")}
        else{
            println("O aluno foi reprovado!")}
	}
}

fun main(){
    var n1: Double = 6.0
    var n2: Double = 6.0
    var n3: Double = 6.1

    mediaNotas(n1, n2, n3)
}

// Inicialize um vetor de 10 posições e exiba cada um dos elementos em  console.
fun exibeElementos(numeros: IntArray){
    numeros.forEachIndexed({indice, valor -> println("Valor[$indice]: $valor")})
}

fun main() {
    val numeros: IntArray = intArrayOf(10, 20, 30, 40, 50, 60, 70, 80, 90, 100)
    exibeElementos(numeros)
}

// Inicialize um número que conterá o final da iteração.
// Apresente em console  todos os valores de 1 ao número inicializado que são divisíveis por 5.
fun divisiveisCinco(ultimoDivisivel: Int){
    for(numero in 1..ultimoDivisivel){
        if(numero % 5 == 0){
            println(numero)}
    }
}

fun main(){
    val ultimoDivisivel: Int = 1005
    divisiveisCinco(ultimoDivisivel)
}

// Calcule e mostre a soma dos números pares e quantidade de números  ímpares entre 1 e 800.
fun main(){
    var somaPares: Int = 0
    var quantidadeImpares: Int = 0
    for(valor in 1..800){
        if(valor % 2 == 0){
            somaPares += 1}
        else{
            quantidadeImpares += 1}
    }
    println("Soma dos números pares de 1...800: $somaPares")
    println("Quantidade de números ímpares: $quantidadeImpares")
}

// Calcule e mostre o quadrado dos números entre 40 e 200 dos números  inteiros pares.
fun main(){
    for (valor in 40..200){
        if (valor % 2 == 0){
            var quadrado = valor * valor
            println("$valor² = $quadrado")
        }
    }
}
/* Inicialize uma variável contendo o salário atual e outra variável contendo a opção que será acessada no menu.
* Para opção 1 deve ser acrescido 30% no  salário,
* Para opção 2 deve ser acrescido 40% no salário,
* Para opção 3 deve ser  acrescido 50% no salário e
* Para a opção 4 deve ser acrescido 60% no salário.
*/ Exiba o valor reajustado.
fun acrescimoSalario(salarioAtual: Double, opcao: Int){
    var valorReajustado = when (opcao){
    1 -> salarioAtual + (salarioAtual * 0.30)
    2 -> salarioAtual + (salarioAtual * 0.40)
    3 -> salarioAtual + (salarioAtual * 0.50)
    4 -> salarioAtual + (salarioAtual * 0.60)
    else -> "Opção informada errada, tente novamente!"}
    println("Salário com acréscimo: R$ $valorReajustado")
}

fun main(){
	var salarioAtual: Double = 1000.00
    var opcao: Int = 1
    acrescimoSalario(salarioAtual, opcao)
}

// Passe 4 parâmetros nulos para uma função e verifique quais dos valores fornecidos não são nulos, exibindo-os em console.
// Realize 4 chamadas simples a partir da função main, em que uma delas deve conter a especificação do valor para um dado parâmetro.
fun funcao(vararg v: String?){
    for (parameter:String? in v){
    	if (parameter != null)
        	println(parameter)
		else{
			println("Paramêtro nulo!")
		}
    }
}

fun main(){
	print("1º Chamada\n")
	funcao(null, "20", "30", "40")
	print("2º Chamada\n")
	funcao(null, null, "30", "40")
	print("3º Chamada\n")
	funcao(null, null, null, "40")
	print("4º Chamada\n")
	funcao(null, null, null, null)
}

// Analisar funcionamento do código
import java.util.Arrays 
fun main(){  
	// Cria uma Array com números de 1 a 5.
	val nums = arrayOf(1, 2, 3, 4, 5)
	// Exibe o primeiro elemento da Array.
	println(nums.get(0))
	// Altera o primeiro elemento da Array para 0 e exibe a representação de string da Array, exibindo seu estado atual.
	nums.set(0, 0)
	println(Arrays.toString(nums))
	// Adiciona o número 1 na Array
	val nums2 = nums.plus(1)
	// Exibe a representação de string da Array, exibindo seu estado atual após o plus.
	println(Arrays.toString(nums2)) 
	// Realiza um slice do elemento 1 ao 3 na Array, e exibe seus respectivos valores.
	val slice = nums.sliceArray(1..3) 
	println(Arrays.toString(slice)) 
	// Exibe primeiro elemento da Array
	println(nums.first())
	// Exibe último elemento da Array
	println(nums.last())
	// Exibe o índice do elemento na Array
	println(nums.indexOf(5)) 
}