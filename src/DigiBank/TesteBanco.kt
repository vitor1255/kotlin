package src.DigiBank

import src.Banco as SrcBanco


fun main() {
    val digibank1 = SrcBanco( "DigiBank1", 12)

    println(digibank1.nome)
    println(digibank1.numero)
}