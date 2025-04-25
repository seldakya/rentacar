package com.arackiralama.rentacar.repository;

import com.arackiralama.rentacar.entity.Vehicle;
import com.arackiralama.rentacar.entity.VehicleType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VehicleRepository extends JpaRepository<Vehicle,Long> {

    List<Vehicle> findByCompanyId(Long companyId);
    List<Vehicle> findByType(VehicleType type);
}
