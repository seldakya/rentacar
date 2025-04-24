package com.arackiralama.rentacar.dto;


import com.arackiralama.rentacar.entity.ReservationStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReservationDto {

    private Long id;
    private Long userId;
    private Long vehicleId;
    private ReservationStatus status;
    private LocalDate startDate;
    private LocalDate endDate;
    private List<Long> selectedExtraServiceIds;
}
