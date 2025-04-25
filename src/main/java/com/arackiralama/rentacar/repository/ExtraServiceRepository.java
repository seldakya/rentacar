package com.arackiralama.rentacar.repository;

import com.arackiralama.rentacar.entity.ExtraService;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ExtraServiceRepository extends JpaRepository<ExtraService,Long> {

    Optional<ExtraService> findByVehicleId(Long vehicleId);

}
