package com.workintech.zoo.exceptions;

import lombok.Data;
import org.springframework.http.HttpStatus;
@Data
public class AnimalException extends RuntimeException{
    private HttpStatus Status;

    public AnimalException(String message, HttpStatus status) {
        super(message);
        Status = status;
    }
}
