package com.aedemirsen.countriesbe.util;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class GenericResponse<T>  {
    private boolean success;
    private String message;
    private T data;
}
