package com.aedemirsen.countriesbe.exception;

import com.aedemirsen.countriesbe.service.interfaces.II18nMessageService;
import com.aedemirsen.countriesbe.util.GenericResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@RequiredArgsConstructor
@ControllerAdvice
public class GlobalExceptionHandler {

    private final II18nMessageService messageService;

    @ExceptionHandler({AlreadyExistsException.class})
    public ResponseEntity<GenericResponse<Object>> handleAlreadyExistException(AlreadyExistsException exception){
        String message = messageService.getMessage(exception.getMessage(), LocaleContextHolder.getLocale());
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(
                GenericResponse.builder().success(false).message(message).data(LocaleContextHolder.getLocale().toString()).build()
        );
    }


}
