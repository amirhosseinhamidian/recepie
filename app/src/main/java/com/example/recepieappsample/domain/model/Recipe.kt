package com.example.recepieappsample.domain.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

data class Recipe (
        val id : Int? = null,
        val title : String? = null,
        var publisher : String? = null,
        var featuredImage : String? = null,
        var rating : Int? = 0,
        var sourceUrl : String? = null,
        var description : String? = null,
        var cookingInstructions : String? = null,
        var ingredients : List<String>? = listOf(),
        var dateAdded : String? = null,
        var dateUpdated : String? = null,
)