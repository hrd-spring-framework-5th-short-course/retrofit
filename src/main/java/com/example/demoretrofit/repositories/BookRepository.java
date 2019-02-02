package com.example.demoretrofit.repositories;

import com.example.demoretrofit.models.Book;
import com.example.demoretrofit.models.responses.CustomResponse;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface BookRepository {

    @GET("/api/v1/books")
    Call<CustomResponse <List<Book> >> getAllBook();

}
