package com.github.joeeefarias.citiesapi.countries.repository;

import com.github.joeeefarias.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
