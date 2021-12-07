package com.example.meteostation_crud.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MeteostationDto {
    private Integer id;
    private String name;
    private String installationDate;
    private String locationName;
    private String producerName;
    private Integer battaryName;
}
