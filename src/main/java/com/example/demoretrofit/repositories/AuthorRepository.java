package com.example.demoretrofit.repositories;

import com.example.demoretrofit.models.Author;
import com.example.demoretrofit.models.responses.CustomResponse;
import com.google.gson.JsonElement;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface AuthorRepository {

    @GET("/api/v1/authors")
    Call<JsonElement> getAuthors();

    @GET("/api/v1/authors")
    Call< CustomResponse<List<Author> >> getAuthorsPOJO();

    @GET("/api/v1/authors/list")
    Call<List<Author>> getAuthorsPOJOList();

}
