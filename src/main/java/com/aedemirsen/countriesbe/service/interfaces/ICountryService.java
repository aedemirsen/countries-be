package com.aedemirsen.countriesbe.service.interfaces;

import com.aedemirsen.countriesbe.entity.Country;

import java.util.List;

public interface ICountryService {

    List<Country> getAllCountries();

    List<Country> insertCountries();

    Country insertCountry(Country country);

    //Get Country By ID



    //Get Countries By Continent
    List<Country> getCountriesByContinent(String continentName);

    //Get Countries By phone code


    //Get country by name



    //Get countries by currency

}
