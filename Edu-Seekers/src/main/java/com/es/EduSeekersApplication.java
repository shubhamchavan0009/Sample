package com.es;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.es.repository.HospitalRepository;
import com.es.repository.StudentRepository;

@SpringBootApplication
public class EduSeekersApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EduSeekersApplication.class, args);
	}

	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private HospitalRepository hospitalRepository;
	
	
	
	@Override
	public void run(String... args) throws Exception {
//		Student student1=new Student("Jayesh","Mhatre","jd@gmail.com");
//		studentRepository.save(student1);
//		
//		Student student2=new Student("Rahul","Mhatre"," rm@gmail.com");
//		studentRepository.save(student2);
		
	}
	
	
	

}
