package com.at.internship.schedule.exception;

public class EmailTakenException extends RuntimeException{
    public EmailTakenException(String message){
        super(message);
    }
}