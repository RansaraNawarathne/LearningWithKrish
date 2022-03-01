package com.malindu.rentcloud.profileservice.service;

import com.malindu.rentcloud.commons.model.Vehicle;

import java.util.List;

public interface VehicleService {
    Vehicle save (Vehicle vehicle);

    Vehicle fetchById (int vehicleId);

    List<Vehicle> fetchAll ();
}
