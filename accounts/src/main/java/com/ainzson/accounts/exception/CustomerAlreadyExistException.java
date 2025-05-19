package com.ainzson.accounts.exception;

import com.ainzson.accounts.entities.Customer;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class CustomerAlreadyExistException extends RuntimeException{
    public CustomerAlreadyExistException(String message) {
        super(message);
    }
}
