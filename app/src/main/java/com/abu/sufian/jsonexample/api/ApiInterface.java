package com.abu.sufian.jsonexample.api;

import com.abu.sufian.jsonexample.datamodel.UniversityModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("api/public")
    Call<List<UniversityModel>> getData();
}
