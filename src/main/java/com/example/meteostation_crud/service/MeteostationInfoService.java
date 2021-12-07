package com.example.meteostation_crud.service;

import com.example.meteostation_crud.domain.MeteostationInfo;
import com.example.meteostation_crud.dto.MeteostationInfoDto;
import com.example.meteostation_crud.mapper.AbstractMapper;
import com.example.meteostation_crud.mapper.MeteostationInfoMapper;
import com.example.meteostation_crud.repository.MeteostationInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class MeteostationInfoService extends AbstractService<MeteostationInfo, Integer, MeteostationInfoDto>{
    @Autowired
    protected MeteostationInfoRepository meteostationInfoRepository;
    @Autowired
    protected MeteostationInfoMapper meteostationInfoMapper;

    @Override
    protected JpaRepository<MeteostationInfo, Integer> getRepository() {
        return meteostationInfoRepository;
    }

    @Override
    protected AbstractMapper<MeteostationInfo, MeteostationInfoDto> getMapper() {
        return meteostationInfoMapper;
    }
}
