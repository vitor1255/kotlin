package src.DigiBank

import src.Funcionario

class ImprimeRelatorio {
    companion object{
        fun imprime(funcionario: Funcionario) {
            println(
                funcionario.toString()
            )
        }
    }
}