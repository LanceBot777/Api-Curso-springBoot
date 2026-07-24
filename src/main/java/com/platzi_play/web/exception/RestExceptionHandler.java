package com.platzi_play.web.exception;

import com.platzi_play.domain.exception.MovieAlreadyExistsExcepcion;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice //Captura las Excepxiones que ocurren en nuestra app
public class RestExceptionHandler {

    @ExceptionHandler(MovieAlreadyExistsExcepcion.class)
    public ResponseEntity<Error> handleException(MovieAlreadyExistsExcepcion ex){
        Error error = new Error("MovieAlreadyExistsExcepcion", ex.getMessage());
        return ResponseEntity.badRequest().body(error); //cuerpo de la respues es error
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<List<Error>> handleException(MethodArgumentNotValidException ex){
        List<Error> errors = new ArrayList<>();

        ex.getBindingResult().getFieldErrors().forEach((error) -> {
            errors.add(new Error(error.getDefaultMessage(),  error.getField()));
        });

        return ResponseEntity.badRequest().body(errors);
    }

    @ExceptionHandler (Exception.class) //Clase general que captura todas las excepciones de java
    public ResponseEntity<Error> handleException(Exception ex){
        Error error = new Error("unknow-eror", ex.getMessage());
        ex.printStackTrace();
        return ResponseEntity.badRequest().body(error);
    }
}
