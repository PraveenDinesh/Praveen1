package com.nouhoun.springboot.jwt.integration.extensionrepository.exceptions;

public class FormatExeption extends RuntimeException{
    public FormatExeption(String message) {
        super(message);
    }

    public FormatExeption(String message, Throwable cause) {
        super(message, cause);
    }
}
