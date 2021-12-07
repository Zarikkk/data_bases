package com.example.meteostation_crud.mapper;

import com.example.meteostation_crud.domain.Location;
import com.example.meteostation_crud.dto.LocationDto;
import org.springframework.stereotype.Component;

@Component
public class LocationMapper extends AbstractMapper<Location, LocationDto>{
    @Override
    public LocationDto mapObjectToDto(Location location) {
        if (location == null)
        return null;

        LocationDto.LocationDtoBuilder locationDtoBuilder = LocationDto.builder();
        locationDtoBuilder.id(location.getId());
        locationDtoBuilder.coordinates(location.getCoordinates());
        locationDtoBuilder.adress(location.getAdress());
        locationDtoBuilder.cityName(location.getCityId().getName());
        return locationDtoBuilder.build();
    }
}
