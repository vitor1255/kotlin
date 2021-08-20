package src

 class Gerente(nome : String,
              cpf : String,
              salary : Double)
    :Funcionario(nome, cpf, salary) {
    override fun calculoAuxilio(): Double = salary * 0.4


}