package com.example.meteostation_crud.controller;
import com.example.meteostation_crud.domain.MeteostationInfo;
import com.example.meteostation_crud.dto.MeteostationInfoDto;
import com.example.meteostation_crud.mapper.AbstractMapper;
import com.example.meteostation_crud.mapper.MeteostationInfoMapper;
import com.example.meteostation_crud.service.AbstractService;
import com.example.meteostation_crud.service.MeteostationInfoService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/meteostation_info")
@RestController
@AllArgsConstructor
public class MeteostationInfoController extends AbstractController<MeteostationInfo, MeteostationInfoDto, Integer> {
    @Autowired
    private MeteostationInfoService meteostationInfoService;
    @Autowired
    private MeteostationInfoMapper meteostationInfoMapper;
    @Override
    protected AbstractService<MeteostationInfo, Integer, MeteostationInfoDto> getService() {
        return meteostationInfoService;
    }

    @Override
    protected AbstractMapper<MeteostationInfo, MeteostationInfoDto> getMapper() {
        return meteostationInfoMapper;
    }
}
