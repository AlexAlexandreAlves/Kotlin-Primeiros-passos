fun testaAutenticacao() {

    val gerente = Gerente(
        nome = "Alex",
        cpf = "111.111.111-11",
        salario = 1000.0,
        senha = 1234
    )
    val diretora = Diretor(
        nome = "Fran",
        cpf = "111.111.111-11",
        salario = 1000.0,
        senha = 1234,
        plr = 200.0
    )

    val cliente = Cliente(
        nome = "Gui",
        cpf = "222.222.222-00",
        senha = 4567

    )

    val sistema = SistemaInterno()
    sistema.entra(gerente, 1000)
    sistema.entra(diretora, 2000)
//    sistema.entra(cliente, 4567)
}