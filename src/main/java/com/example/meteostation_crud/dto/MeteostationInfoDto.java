package com.example.meteostation_crud.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MeteostationInfoDto {
    private Integer id;
    private String temperature;
    private String humidity;
    private String windSpeed;
    private Integer intervalId;
    private String meteostationName;
    private Integer serviceId;
}
