package com.malindu.rentcloud.profileservice.service;

import com.malindu.rentcloud.commons.model.Vehicle;
import com.malindu.rentcloud.profileservice.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleServiceImpl implements VehicleService{

    @Autowired
    VehicleRepository vehicleRepository;

    @Override
    public Vehicle save(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    @Override
    public Vehicle fetchById(int vehicleId) {
        Optional<Vehicle> vehicle = vehicleRepository.findById(vehicleId);

        if (vehicle.isPresent()) {
            return vehicle.get();
        } else {
            return null;
        }
    }

    @Override
    public List<Vehicle> fetchAll() {
        return vehicleRepository.findAll();
    }
}
