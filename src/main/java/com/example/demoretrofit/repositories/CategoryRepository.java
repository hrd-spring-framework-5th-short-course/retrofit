package com.example.demoretrofit.repositories;

import com.example.demoretrofit.models.Category;
import com.example.demoretrofit.models.responses.CustomResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface CategoryRepository {

    @GET("/api/v1/categories/{id}")
    Call<CustomResponse<Category>> getOneCategory(@Path("id") Integer id);
}
