import java.util.*

class Atividade2 {
    fun atividade2() {

        var Valor = 0.0
        var opcaoPagamento = 0
        var numeroParcelas = 0
        val scanner = Scanner(System.`in`)
        print("Digite o valor do produto: R$")
        Valor = scanner.nextDouble();
        println("Escolha o método de pagamento")
        println("1 - à vista")
        println("2 - à prazo (30 dias)")
        println("3 - à prazo parcelado")
        opcaoPagamento = scanner.nextInt()

        when (opcaoPagamento) {
            1 -> {
                var valorFinal = Valor / 0.9
                println("Valor final é de R$" + valorFinal)
            }
            2 -> {
                var valorFinal = Valor + (Valor * 0.03)
                println("Valor final é de R$" + valorFinal)
            }
            3 -> {
                println("Digite o número de parcelas")
                numeroParcelas = scanner.nextInt();
                var valorFinal = Valor + ((Valor * 0.015) * numeroParcelas)
                println("Valor final é de R$"  + valorFinal)
            }


        }

    }
}