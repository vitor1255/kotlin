package src

import java.math.BigDecimal

abstract class Funcionario(
      nome: String,
      cpf: String,
    val salary: BigDecimal
) : Pessoa(nome, cpf) {
}