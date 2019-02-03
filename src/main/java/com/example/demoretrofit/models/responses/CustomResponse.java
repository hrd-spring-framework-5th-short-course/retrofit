package com.example.demoretrofit.models.responses;

public class CustomResponse<T> extends ResponseBase{

//    @SerializedName("data")
    private T data;

    public CustomResponse() {
    }

    public CustomResponse(T data) {
        this.data = data;
    }

    public CustomResponse(String message, Boolean status, T data) {
        super(message, status);
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "CustomResponse{" +
                "data=" + data +
                '}';
    }
}
