package com.example.meteostation_crud.mapper;

import com.example.meteostation_crud.domain.ServiceInfo;
import com.example.meteostation_crud.dto.ServiceInfoDto;
import org.springframework.stereotype.Component;

@Component
public class ServiceInfoMapper extends AbstractMapper<ServiceInfo, ServiceInfoDto> {
    @Override
    public ServiceInfoDto mapObjectToDto(ServiceInfo serviceInfo) {
        if (serviceInfo == null)
        return null;
        ServiceInfoDto.ServiceInfoDtoBuilder serviceInfoDtoBuilder = ServiceInfoDto.builder();
        serviceInfoDtoBuilder.id(serviceInfo.getId());
        serviceInfoDtoBuilder.description(serviceInfo.getDescription());
        serviceInfoDtoBuilder.date(serviceInfo.getDate());
        return serviceInfoDtoBuilder.build();
    }
}
