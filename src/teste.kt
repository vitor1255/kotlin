package src

class teste {
    var nome: String = "Vitor"
    var cpf: String = "111.111.111-20"
    private set

    constructor()

    fun pessoainfo() = "$nome e $cpf"
}

fun main() {
    val vitor = teste()

    println(vitor.pessoainfo())

}