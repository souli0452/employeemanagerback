package com.example.employeemanager.exception;

public class MotoNotFoundException extends RuntimeException {

    public MotoNotFoundException(String message){
        super(message);
    }
}
