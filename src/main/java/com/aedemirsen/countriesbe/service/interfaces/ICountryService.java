package com.aedemirsen.countriesbe.service.interfaces;

import com.aedemirsen.countriesbe.entity.Country;

import java.util.List;

public interface ICountryService {

    List<Country> getAllCountries();

    List<Country> insertCountries();

}
