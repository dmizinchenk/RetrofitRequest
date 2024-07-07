package com.activity.retrofitrequest;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface MyService {
    @GET("/")
    Call<Model> getModel(@Query("name")String name);
}
