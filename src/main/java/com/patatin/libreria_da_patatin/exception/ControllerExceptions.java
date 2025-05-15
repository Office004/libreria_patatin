package com.patatin.libreria_da_patatin.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerExceptions {

    @ExceptionHandler
    public ResponseEntity<String> personalizedException(BookExceptions err){

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err.getMessage());
    }

    @ExceptionHandler
    public ResponseEntity<String> genericException(Exception err){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(err.getMessage());
    }
}

