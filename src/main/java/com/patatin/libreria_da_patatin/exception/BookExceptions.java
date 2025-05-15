package com.patatin.libreria_da_patatin.exception;

import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.ResponseStatus;



@ResponseStatus(HttpStatus.NOT_FOUND)
public class BookExceptions extends RuntimeException{

    public BookExceptions(String message) {
        super(message);
    }
}

