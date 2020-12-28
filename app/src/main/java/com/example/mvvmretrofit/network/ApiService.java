package com.example.mvvmretrofit.network;

import com.example.mvvmretrofit.model.PropertyResponse;


import retrofit2.Call;
import retrofit2.http.POST;

/**
 * Created by Ajinkya on 12/26/2020.
 */
public interface ApiService {

    @POST("api/property/getAllProperties")
    Call<PropertyResponse> getAllProperties();

}
