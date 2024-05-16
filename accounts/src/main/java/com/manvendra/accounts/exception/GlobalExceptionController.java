package com.manvendra.accounts.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class GlobalExceptionController {

    public ResponseEntity<ErrorResponse> handleCustomerAlreadyExistException(){

        return null;
    }

}
