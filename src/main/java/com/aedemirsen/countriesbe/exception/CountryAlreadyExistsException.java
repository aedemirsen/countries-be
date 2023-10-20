package com.aedemirsen.countriesbe.exception;

import com.aedemirsen.countriesbe.util.constants.i18n.I18nConstants;

public class CountryAlreadyExistsException extends AlreadyExistsException{

    public CountryAlreadyExistsException() {
        super(I18nConstants.COUNTRY_ALREADY_EXISTS);
    }
}
