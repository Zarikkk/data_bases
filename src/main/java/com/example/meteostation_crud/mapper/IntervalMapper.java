package com.example.meteostation_crud.mapper;

import com.example.meteostation_crud.domain.Interval;
import com.example.meteostation_crud.dto.IntervalDto;
import org.springframework.stereotype.Component;

@Component
public class IntervalMapper extends AbstractMapper<Interval, IntervalDto>{
    @Override
    public IntervalDto mapObjectToDto(Interval interval) {
        if (interval == null)
        return null;

        IntervalDto.IntervalDtoBuilder intervalDtoBuilder = IntervalDto.builder();
        intervalDtoBuilder.id(interval.getId());
        intervalDtoBuilder.date(interval.getDate());
        intervalDtoBuilder.time(interval.getTime());
        return intervalDtoBuilder.build();
    }
}
