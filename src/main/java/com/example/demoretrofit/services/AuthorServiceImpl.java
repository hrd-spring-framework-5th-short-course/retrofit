package com.example.demoretrofit.services;

import com.example.demoretrofit.models.Author;
import com.example.demoretrofit.models.responses.CustomResponse;
import com.example.demoretrofit.repositories.AuthorRepository;
import com.google.gson.JsonElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;
import java.util.List;

@Service
public class AuthorServiceImpl {

    private AuthorRepository authorRepository;

    @Autowired
    public AuthorServiceImpl(Retrofit retrofit) {
        this.authorRepository = retrofit.create(AuthorRepository.class);
    }

    public Response<JsonElement> getAuthors() throws IOException {
        return this.authorRepository.getAuthors().execute();
    }

    public Response<List<Author>> getAuthorsPOJOList() throws IOException {
        return this.authorRepository.getAuthorsPOJOList().execute();
    }

    public Response<CustomResponse<List<Author>>> getAuthorPOJO() throws IOException {

        return this.authorRepository.getAuthorsPOJO().execute();
    }
}
