package com.platzi_play.domain.exception;

public class MovieAlreadyExistsExcepcion extends RuntimeException {

    public MovieAlreadyExistsExcepcion(String titulo) {
        super("Movie with title" + titulo + " already exists");
    }
}
