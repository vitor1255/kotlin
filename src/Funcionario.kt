package src

import java.math.BigDecimal

abstract class Funcionario(
    nome: String.Companion,
    cpf: String.Companion,
    val salary: Double.Companion
) : Pessoa(nome, cpf) {
    protected abstract fun calculoAuxilio(): Double;

    override fun toString(): String = """
        Nome: $nome
        Cpf: $cpf
        Salario: $salary
        Auxilio: ${calculoAuxilio()}
            """.trimIndent()
}