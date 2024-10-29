package br.senai.sp.jandira.transportaweb.model

data class Veiculo(
    val placa: String = "",
    val modelo: String = "",
    val ano: String = "",
    val tipo: String = "",
    val capacidade_carga: Int = 0
)
