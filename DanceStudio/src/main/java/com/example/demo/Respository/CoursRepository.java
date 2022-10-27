package com.example.demo.Respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.cours;

public interface CoursRepository extends JpaRepository<cours, Integer>{
	
}
