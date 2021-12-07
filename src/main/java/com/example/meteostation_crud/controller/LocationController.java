package com.example.meteostation_crud.controller;
import com.example.meteostation_crud.domain.Location;
import com.example.meteostation_crud.dto.LocationDto;
import com.example.meteostation_crud.mapper.AbstractMapper;
import com.example.meteostation_crud.mapper.LocationMapper;
import com.example.meteostation_crud.service.AbstractService;
import com.example.meteostation_crud.service.LocationService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/location")
@RestController
@AllArgsConstructor
public class LocationController extends AbstractController<Location, LocationDto, Integer> {
    @Autowired
    private LocationService locationService;
    @Autowired
    private LocationMapper locationMapper;
    @Override
    protected AbstractService<Location, Integer, LocationDto> getService() {
        return locationService;
    }

    @Override
    protected AbstractMapper<Location, LocationDto> getMapper() {
        return locationMapper;
    }
}
