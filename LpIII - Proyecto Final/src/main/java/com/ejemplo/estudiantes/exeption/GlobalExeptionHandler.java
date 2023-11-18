package com.ejemplo.estudiantes.exeption;

import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExeptionHandler {

    @ExceptionHandler({ResourceNotFoundExeption.class})
    public ResponseEntity<ApiErrorResponde> handlerResourceNotFoundException(ResourceNotFoundExeption resourceNotFoundException){

        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(ApiErrorResponde.builder().mensajeError(resourceNotFoundException.getMessage()).build());
    }
}
