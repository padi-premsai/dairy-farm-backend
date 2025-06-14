package com.dairy_farm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dairy_farm.entity.Amount;
import com.dairy_farm.persistance.AmountRepository;

@Service
public class AmountService {
	private AmountRepository amountRepo;

	@Autowired
	public AmountService(AmountRepository amountRepo) {
		this.amountRepo = amountRepo;
	}

	public List<Amount> fetchAll() {
		return amountRepo.findAll();
	}

	public Amount fetchById(String animal) {
		return amountRepo.findById(animal).get();
	}

	public void insertOrUpdate(Amount amount) {
		amountRepo.save(amount);
	}

	public void delete(String animal) {
		amountRepo.deleteById(animal);
	}

}
