package com.lunatcoms.horoscapp.domain

import com.lunatcoms.horoscapp.data.network.response.PredictionResponse
import com.lunatcoms.horoscapp.domain.model.PredictionModel

interface Repository {
    suspend fun getPrediction(sign:String): PredictionModel?
}