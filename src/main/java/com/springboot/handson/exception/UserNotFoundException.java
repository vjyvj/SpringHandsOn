package com.springboot.handson.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }
}
