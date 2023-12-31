package com.aedemirsen.countriesbe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.aedemirsen.countriesbe")
public class CountriesBeApplication {

    public static void main(String[] args) {
        SpringApplication.run(CountriesBeApplication.class, args);
    }

}
