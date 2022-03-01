package com.malindu.rentcloud.profileservice.controller;

import com.malindu.rentcloud.commons.model.Customer;
import com.malindu.rentcloud.commons.model.Vehicle;
import com.malindu.rentcloud.profileservice.service.CustomerService;
import com.malindu.rentcloud.profileservice.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping (value = "/services")
public class ProfileController {

    @Autowired
    CustomerService customerService;

    @Autowired
    VehicleService vehicleService;

    @RequestMapping (value = "/profile", method = RequestMethod.POST)
    public Customer save (@RequestBody Customer customer) {
        return customerService.save(customer);
    }

    @RequestMapping(value = "/profile", method = RequestMethod.GET)
    public Customer fetchCustomer (@RequestParam int profileId) {
        return customerService.fetchById(profileId);
    }

    @RequestMapping (value = "/profiles", method = RequestMethod.GET)
    public List<Customer> fetchAllCustomerProfiles () {
        return customerService.fetchAllProfiles();
    }

    @RequestMapping (value = "/vehicle", method = RequestMethod.POST)
    public Vehicle save (@RequestBody Vehicle vehicle) {
        return vehicleService.save(vehicle);
    }

    @RequestMapping (value = "/vehicle", method = RequestMethod.GET)
    public Vehicle fetch (@RequestParam int vehicleId) {
        return vehicleService.fetchById(vehicleId);
    }

    @RequestMapping(value = "/vehicles", method = RequestMethod.GET)
    public List<Vehicle> fetchAllVehicles () {
        return vehicleService.fetchAll();
    }
}
