package com.aedemirsen.countriesbe.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;

import java.nio.charset.StandardCharsets;
import java.util.Locale;

@Configuration
public class I18nConfig {

    @Bean
    public LocaleResolver localeResolver(){
        var localeResolver = new AcceptHeaderLocaleResolver();
        var defaultLocale = new Locale("tr","TR");
        localeResolver.setDefaultLocale(defaultLocale);
        return localeResolver;
    }

    @Bean
    public ResourceBundleMessageSource messageSource(){
        var messageSource = new ResourceBundleMessageSource();
        messageSource.setBasename("messages/messages");
        messageSource.setDefaultEncoding(StandardCharsets.UTF_8.toString());
        return messageSource;
    }

    @Bean
    public LocalValidatorFactoryBean getValidator(){
        var bean = new LocalValidatorFactoryBean();
        bean.setValidationMessageSource(messageSource());
        return bean;
    }
}
