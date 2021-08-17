package src

class Pessoa {
    var nome: String = "Vitor"
    var cpf: String = "111.111.111-20"
    private set

    constructor()

    fun pessoainfo() = "$nome e $cpf"
}

fun main() {
    val vitor = Pessoa()

    println(vitor.pessoainfo())

}