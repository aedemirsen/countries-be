package com.aedemirsen.countriesbe.exception;

public class CountryAlreadyExistsException extends AlreadyExistsException{

    public CountryAlreadyExistsException(String message) {
        super(message);
    }
}
