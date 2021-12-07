package com.example.meteostation_crud.repository;

import com.example.meteostation_crud.domain.Interval;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IntervalRepository extends JpaRepository<Interval, Integer> {
}
