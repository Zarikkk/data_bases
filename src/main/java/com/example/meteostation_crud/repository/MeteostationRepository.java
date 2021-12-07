package com.example.meteostation_crud.repository;

import com.example.meteostation_crud.domain.Meteostation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeteostationRepository extends JpaRepository<Meteostation, Integer> {
}
