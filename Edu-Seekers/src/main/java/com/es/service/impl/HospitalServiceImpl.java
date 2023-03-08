package com.es.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.es.entity.Hospital;
import com.es.repository.HospitalRepository;
import com.es.service.HospitalService;

@Service
public class HospitalServiceImpl implements HospitalService{
	
	private HospitalRepository hospitalRepository; 
	
	

	public HospitalServiceImpl(HospitalRepository hospitalRepository) {
		super();
		this.hospitalRepository = hospitalRepository;
	}



	@Override
	public List<Hospital> getAllHospital() {
		// TODO Auto-generated method stub
		return hospitalRepository.findAll();
	}


	@Override
	public Hospital getHospitalById(Long id) {
		// TODO Auto-generated method stub
		return hospitalRepository.findById(id).get();
	}
	

	@Override
	public Hospital saveHospital(Hospital hospital) {
		// TODO Auto-generated method stub
		return hospitalRepository.save(hospital);
	}



	@Override
	public Hospital updateHospital(Hospital hospital) {
		return hospitalRepository.save(hospital);
	}



	@Override
	public void deleteHospitalById(Long id) {
	    hospitalRepository.deleteById(id);
		
	}

	
	

	
	

}
