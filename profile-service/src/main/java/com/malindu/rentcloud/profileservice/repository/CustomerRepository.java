package com.malindu.rentcloud.profileservice.repository;

import com.malindu.rentcloud.commons.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
