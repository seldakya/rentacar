package com.arackiralama.rentacar.repository;

import com.arackiralama.rentacar.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

    List<Reservation> findByVehicleIdAndStartDateLessThanEqualAndEndDateGreaterThanEqual(Long vehicleId, LocalDate endDate, LocalDate startDate);
}
