package com.manvendra.accounts.exception;

import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class CustomerAlreadyExist extends RuntimeException {

    public CustomerAlreadyExist() {
        super("Customer is already registered with this id");
    }

    public CustomerAlreadyExist(String message) {
        super(message);
    }
}
