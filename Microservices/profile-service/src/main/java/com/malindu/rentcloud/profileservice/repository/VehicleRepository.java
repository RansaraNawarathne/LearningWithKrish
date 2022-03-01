package com.malindu.rentcloud.profileservice.repository;

import com.malindu.rentcloud.commons.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
}
