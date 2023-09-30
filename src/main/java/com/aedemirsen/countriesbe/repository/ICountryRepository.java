package com.aedemirsen.countriesbe.repository;

import com.aedemirsen.countriesbe.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ICountryRepository extends JpaRepository<Country,String> {

    Optional<Country> findByCode(String code);

}
