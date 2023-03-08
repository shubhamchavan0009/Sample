package com.es.service;

import java.util.List;

import com.es.entity.Hospital;

public interface HospitalService {
	List<Hospital> getAllHospital();

	Hospital saveHospital(Hospital hospital);
	
	Hospital getHospitalById(Long id);
	
	Hospital updateHospital(Hospital hospital);
	
	void deleteHospitalById(Long id);
	
}
