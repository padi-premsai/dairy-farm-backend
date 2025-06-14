package com.dairy_farm.persistance;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dairy_farm.entity.Amount;

public interface AmountRepository extends JpaRepository<Amount, String> {

}
