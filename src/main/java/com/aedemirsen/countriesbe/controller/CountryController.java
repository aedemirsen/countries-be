package com.aedemirsen.countriesbe.controller;

import com.aedemirsen.countriesbe.dto.CountryDto;
import com.aedemirsen.countriesbe.entity.Country;
import com.aedemirsen.countriesbe.mapper.ICountryMapper;
import com.aedemirsen.countriesbe.service.interfaces.ICountryService;
import com.aedemirsen.countriesbe.util.constants.Api;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
@RequestMapping(Api.Country.BASE_URL)
public class CountryController {

    private final ICountryService countryService;

    private final ICountryMapper countryMapper;


    @GetMapping
    public List<Country> getAllCountries(){
        return countryService.getAllCountries();
    }

    @PostMapping("/")
    public ResponseEntity<CountryDto> insertCountry(@RequestBody CountryDto countryDto){
        Country mappedCountry = countryMapper.toCountry(countryDto);
        Country country = countryService.insertCountry(mappedCountry);
        return ResponseEntity.ok(countryMapper.fromCountry(country));
    }

    @PostMapping(Api.Country.INSERT_ALL)
    public List<Country> insertCountries(){
        return countryService.insertCountries();
    }

    //Get Country By ID



    //Get Countries By Continent
    @GetMapping(Api.Country.GET_BY_CONTINENT)
    public List<CountryDto> getCountriesByContinent(@PathVariable("continentName") String continentName){
        List<Country> countries = countryService.getCountriesByContinent(continentName);
        List<CountryDto> resposeList = countries.stream().map(country -> countryMapper.fromCountry(country)).collect(Collectors.toList());
        return resposeList;
    }

    //Get Countries By phone code


    //Get country by name



    //Get countries by currency

}
