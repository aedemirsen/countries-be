package com.aedemirsen.countriesbe.mapper;

import com.aedemirsen.countriesbe.dto.CountryDto;
import com.aedemirsen.countriesbe.entity.Country;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ICountryMapper {

    Country toCountry(CountryDto countryDto);

    CountryDto fromCountry(Country country);


//    public Country fromCountryDto(CountryDto countryDto){
//        return Country.builder()
//                .code(countryDto.getCode())
//                .name(countryDto.getName())
//                .flag(countryDto.getFlag())
//                .phone(countryDto.getPhone())
//                .capital(countryDto.getCapital())
//                .language(countryDto.getLanguage())
//                .currency(countryDto.getCurrency())
//                .continent(countryDto.getContinent())
//                .nativeName(countryDto.getNativeName())
//                .build();
//    }
//
//    public CountryDto toCountryDto(Country country){
//        return CountryDto.builder()
//                .id(country.getId())
//                .code(country.getCode())
//                .name(country.getName())
//                .flag(country.getFlag())
//                .phone(country.getPhone())
//                .capital(country.getCapital())
//                .language(country.getLanguage())
//                .currency(country.getCurrency())
//                .continent(country.getContinent())
//                .nativeName(country.getNativeName())
//                .build();
//    }
}
