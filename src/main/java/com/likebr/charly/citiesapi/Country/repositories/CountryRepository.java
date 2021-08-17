package com.likebr.charly.citiesapi.Country.repositories;

import com.likebr.charly.citiesapi.Country.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
