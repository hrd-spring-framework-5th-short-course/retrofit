package com.example.demoretrofit.models.responses;

import com.example.demoretrofit.models.Category;

public class SaveCategoryResponse extends ResponseBase{
    private Category category;


    public SaveCategoryResponse() {
    }

    public SaveCategoryResponse(Category category) {
        this.category = category;
    }

    public SaveCategoryResponse(String message, Boolean status, Category category) {
        super(message, status);
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "SaveCategoryResponse{" +
                "category=" + category +
                '}';
    }
}
