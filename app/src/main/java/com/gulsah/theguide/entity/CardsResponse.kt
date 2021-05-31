package com.gulsah.theguide.entity

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class CardsResponse(
    @SerializedName("nhits")
    @Expose
    var nhits : Int,
    @SerializedName("cards")
    @Expose
    var cards: List<Cards>

) {
}