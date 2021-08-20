package src.DigiBank

import src.Funcionario

class ImprimeRelatorio {
    companion object{
        fun imprime(functionaries: Funcionario) {
            println(
                functionaries.toString()
            )
        }
    }
}