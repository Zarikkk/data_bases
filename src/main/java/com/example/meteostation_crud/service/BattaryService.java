package com.example.meteostation_crud.service;

import com.example.meteostation_crud.domain.Battary;
import com.example.meteostation_crud.dto.BattaryDto;
import com.example.meteostation_crud.mapper.AbstractMapper;
import com.example.meteostation_crud.mapper.BattaryMapper;
import com.example.meteostation_crud.repository.BattaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class BattaryService extends AbstractService<Battary,Integer, BattaryDto>{
    @Autowired
    protected BattaryRepository battaryRepository;
    @Autowired
    protected BattaryMapper battaryMapper;

    @Override
    protected JpaRepository<Battary, Integer> getRepository() {
        return battaryRepository;
    }

    @Override
    protected AbstractMapper<Battary, BattaryDto> getMapper() {
        return battaryMapper;
    }
}
