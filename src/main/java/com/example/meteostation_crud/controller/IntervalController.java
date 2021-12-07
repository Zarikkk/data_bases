package com.example.meteostation_crud.controller;
import com.example.meteostation_crud.domain.Interval;
import com.example.meteostation_crud.dto.IntervalDto;
import com.example.meteostation_crud.mapper.AbstractMapper;
import com.example.meteostation_crud.mapper.IntervalMapper;
import com.example.meteostation_crud.service.AbstractService;
import com.example.meteostation_crud.service.IntervalService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/interval")
@RestController
@AllArgsConstructor
public class IntervalController extends AbstractController<Interval, IntervalDto, Integer> {
    @Autowired
    private IntervalService intervalService;
    @Autowired
    private IntervalMapper intervalMapper;
    @Override
    protected AbstractService<Interval, Integer, IntervalDto> getService() {
        return intervalService;
    }

    @Override
    protected AbstractMapper<Interval, IntervalDto> getMapper() {
        return intervalMapper;
    }
}
