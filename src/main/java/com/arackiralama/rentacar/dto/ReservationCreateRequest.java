package com.arackiralama.rentacar.dto;

import com.arackiralama.rentacar.entity.ReservationStatus;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReservationCreateRequest {

    private Long userId;
    private Long vehicleId;
    private ReservationStatus status;
    private LocalDate startDate;
    private LocalDate endDate;
    private List<Long> selectedExtraServiceIds;
}
