package com.aedemirsen.countriesbe.service.impl;

import com.aedemirsen.countriesbe.service.interfaces.II18nMessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import java.util.Locale;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class I18nMessageService implements II18nMessageService {

    private final MessageSource messageSource;

    @Override
    public String getMessage(String code, Locale locale, Objects... args) {
        return messageSource.getMessage(code, args, locale);
    }
}
