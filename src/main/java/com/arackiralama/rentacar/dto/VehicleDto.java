package com.arackiralama.rentacar.dto;

import com.arackiralama.rentacar.entity.*;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VehicleDto {

    private  Long id;
    private String model;
    private String plate;
    private VehicleType type;
    private String description;
    private Long companyId;
}
