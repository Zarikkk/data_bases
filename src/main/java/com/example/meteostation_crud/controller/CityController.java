package com.example.meteostation_crud.controller;
import com.example.meteostation_crud.domain.City;
import com.example.meteostation_crud.dto.CityDto;
import com.example.meteostation_crud.mapper.AbstractMapper;
import com.example.meteostation_crud.mapper.CityMapper;
import com.example.meteostation_crud.service.AbstractService;
import com.example.meteostation_crud.service.CityService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/city")
@RestController
@AllArgsConstructor
public class CityController extends AbstractController<City, CityDto, Integer>{
    @Autowired
    private CityService cityService;
    @Autowired
    private CityMapper cityMapper;
    @Override
    protected AbstractService<City, Integer, CityDto> getService() {
        return cityService;
    }

    @Override
    protected AbstractMapper<City, CityDto> getMapper() {
        return cityMapper;
    }
}
