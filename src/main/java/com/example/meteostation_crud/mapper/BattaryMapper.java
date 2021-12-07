package com.example.meteostation_crud.mapper;

import com.example.meteostation_crud.domain.Battary;
import com.example.meteostation_crud.dto.BattaryDto;
import org.springframework.stereotype.Component;

@Component
public class BattaryMapper extends AbstractMapper<Battary, BattaryDto>{
    @Override
    public BattaryDto mapObjectToDto(Battary battary) {
        if (battary == null)
        return null;

        BattaryDto.BattaryDtoBuilder battaryDtoBuilder = BattaryDto.builder();
        battaryDtoBuilder.id(battary.getId());
        battaryDtoBuilder.capasity(battary.getCapasity());
        battaryDtoBuilder.producerName(battary.getProducerId().getName());
        return battaryDtoBuilder.build();
    }
}
