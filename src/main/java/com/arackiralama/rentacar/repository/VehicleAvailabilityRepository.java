package com.arackiralama.rentacar.repository;

import com.arackiralama.rentacar.entity.VehicleAvailability;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface VehicleAvailabilityRepository extends JpaRepository<VehicleAvailability, Long> {

    List<VehicleAvailability> findByVehicleIdAndAvailableDateBetween(Long vehicleId , LocalDate start , LocalDate end);
}
