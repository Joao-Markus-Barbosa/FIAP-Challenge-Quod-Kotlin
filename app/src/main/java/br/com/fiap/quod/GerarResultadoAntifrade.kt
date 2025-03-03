package br.com.fiap.quod


fun calcularResultadoCPF(cpf: String): String {
    return try {
        val primeiroDigito = cpf.trim().first().digitToInt()

        when (primeiroDigito) {
            in 0..2 -> "Pontuação: 250"
            in 3..4 -> "Pontuação: 500"
            in 5..6 -> "Pontuação: 750"
            in 7..9 -> "Pontuação: 1000"
            else -> "CPF Inválido"
        }
    } catch (e: Exception) {
        "CPF Inválido. Tente novamente."
    }
}
