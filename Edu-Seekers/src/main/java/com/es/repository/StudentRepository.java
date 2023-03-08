package com.es.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.es.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
