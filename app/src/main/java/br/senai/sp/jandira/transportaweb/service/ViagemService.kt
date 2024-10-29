package br.senai.sp.jandira.transportaweb.service

import br.senai.sp.jandira.transportaweb.model.Viagem
import retrofit2.Call
import retrofit2.http.GET

interface ViagemService {

@GET("v1/transportaweb/viagens")
fun getListarViagens(): Call<List<Viagem>>
}

