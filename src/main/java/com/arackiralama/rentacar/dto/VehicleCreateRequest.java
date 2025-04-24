package com.arackiralama.rentacar.dto;

import com.arackiralama.rentacar.entity.VehicleType;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VehicleCreateRequest {

    @NotBlank
    private String model;

    @NotBlank
    private String plate;
    private VehicleType type;
    private String description;
    private Long companyId;
}
