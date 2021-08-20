package src

class Analista(nome: String, cpf: String, salary: Double) :
    Funcionario(nome, cpf, salary) {
     override fun calculoAuxilio()  = ( salary * 0.10)
 }