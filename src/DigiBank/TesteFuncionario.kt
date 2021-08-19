package src.DigiBank

import src.Funcionario
import src.Pessoa
import java.math.BigDecimal

fun main() {
    val vitor = Pessoa(nome = "Vitor Mariano", cpf = "111.255.222-25")
    println(vitor.nome)
    println(vitor.cpf)

    val func = Funcionario (nome = "Toni do bar", cpf = "111.222.333-44", salary = BigDecimal.valueOf(val: 200.00)
    println(func.nome)
    print(func.cpf)
    println(func.salary)
}