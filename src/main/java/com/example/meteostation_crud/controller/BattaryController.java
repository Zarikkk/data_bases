package com.example.meteostation_crud.controller;

import com.example.meteostation_crud.domain.Battary;
import com.example.meteostation_crud.dto.BattaryDto;
import com.example.meteostation_crud.mapper.AbstractMapper;
import com.example.meteostation_crud.mapper.BattaryMapper;
import com.example.meteostation_crud.service.AbstractService;
import com.example.meteostation_crud.service.BattaryService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/battary")
@RestController
@AllArgsConstructor
public class BattaryController extends AbstractController<Battary, BattaryDto,Integer>{
    @Autowired
    private BattaryService battaryService;
    @Autowired
    private BattaryMapper battaryMapper;
    @Override
    protected AbstractService<Battary, Integer, BattaryDto> getService() {
        return battaryService;
    }

    @Override
    protected AbstractMapper<Battary, BattaryDto> getMapper() {
        return battaryMapper;
    }
}
