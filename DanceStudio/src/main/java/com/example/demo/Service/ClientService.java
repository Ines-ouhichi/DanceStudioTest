package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Client;
import com.example.demo.Entity.Personne;
import com.example.demo.Respository.cltRepository;
import com.example.demo.Respository.personneRespository;

@Service
public class ClientService {
	
	@Autowired
	private cltRepository repo;


	public List<Client> listAll() {
        return repo.findAll();
    }
    
    public Client save(Client clt) {
       return repo.save(clt);
    }
    
    public Client findByEmail(String email) {
    	return repo.findCltByEmail(email);
    }
    
    public Client findCltByEmailAndPassword(String email,String password)
    {
    	return repo.findCltByEmailAndPassword(email, password);
    }
    public Client get(long id) {
        return (Client) repo.findById(id).get();
    }
    
    public void delete(long id) {
        repo.deleteById(id);
    }

}

