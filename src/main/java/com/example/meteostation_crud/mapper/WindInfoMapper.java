package com.example.meteostation_crud.mapper;

import com.example.meteostation_crud.domain.WindInfo;
import com.example.meteostation_crud.dto.WindInfoDto;
import org.springframework.stereotype.Component;

@Component
public class WindInfoMapper extends AbstractMapper<WindInfo, WindInfoDto>{
    @Override
    public WindInfoDto mapObjectToDto(WindInfo windInfo) {
        if (windInfo == null)
        return null;

        WindInfoDto.WindInfoDtoBuilder windInfoDtoBuilder = WindInfoDto.builder();
        windInfoDtoBuilder.id(windInfo.getId());
        windInfoDtoBuilder.direction(windInfo.getDirection());
        windInfoDtoBuilder.speed(windInfo.getSpeed());
        return windInfoDtoBuilder.build();
    }
}
