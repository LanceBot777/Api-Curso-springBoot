package com.platzi_play.web.exception;

import org.springframework.http.ResponseEntity;

public record Error(String type, String message){

}

