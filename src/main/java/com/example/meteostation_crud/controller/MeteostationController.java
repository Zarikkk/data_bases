package com.example.meteostation_crud.controller;
import com.example.meteostation_crud.domain.Meteostation;
import com.example.meteostation_crud.dto.MeteostationDto;
import com.example.meteostation_crud.mapper.AbstractMapper;
import com.example.meteostation_crud.mapper.MeteostationMapper;
import com.example.meteostation_crud.service.AbstractService;
import com.example.meteostation_crud.service.MeteostationService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/meteostation")
@RestController
@AllArgsConstructor
public class MeteostationController extends AbstractController<Meteostation, MeteostationDto, Integer>{
    @Autowired
    private MeteostationService meteostationService;
    @Autowired
    private MeteostationMapper meteostationMapper;
    @Override
    protected AbstractService<Meteostation, Integer, MeteostationDto> getService() {
        return meteostationService;
    }

    @Override
    protected AbstractMapper<Meteostation, MeteostationDto> getMapper() {
        return meteostationMapper;
    }
}
