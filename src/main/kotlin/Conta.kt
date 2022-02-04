class Conta(
    var titular: String,
    val numero: Int

) {
    var saldo = 0.0
        private set

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    fun saca(valor: Double) {
        if (saldo >= valor) {
            saldo -= valor
        }

    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false

    }

    fun testaLacos() {
        var i = 0
        while (i < 5) {
            val titular: String = "Alex $i"
            val numeroConta: Int = 1000 + i

            var saldo = i + 10.0

            println("titular $titular")
            println("numeroConta $numeroConta")
            println("saldo $saldo")
            println()
            i++

            for (i in 5 downTo 1) {

                val titular: String = "Alex $i"
                val numeroConta = 1000 + i
                val saldo = i + 10.0

                println("titular $titular")
                println("numeroConta $numeroConta")
                println("saldo $saldo")
                println()
            }

            when {
                saldo > 0.0 -> println("Conta positiva")
                saldo == 0.0 -> println("Conta é neutra")
                else -> println("Conta é negativa")

            }
        }
    }
}
