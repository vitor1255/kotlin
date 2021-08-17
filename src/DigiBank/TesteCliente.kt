package src.DigiBank

import src.ClienteTipo

fun main() {
    ClienteTipo.values().forEach {
        println("${it.name} - ${it.descricao}")
    }

    val pf = ClienteTipo.PF
    println(">> ${pf.name} é ${pf.descricao}")

    val pj = ClienteTipo.PJ
    println(">> ${pj.name} é ${pj.descricao}")
}

