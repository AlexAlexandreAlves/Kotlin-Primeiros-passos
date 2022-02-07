fun testaComportamentosConta(): Pair<Conta, Conta> {
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
    return Pair(contaAlex, contaFran)
}
