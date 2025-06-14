package com.dairy_farm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dairy_farm.entity.DailyRecords;
import com.dairy_farm.persistance.RecordsRepository;

@Service
public class RecordService {
	private RecordsRepository recordrepo;

	public RecordService(RecordsRepository recordrepo) {
		this.recordrepo = recordrepo;
	}

	public List<DailyRecords> fetchAll() {
		return recordrepo.findAll();
	}

	public DailyRecords fetchById(int r_id) {
		return recordrepo.findById(r_id).get();
	}

	public List<DailyRecords> fetchByCust_Id(int cust_id) {
		return recordrepo.findAllByCustId(cust_id);
	}

	public void insertOrUpdate(DailyRecords record) {
		recordrepo.save(record);
	}

	public void delete(int r_id) {
		recordrepo.deleteById(r_id);
	}
}
