fun main(args: Array<String>) {

    println("Welcome to Bitebank")

    val contaAlex = Conta("Alex", 1000)
    contaAlex.deposita(200.0)

    val contaFran = Conta("Fran", 1001)
    contaFran.deposita(300.0)

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    //Depósito

    println("Depositando na conta de Alex")
    contaAlex.deposita(50.0)
    println(contaAlex.saldo)

    println("Depositando na conta de Fran")
    contaFran.deposita(70.0)
    println(contaFran.saldo)

    //Saque

    println("Sacando conta do Alex")
    contaAlex.saca(200.0)
    println(contaAlex.saldo)

    if (contaAlex.saldo <= 0) {
        println("Saldo zerado, não será permitido o saque")
    } else {
        println("Você possui saldo em sua conta!")
    }

    println("Sacando conta da Fran")
    contaFran.saca(100.0)
    println(contaFran.saldo)

    if (contaFran.saldo <= 0) {
        println("Saldo zerado, não será permitido o saque")
    } else {
        println("Você possui saldo em sua conta!")
    }
    println("Transferência da conta da Fran para o Alex")
    if (contaFran.transfere(150.0, contaAlex)) {
        println("Transferência concluída")
    } else {
        println("Falha na transferência")
    }
    println(contaAlex.saldo)
    println(contaFran.saldo)

    contaAlex.testaLacos()
    contaFran.testaLacos()

    //Testando Condições

    fun testeCondicoes(saldo: Double) {

        if (saldo > 0.0) {
            println("Conta é positiva")
        } else if (saldo == 0.0) {
            println("Conta é neutra")
        } else {
            println("Conta é negativa")
        }

        val numeroX = 10
        var numeroY = numeroX
        numeroY++

        println("numeroX $numeroX")
        println("numeroY $numeroY")

        val contaJoao = Conta("João", 1002)
        contaJoao.titular = "João"
        var contaMaria = Conta("Maria", 1003)
        contaJoao.titular = "João"
        contaMaria.titular = "Maria"

        println("titular conta joão: ${contaJoao.titular}")
        println("titular conta maria: ${contaMaria.titular}")

        println(contaJoao)
        println(contaMaria)

    }
}









