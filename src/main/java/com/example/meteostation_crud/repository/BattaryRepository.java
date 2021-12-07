package com.example.meteostation_crud.repository;

import com.example.meteostation_crud.domain.Battary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BattaryRepository extends JpaRepository<Battary, Integer> {
}
