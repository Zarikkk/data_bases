package com.example.meteostation_crud.mapper;

import com.example.meteostation_crud.domain.MeteostationInfo;
import com.example.meteostation_crud.dto.MeteostationInfoDto;
import org.springframework.stereotype.Component;

@Component
public class MeteostationInfoMapper extends AbstractMapper<MeteostationInfo, MeteostationInfoDto>{
    @Override
    public MeteostationInfoDto mapObjectToDto(MeteostationInfo meteostationInfo) {
        if (meteostationInfo == null)
        return null;

        MeteostationInfoDto.MeteostationInfoDtoBuilder meteostationInfoDtoBuilder = MeteostationInfoDto.builder();
        meteostationInfoDtoBuilder.id(meteostationInfo.getId());
        meteostationInfoDtoBuilder.temperature(meteostationInfo.getTemperature());
        meteostationInfoDtoBuilder.humidity(meteostationInfo.getHumidity());
        meteostationInfoDtoBuilder.windSpeed(meteostationInfo.getWindId().getSpeed());
        meteostationInfoDtoBuilder.intervalId(meteostationInfo.getIntervalId().getId());
        meteostationInfoDtoBuilder.meteostationName(meteostationInfo.getMeteostationId().getName());
        meteostationInfoDtoBuilder.serviceId(meteostationInfo.getServiceId().getId());
        return meteostationInfoDtoBuilder.build();
    }
}
