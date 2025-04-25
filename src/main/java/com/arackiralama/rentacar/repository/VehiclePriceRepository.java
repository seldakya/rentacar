package com.arackiralama.rentacar.repository;

import com.arackiralama.rentacar.entity.VehiclePrice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VehiclePriceRepository extends JpaRepository<VehiclePrice,Long> {

    List<VehiclePrice> findByVehicleId(Long vehicleId);
}
