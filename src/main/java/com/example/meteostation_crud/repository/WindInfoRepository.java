package com.example.meteostation_crud.repository;

import com.example.meteostation_crud.domain.WindInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WindInfoRepository extends JpaRepository<WindInfo, Integer> {
}
