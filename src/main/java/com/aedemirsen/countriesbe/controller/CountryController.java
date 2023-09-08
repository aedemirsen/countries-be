package com.aedemirsen.countriesbe.controller;

import com.aedemirsen.countriesbe.entity.Country;
import com.aedemirsen.countriesbe.service.impl.CountryService;
import com.aedemirsen.countriesbe.service.interfaces.ICountryService;
import com.aedemirsen.countriesbe.util.constants.Api;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(Api.Country.BASE_URL)
public class CountryController {

    private final ICountryService countryService;

    @GetMapping
    public List<Country> getAllCountries(){
        return countryService.getAllCountries();
    }

    //// 1


    //// 2


    //// 3

}
