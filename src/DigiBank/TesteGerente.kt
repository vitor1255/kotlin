package src.DigiBank

import src.Gerente

fun main() {
     val Toni = Gerente(nome = "Toni do Ovo", cpf = "111.222.333-44", salary = 19200.00, senha = "123")

ImprimeRelatorio.imprime(Toni)

     TesteAutenticacao().autentica(Toni)
}
