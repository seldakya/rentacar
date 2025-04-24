package com.arackiralama.rentacar.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "users")
@Data
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    private String model;

    private String plate;

    @Enumerated(EnumType.STRING)
    private VehicleType type;

    private String description;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

    @OneToMany(mappedBy = "vehicle", cascade = CascadeType.ALL)
    private List<VehiclePrice> prices;

    @OneToMany(mappedBy = "vehicle", cascade = CascadeType.ALL)
    private List<VehicleAvailability> availabilities;

    @OneToMany(mappedBy = "vehicle", cascade = CascadeType.ALL)
    private List<ExtraService> extraServices;

    @OneToMany(mappedBy = "vehicle", cascade = CascadeType.ALL)
    private List<Reservation> reservations;
}
