package com.aedemirsen.countriesbe.service.impl;

import com.aedemirsen.countriesbe.entity.Country;
import com.aedemirsen.countriesbe.exception.CountryAlreadyExistsException;
import com.aedemirsen.countriesbe.initializer.CountryInitializer;
import com.aedemirsen.countriesbe.repository.ICountryRepository;
import com.aedemirsen.countriesbe.service.interfaces.ICountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CountryService implements ICountryService {

    private final ICountryRepository countryRepository;

    @Override
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    @Override
    public List<Country> insertCountries() {
        return countryRepository.saveAll(CountryInitializer.readCountries());
    }

    @Override
    public Country insertCountry(Country country) {
        //gelen ülke koduna sahip başka bir ülke var mı?
        Country existingCountry = countryRepository.findByCode(country.getCode())
                .orElseThrow(() -> new CountryAlreadyExistsException("Bu koda sahip bir ülke daha önce eklenmiş!"));
        return countryRepository.save(country);

    }


    //Get Country By ID



    //Get Countries By Continent


    //Get Countries By phone code


    //Get country by name



    //Get countries by currency
    @Override
    public Country findByCurrency(String currency) {
        return countryRepository.findByCurrency(currency).orElse(null);
    }
}
