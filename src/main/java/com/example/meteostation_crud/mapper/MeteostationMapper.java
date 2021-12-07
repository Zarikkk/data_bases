package com.example.meteostation_crud.mapper;

import com.example.meteostation_crud.domain.Meteostation;
import com.example.meteostation_crud.dto.MeteostationDto;
import org.springframework.stereotype.Component;

@Component
public class MeteostationMapper extends AbstractMapper<Meteostation, MeteostationDto>{
    @Override
    public MeteostationDto mapObjectToDto(Meteostation meteostation) {
        if (meteostation == null)
        return null;

        MeteostationDto.MeteostationDtoBuilder meteostationDtoBuilder = MeteostationDto.builder();
        meteostationDtoBuilder.id(meteostation.getId());
        meteostationDtoBuilder.name(meteostation.getName());
        meteostationDtoBuilder.installationDate(meteostation.getInstalationDate());
        meteostationDtoBuilder.locationName(meteostation.getLocationId().getAdress());
        meteostationDtoBuilder.producerName(meteostation.getProducerId().getName());
        meteostationDtoBuilder.battaryName(meteostation.getBattaryId().getId());
        return meteostationDtoBuilder.build();
    }
}
