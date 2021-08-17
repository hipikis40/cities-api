package com.likebr.charly.citiesapi.staties.repositories;

import com.likebr.charly.citiesapi.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
