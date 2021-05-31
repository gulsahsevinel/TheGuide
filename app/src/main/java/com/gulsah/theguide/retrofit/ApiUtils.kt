package com.gulsah.theguide.retrofit

class ApiUtils {
    companion object{
        val BASE_URL = "https://rws-cards-api.herokuapp.com/api/v1/"
        fun getCardsDao() : CardsDao{
            return RetrofitClient.getClient(BASE_URL).create(CardsDao::class.java)
        }
    }
}