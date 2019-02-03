package com.example.demoretrofit;

import com.example.demoretrofit.models.Category;
import com.example.demoretrofit.models.responses.SaveCategoryResponse;
import com.example.demoretrofit.repositories.BookRepository;
import com.example.demoretrofit.services.AuthorServiceImpl;
import com.example.demoretrofit.services.BookServiceImpl;
import com.example.demoretrofit.services.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoRetrofitApplication implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(DemoRetrofitApplication.class, args);
    }


    @Autowired
    private AuthorServiceImpl authorService;

    @Autowired
    private BookServiceImpl bookService;

    @Autowired
    private CategoryServiceImpl categoryService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        System.out.println(authorService.getAuthors().body());


        this.authorService.getAuthorsPOJOList().body()
                .forEach(System.out::println);


        this.authorService.getAuthorPOJO().body().getData()
                .forEach(System.out::println);

        System.out.println(this.authorService.getAuthorPOJO().body().getMessage());


        this.bookService.getAllBook().body().getData()
                .forEach(System.out::println);

        System.out.println(this.categoryService.getOneCategory(1).body().getData());


        System.out.println(this.categoryService.getCateByName("string").body());


        Category category = new Category("From Retrofit");

        SaveCategoryResponse response = this.categoryService.saveCategory(category).body();

        System.out.println(response);


        System.out.println(this.categoryService.deleteCategory(16).body());

    }
}

