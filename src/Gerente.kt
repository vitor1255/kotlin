package src

 class Gerente(nome : String,
              cpf : String,
              salary : Double)
    :Funcionario(
    nome = String,
    cpf = String,
    salary = Double) {
    override fun calculoAuxilio(): Double = salary * 0.4


}