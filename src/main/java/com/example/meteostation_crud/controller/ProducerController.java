package com.example.meteostation_crud.controller;
import com.example.meteostation_crud.domain.Producer;
import com.example.meteostation_crud.dto.ProducerDto;
import com.example.meteostation_crud.mapper.AbstractMapper;
import com.example.meteostation_crud.mapper.ProducerMapper;
import com.example.meteostation_crud.service.AbstractService;
import com.example.meteostation_crud.service.ProducerService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/producer")
@RestController
@AllArgsConstructor
public class ProducerController extends AbstractController<Producer, ProducerDto, Integer>{
    @Autowired
    private ProducerService producerService;
    @Autowired
    private ProducerMapper producerMapper;
    @Override
    protected AbstractService<Producer, Integer, ProducerDto> getService() {
        return producerService;
    }

    @Override
    protected AbstractMapper<Producer, ProducerDto> getMapper() {
        return producerMapper;
    }
}
