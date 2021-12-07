package com.example.meteostation_crud.repository;

import com.example.meteostation_crud.domain.ServiceInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceInfoRepository extends JpaRepository<ServiceInfo, Integer> {
}
