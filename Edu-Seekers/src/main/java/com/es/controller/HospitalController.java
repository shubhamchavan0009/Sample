package com.es.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.es.entity.Hospital;
import com.es.entity.Student;
import com.es.service.HospitalService;



@Controller
public class HospitalController {
	
	private HospitalService hospitalService;
	//Generate Constructor

	public HospitalController(HospitalService hospitalService) {
		super();
		this.hospitalService = hospitalService;
	}
	
	//Handler method to handle model and view
	@GetMapping("/hospitals")
	public String listHospital(Model model) {
		model.addAttribute("hospitals", hospitalService.getAllHospital());
		return "hospitals";
	}
	
	@GetMapping("/hospitals/new")	
	public String addHospital(Model model) {
		//create hospital object to hold hospital data
		Hospital hospital=new Hospital();
		model.addAttribute("hospital", hospital);
		return "add_hospitals";
		
	}
	
	@PostMapping("/hospitals")
	public String SaveHospital(@ModelAttribute("hospital") Hospital hospital) {
		
		hospitalService.saveHospital(hospital);
		
		return "redirect:/hospitals";
		
	}
	
	
	@GetMapping("/hospitals/edit/{id}")
	public String editHospitalForm(@PathVariable Long id, Model model) {
		
		model.addAttribute("hospital", hospitalService.getHospitalById(id));
		return"edit_hospital";
		
	}
	
	@PostMapping("/hospitals/{id}")
	public String updateHospital(@PathVariable Long id, @ModelAttribute("hospital") Hospital hospital,Model model) {
		// get hospital from db by id
		Hospital existingHospital = hospitalService.getHospitalById(id);
		existingHospital.setId(id);
		existingHospital.sethName(hospital.gethName());
		existingHospital.sethAddress(hospital.gethAddress());
		existingHospital.sethContactNumber(hospital.gethContactNumber());
		existingHospital.setSpeciality(hospital.getSpeciality());
		existingHospital.sethRating(hospital.gethRating());
		
		//save updated hospital object
		hospitalService.updateHospital(existingHospital);
		return "redirect:/hospitals";
		
	}
	
	@GetMapping("/hospitals/{id}")
	public String deleteHospital(@PathVariable Long id) {
		hospitalService.deleteHospitalById(id);
		return "redirect:/hospitals";
	}
	
	
}
