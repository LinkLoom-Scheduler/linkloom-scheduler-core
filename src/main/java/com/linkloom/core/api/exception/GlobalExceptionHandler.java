package com.linkloom.core.api.exception;

import com.linkloom.core.api.response.CoreResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.resource.NoResourceFoundException;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(NoResourceFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public CoreResponse handleNotFound(NoResourceFoundException ex) {
        return new CoreResponse("ERROR", "Route not found: " + ex.getResourcePath());
    }
}