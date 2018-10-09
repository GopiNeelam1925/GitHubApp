package com.piotr.xapo.model

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import java.io.Serializable

@Entity(tableName = "repository")
data class Repository(
        @PrimaryKey(autoGenerate = true) val id: Long,
        @SerializedName("name") val name: String,
        @SerializedName("url") val url: String,
        @SerializedName("author") val author: String,
        @SerializedName("description") val description: String,
        @SerializedName("language") val language: String,
        @SerializedName("stars") val stars: Int,
        @SerializedName("forks") val forks: Int,
        @SerializedName("currentPeriodStars") val currentPeriodStars: Int) :Serializable {
    fun getImageUrl(): String {
        return "https://github.com/$author.png"
    }
}