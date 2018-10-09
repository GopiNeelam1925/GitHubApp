package com.piotr.xapo

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.piotr.xapo.model.Repository

object TestValues {
    val testResponse: String = "[{  \n" +
            "      \"author\":\"saket\",\n" +
            "      \"name\":\"FluidKeyboardResize\",\n" +
            "      \"url\":\"https://github.com/saket/FluidKeyboardResize\",\n" +
            "      \"description\":\"Smoothly reacting to keyboard visibility changes\",\n" +
            "      \"language\":\"Kotlin\",\n" +
            "      \"stars\":257,\n" +
            "      \"forks\":12,\n" +
            "      \"currentPeriodStars\":60\n" +
            "   },\n" +
            "   {  \n" +
            "      \"author\":\"SchibstedSpain\",\n" +
            "      \"name\":\"Protein\",\n" +
            "      \"url\":\"https://github.com/SchibstedSpain/Protein\",\n" +
            "      \"description\":\"\uD83D\uDC8A Protein is a Kotlin code generator for Retrofit 2 and RxJava 2 based on Swagger\",\n" +
            "      \"language\":\"Kotlin\",\n" +
            "      \"stars\":117,\n" +
            "      \"forks\":2,\n" +
            "      \"currentPeriodStars\":40\n" +
            "   },\n" +
            "   {  \n" +
            "      \"author\":\"shadowsocks\",\n" +
            "      \"name\":\"shadowsocks-android\",\n" +
            "      \"url\":\"https://github.com/shadowsocks/shadowsocks-android\",\n" +
            "      \"description\":\"A shadowsocks client for Android\",\n" +
            "      \"language\":\"Kotlin\",\n" +
            "      \"stars\":18080,\n" +
            "      \"forks\":7641,\n" +
            "      \"currentPeriodStars\":30\n" +
            "   }]"


    fun getTestRepositories(): List<Repository> {
        val RepositorysType = object : TypeToken<List<Repository>>() {}.type
        return Gson().fromJson<List<Repository>>(testResponse, RepositorysType)
    }
}