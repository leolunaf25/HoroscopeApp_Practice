package com.lunatcoms.horoscapp.data

import android.util.Log
import com.lunatcoms.horoscapp.data.network.HoroscopeApiService
import com.lunatcoms.horoscapp.data.network.response.PredictionResponse
import com.lunatcoms.horoscapp.domain.Repository
import com.lunatcoms.horoscapp.domain.model.PredictionModel
import retrofit2.Retrofit
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private val apiService: HoroscopeApiService):Repository {

    override suspend fun getPrediction(sign: String):PredictionModel? {
        runCatching { apiService.getHoroscope(sign) }
            .onSuccess { return it.toDomain() }
            .onFailure { Log.i("nota", "Ha ocurrido un error ${it.message}") }
        return null
    }
}