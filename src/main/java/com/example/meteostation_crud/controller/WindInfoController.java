package com.example.meteostation_crud.controller;

import com.example.meteostation_crud.domain.WindInfo;
import com.example.meteostation_crud.dto.WindInfoDto;
import com.example.meteostation_crud.mapper.AbstractMapper;
import com.example.meteostation_crud.mapper.WindInfoMapper;
import com.example.meteostation_crud.service.AbstractService;
import com.example.meteostation_crud.service.WindInfoService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/wind_info")
@RestController
@AllArgsConstructor
public class WindInfoController extends AbstractController<WindInfo, WindInfoDto, Integer>{
    @Autowired
    private WindInfoService windInfoService;
    @Autowired
    private WindInfoMapper windInfoMapper;
    @Override
    protected AbstractService<WindInfo, Integer, WindInfoDto> getService() {
        return windInfoService;
    }

    @Override
    protected AbstractMapper<WindInfo, WindInfoDto> getMapper() {
        return windInfoMapper;
    }
}
