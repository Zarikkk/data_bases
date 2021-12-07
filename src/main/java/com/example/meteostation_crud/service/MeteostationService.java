package com.example.meteostation_crud.service;

import com.example.meteostation_crud.domain.Meteostation;
import com.example.meteostation_crud.dto.MeteostationDto;
import com.example.meteostation_crud.mapper.AbstractMapper;
import com.example.meteostation_crud.mapper.MeteostationMapper;
import com.example.meteostation_crud.repository.MeteostationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class MeteostationService extends AbstractService<Meteostation, Integer, MeteostationDto>{
    @Autowired
    protected MeteostationRepository meteostationRepository;
    @Autowired
    protected MeteostationMapper meteostationMapper;

    @Override
    protected JpaRepository<Meteostation, Integer> getRepository() {
        return meteostationRepository;
    }

    @Override
    protected AbstractMapper<Meteostation, MeteostationDto> getMapper() {
        return meteostationMapper;
    }
}
