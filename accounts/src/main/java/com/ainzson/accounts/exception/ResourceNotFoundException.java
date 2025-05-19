package com.ainzson.accounts.exception;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(String resourceName, String fileName, String fieldName) {
        super(String.format("%s not found with %s : '%s'", resourceName, fieldName, fileName));
    }
}
