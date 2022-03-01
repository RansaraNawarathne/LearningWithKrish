package com.malindu.rentcloud.profileservice.repository;

import com.malindu.rentcloud.commons.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository <Customer, Integer> {
}
