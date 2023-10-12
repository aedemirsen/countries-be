package com.aedemirsen.countriesbe.repository;

import com.aedemirsen.countriesbe.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ICountryRepository extends JpaRepository<Country,String> {

    Optional<Country> findByCode(String code);

    //Get Country By ID



    //Get Countries By Continent
    Optional<List<Country>> findByContinent(String continentName);

    //Get Countries By phone code


    //Get country by name



    //Get countries by currency

}
