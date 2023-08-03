package com.example.myapplication.service

import com.example.myapplication.model.CryptoModel
import io.reactivex.Observable
import retrofit2.Call
import retrofit2.http.GET

interface CrypAPI {


    ////https://github.com/
    //atilsamancioglu/K21-JSONDataSet/blob/master/crypto.json
    @GET("atilsamancioglu/K21-JSONDataSet/master/crypto.json")
    fun getData() : Observable<List<CryptoModel>>

}