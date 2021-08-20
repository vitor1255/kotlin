package src.DigiBank

import src.Analista
import src.Funcionario

fun main() {
    val vitor = Analista(nome = "Toni do bar", cpf = "111.222.333-44", salary = 1920.00)

    imprimeRelatorio(vitor)
}
    fun imprimeRelatorio(funcionario: Funcionario) = println(funcionario.toString())


