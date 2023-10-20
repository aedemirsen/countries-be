package com.aedemirsen.countriesbe.service.interfaces;

import java.util.Locale;
import java.util.Objects;

public interface II18nMessageService {

    String getMessage(String code, Locale locale, Objects... args);

}
