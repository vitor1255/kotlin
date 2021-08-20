package src

 class Gerente(
     nome: String,
     cpf: String,
     salary: Double,
     val senha: String
 )
    :Funcionario(nome = nome, cpf = cpf, salary = salary), Logavel {
    override fun calculoAuxilio(): Double = salary * 0.4
     override fun login(): Boolean = "123" == senha


 }