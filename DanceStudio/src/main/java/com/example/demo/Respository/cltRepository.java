package com.example.demo.Respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Client;
@Repository
public interface cltRepository extends JpaRepository<Client,Long> {
	public Client findCltByEmail(String email);
	public Client findCltByEmailAndPassword(String email,String password);


}
