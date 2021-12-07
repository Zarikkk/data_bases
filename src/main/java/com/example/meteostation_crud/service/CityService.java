package com.example.meteostation_crud.service;

import com.example.meteostation_crud.domain.City;
import com.example.meteostation_crud.dto.CityDto;
import com.example.meteostation_crud.mapper.AbstractMapper;
import com.example.meteostation_crud.mapper.CityMapper;
import com.example.meteostation_crud.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class CityService extends AbstractService<City, Integer, CityDto>{
    @Autowired
    protected CityRepository cityRepository;

    @Autowired
    protected CityMapper cityMapper;

    @Override
    protected JpaRepository<City, Integer> getRepository() {
        return cityRepository;
    }

    @Override
    protected AbstractMapper<City, CityDto> getMapper() {
        return cityMapper;
    }
}
