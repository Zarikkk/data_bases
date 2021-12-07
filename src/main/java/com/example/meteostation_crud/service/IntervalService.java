package com.example.meteostation_crud.service;

import com.example.meteostation_crud.domain.Interval;
import com.example.meteostation_crud.dto.IntervalDto;
import com.example.meteostation_crud.mapper.AbstractMapper;
import com.example.meteostation_crud.mapper.IntervalMapper;
import com.example.meteostation_crud.repository.IntervalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class IntervalService extends AbstractService<Interval, Integer, IntervalDto>{
    @Autowired
    protected IntervalRepository intervalRepository;
    @Autowired
    protected IntervalMapper intervalMapper;

    @Override
    protected JpaRepository<Interval, Integer> getRepository() {
        return intervalRepository;
    }

    @Override
    protected AbstractMapper<Interval, IntervalDto> getMapper() {
        return intervalMapper;
    }
}
