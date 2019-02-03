package com.example.demoretrofit.services;

import com.example.demoretrofit.models.Category;
import com.example.demoretrofit.models.responses.CustomResponse;
import com.example.demoretrofit.models.responses.ResponseBase;
import com.example.demoretrofit.models.responses.SaveCategoryResponse;
import com.example.demoretrofit.repositories.CategoryRepository;
import org.springframework.stereotype.Service;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;
import java.util.List;

@Service
public class CategoryServiceImpl {


    private CategoryRepository categoryRepository;

    public CategoryServiceImpl(Retrofit retrofit) {
        this.categoryRepository = retrofit.create(CategoryRepository.class);

    }


    public Response<CustomResponse<Category>> getOneCategory(Integer id) throws IOException {
        return this.categoryRepository.getOneCategory(id).execute();
    }


    public Response<List<Category>> getCateByName(String name) throws IOException{
        return this.categoryRepository.getCateByName(name).execute() ;
    }


    public Response<SaveCategoryResponse> saveCategory(Category category) throws IOException{

        return this.categoryRepository.saveCategory(category).execute();

    }

    public Response<ResponseBase> deleteCategory(Integer id) throws IOException{
        return this.categoryRepository.deleteCategory(id).execute();
    }
}
