package com.aedemirsen.countriesbe.service.impl;

import com.aedemirsen.countriesbe.entity.Country;
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
}
