package com.dairy_farm.persistance;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dairy_farm.entity.Customer;

public interface CustRepositor extends JpaRepository<Customer, Integer> {
}
