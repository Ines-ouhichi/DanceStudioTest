package com.example.demo.Respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Client;
import com.example.demo.Entity.Personne;
@Repository
public interface personneRespository extends JpaRepository<Personne,Long> {
	

}
