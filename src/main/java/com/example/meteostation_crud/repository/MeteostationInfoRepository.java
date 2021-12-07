package com.example.meteostation_crud.repository;

import com.example.meteostation_crud.domain.MeteostationInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeteostationInfoRepository extends JpaRepository<MeteostationInfo, Integer> {
}
