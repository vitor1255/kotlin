package src


abstract class Funcionario(
    nome: String,
    cpf: String,
    val salary: Double
) : Pessoa(nome, cpf) {
    protected abstract fun calculoAuxilio(): Double;

    override fun toString(): String = """
        Nome: $nome
        Cpf: $cpf
        Salario: $salary
        Auxilio: ${calculoAuxilio()}
            """.trimIndent()
}