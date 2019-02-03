package com.example.demoretrofit.models.responses;


public class ResponseBase {

    private String message;
    private Boolean status;

    public ResponseBase() {
    }

    public ResponseBase(String message, Boolean status) {
        this.message = message;
        this.status = status;
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
        return "ResponseBase{" +
                "message='" + message + '\'' +
                ", status=" + status +
                '}';
    }
}
