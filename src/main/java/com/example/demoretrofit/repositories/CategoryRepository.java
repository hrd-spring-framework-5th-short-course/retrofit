package com.example.demoretrofit.repositories;

import com.example.demoretrofit.models.Category;
import com.example.demoretrofit.models.responses.CustomResponse;
import com.example.demoretrofit.models.responses.ResponseBase;
import com.example.demoretrofit.models.responses.SaveCategoryResponse;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface CategoryRepository {

    @GET("/api/v1/categories/{id}")
    Call<CustomResponse<Category>> getOneCategory(@Path("id") Integer id);

    @GET("/api/v1/categories")
    Call<List<Category>> getCateByName(@Query("name") String name);

    @POST("/api/v1/categories")
    Call<SaveCategoryResponse> saveCategory(@Body Category category);


    @DELETE("/api/v1/categories/{id}")
    Call<ResponseBase> deleteCategory(@Path("id") Integer id);

//    @PUT
}
