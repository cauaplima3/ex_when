class Atividade1 {
    fun atividade1() {

        val Obitos = 16520
        val Nascimentos = 19529
        val Habitantes = 1492530


        val natalidade = (Nascimentos * 1000) / Habitantes
        val mortalidade = (Obitos * 1000) / Habitantes
        val opcao = 1
        when (opcao) {
            1 -> {
                println("A taixa de mortalidade foi :" + mortalidade + "%")
            }
            2 -> {
                println("A taixa de natalidade foi :" + natalidade + "%")
            }
            else -> {
                println("opcao inexistente")
            }
        }

    }
}