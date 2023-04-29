package com.kings.rentacarrest.core.exception;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class DefaultException extends Exception{
        private String message;
        private HttpStatus httpStatus;

        public DefaultException(String message, HttpStatus httpStatus){
            super(message);
            this.message=message;
            this.httpStatus=httpStatus;
        }
}
