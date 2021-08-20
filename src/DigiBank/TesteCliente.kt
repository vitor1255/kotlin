package src.DigiBank

import src.Cliente
import src.ClienteTipo

fun main() {
    val tete = Cliente(
        "Teves da Silva",
        "151.645.332-25",
        clienteTipo =  ClienteTipo.PF,
        senha = "123456"
    )

    println(tete)

    TesteAutenticacao().autentica(tete)
}