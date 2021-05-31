package com.gulsah.theguide.retrofit

import com.gulsah.theguide.entity.Cards
import com.gulsah.theguide.entity.CardsResponse
import retrofit2.Call
import retrofit2.http.GET

interface CardsDao {
    @GET("cards")
    fun getAllCards() : Call<CardsResponse>

}