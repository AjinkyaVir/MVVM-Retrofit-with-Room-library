package com.example.mvvmretrofit.network;

import android.content.Context;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Ajinkya on 12/26/2020.
 */
public class RetrofitClientInstance {

    private static Retrofit retrofit;
    //private static final String BASE_URL = "http://192.168.0.107:8080/";
    private static final String BASE_URL = "http://13.234.34.210:9898/";

    public static Retrofit getRetrofitInstance(Context context) {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

}
