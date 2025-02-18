package dev.dxheroes.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.server.ResponseStatusException;

import dev.dxheroes.dto.Error;
import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResponseStatusException.class)
    public ResponseEntity<Error> handleResponseStatusException(
            ResponseStatusException ex, 
            HttpServletRequest request) {
        
        Error errorResponse = new Error(
            ex.getStatus().value(),
            "[" + request.getRequestURI() + "] " + ex.getReason()
        );

        return ResponseEntity.status(ex.getStatus()).body(errorResponse);
    }
}
