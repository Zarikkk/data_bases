package com.example.meteostation_crud.controller;
import com.example.meteostation_crud.domain.ServiceInfo;
import com.example.meteostation_crud.dto.ServiceInfoDto;
import com.example.meteostation_crud.mapper.AbstractMapper;
import com.example.meteostation_crud.mapper.ServiceInfoMapper;
import com.example.meteostation_crud.service.AbstractService;
import com.example.meteostation_crud.service.ServiceInfoService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/service_info")
@RestController
@AllArgsConstructor
public class ServiceInfoController extends AbstractController<ServiceInfo, ServiceInfoDto, Integer>{
    @Autowired
    private ServiceInfoService serviceInfoService;
    @Autowired
    private ServiceInfoMapper serviceInfoMapper;
    @Override
    protected AbstractService<ServiceInfo, Integer, ServiceInfoDto> getService() {
        return serviceInfoService;
    }

    @Override
    protected AbstractMapper<ServiceInfo, ServiceInfoDto> getMapper() {
        return serviceInfoMapper;
    }
}
