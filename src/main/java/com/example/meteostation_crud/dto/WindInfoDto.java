package com.example.meteostation_crud.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WindInfoDto {
    private Integer id;
    private String direction;
    private String speed;
}
