package com.example.meteostation_crud.mapper;

import com.example.meteostation_crud.domain.Producer;
import com.example.meteostation_crud.dto.ProducerDto;
import org.springframework.stereotype.Component;

@Component
public class ProducerMapper extends AbstractMapper<Producer, ProducerDto>{
    @Override
    public ProducerDto mapObjectToDto(Producer producer) {
        if (producer == null)
        return null;

        ProducerDto.ProducerDtoBuilder producerDtoBuilder = ProducerDto.builder();
        producerDtoBuilder.id(producer.getId());
        producerDtoBuilder.name(producer.getName());
        producerDtoBuilder.country(producer.getCountry());
        return producerDtoBuilder.build();
    }
}
