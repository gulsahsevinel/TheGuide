package com.gulsah.theguide.entity

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Cards(
    @SerializedName("name_short")
    @Expose
    var name_short: String,
    @SerializedName("name")
    @Expose
    var name: String,
    @SerializedName("value")
    @Expose
    var value: String,
    @SerializedName("value_int")
    @Expose
    var value_int: Int,
    @SerializedName("type")
    @Expose
    var type: Type,
    @SerializedName("meaning_up")
    @Expose
    var meaning_up: String,
    @SerializedName("meaning_rev")
    @Expose
    var meaning_rev: String,
    @SerializedName("desc")
    @Expose
    var desc: String
) {
    enum class Type(val value: String) {
        MAJOR("major"),
        MINOR("minor")
    }
}