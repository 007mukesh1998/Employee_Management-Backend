package com.java.ems.exception;

public class ResourceNotFoundException extends  RuntimeException{
    public ResourceNotFoundException (String message){
        super(message);
    }
}
