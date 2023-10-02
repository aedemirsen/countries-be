package com.aedemirsen.countriesbe.service.impl;

import com.aedemirsen.countriesbe.entity.Country;
import com.aedemirsen.countriesbe.exception.CountryAlreadyExistsException;
import com.aedemirsen.countriesbe.initializer.CountryInitializer;
import com.aedemirsen.countriesbe.repository.ICountryRepository;
import com.aedemirsen.countriesbe.service.interfaces.ICountryService;
import com.aedemirsen.countriesbe.util.constants.CacheNames;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
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

    @Cacheable(CacheNames.COUNTRY_NAMES)
    @Override
    public List<String> getAllCountryNames() {
        System.out.println("Veritabanına Erişildi! Cache Mekanizması Kullanılmadı.");
        return countryRepository.findAllCountryNames();
    }

    @Override
    public List<Country> insertCountries() {
        return countryRepository.saveAll(CountryInitializer.readCountries());
    }

    @Caching(
            evict = {
                    @CacheEvict(value = CacheNames.COUNTRY_NAMES, condition = "#country.code != null")
            }
    )
    @Override
    public Country insertCountry(Country country) {
        return countryRepository.save(country);
    }
}
