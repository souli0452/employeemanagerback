package com.example.employeemanager.exception;

public class VoitureNotFondException extends RuntimeException{

    private static String message;

    public VoitureNotFondException (String id){
        super(message);
    }
    
}
