package com.example.demoretrofit.models.responses;

public class CustomResponse<T> {

//    @SerializedName("data")
    private T data;

    private String message;

    private Boolean status;

    public CustomResponse() {
    }

    public CustomResponse(T data, String message, Boolean status) {
        this.data = data;
        this.message = message;
        this.status = status;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "CustomResponse{" +
                "data=" + data +
                ", message='" + message + '\'' +
                ", status=" + status +
                '}';
    }
}
