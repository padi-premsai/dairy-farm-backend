package com.dairy_farm.persistance;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dairy_farm.entity.DailyRecords;

public interface RecordsRepository extends JpaRepository<DailyRecords, Integer> {
	public List<DailyRecords> findAllByCustId(int cust_id);
}
