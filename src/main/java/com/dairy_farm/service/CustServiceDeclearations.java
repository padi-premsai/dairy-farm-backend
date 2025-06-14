package com.dairy_farm.service;

import java.util.List;

import com.dairy_farm.entity.Customer;

public interface CustServiceDeclearations {
	public List<Customer> fetchAll();

	public Customer fetchById(int cust_id);

	public void insertOrUpdate(Customer customer);
}
