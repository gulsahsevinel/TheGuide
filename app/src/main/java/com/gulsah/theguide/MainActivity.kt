package com.gulsah.theguide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.gulsah.theguide.entity.Cards
import com.gulsah.theguide.entity.CardsResponse
import com.gulsah.theguide.retrofit.ApiUtils
import com.gulsah.theguide.retrofit.CardsDao
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private lateinit var cdao : CardsDao
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        cdao = ApiUtils.getCardsDao()
        //showCards()
    }

    fun showCards(){
        cdao.getAllCards().enqueue(object : Callback<CardsResponse>{
            override fun onResponse(call: Call<CardsResponse>, response: Response<CardsResponse>) {
                val cardsList = response.body()!!.cards
                for (c in cardsList){
                    Log.e("****************","************")
                    Log.e("card",c.name)
                }
            }

            override fun onFailure(call: Call<CardsResponse>, t: Throwable) {
                TODO("Not yet implemented")
            }


        })
    }
}