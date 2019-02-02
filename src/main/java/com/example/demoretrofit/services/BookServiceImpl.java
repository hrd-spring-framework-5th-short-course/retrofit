package com.example.demoretrofit.services;

import com.example.demoretrofit.models.Book;
import com.example.demoretrofit.models.responses.CustomResponse;
import com.example.demoretrofit.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;
import java.util.List;

@Service
public class BookServiceImpl {

    private BookRepository bookRepository;

    @Autowired
    public BookServiceImpl(Retrofit retrofit) {
        this.bookRepository = retrofit.create(BookRepository.class);
    }


    public Response<CustomResponse<List<Book>>> getAllBook() throws IOException {

        return this.bookRepository.getAllBook().execute();
    }


}
