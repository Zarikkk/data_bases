package com.example.meteostation_crud.service;

import com.example.meteostation_crud.domain.Location;
import com.example.meteostation_crud.dto.LocationDto;
import com.example.meteostation_crud.mapper.AbstractMapper;
import com.example.meteostation_crud.mapper.LocationMapper;
import com.example.meteostation_crud.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class LocationService extends AbstractService<Location, Integer, LocationDto>{
    @Autowired
    protected LocationRepository locationRepository;
    @Autowired
    protected LocationMapper locationMapper;

    @Override
    protected JpaRepository<Location, Integer> getRepository() {
        return locationRepository;
    }

    @Override
    protected AbstractMapper<Location, LocationDto> getMapper() {
        return locationMapper;
    }
}
