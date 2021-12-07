package com.example.meteostation_crud.service;

import com.example.meteostation_crud.domain.Producer;
import com.example.meteostation_crud.dto.ProducerDto;
import com.example.meteostation_crud.mapper.AbstractMapper;
import com.example.meteostation_crud.mapper.ProducerMapper;
import com.example.meteostation_crud.repository.ProducerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ProducerService extends AbstractService<Producer, Integer, ProducerDto>{
    @Autowired
    protected ProducerRepository producerRepository;
    @Autowired
    protected ProducerMapper producerMapper;

    @Override
    protected JpaRepository<Producer, Integer> getRepository() {
        return producerRepository;
    }

    @Override
    protected AbstractMapper<Producer, ProducerDto> getMapper() {
        return producerMapper;
    }
}
