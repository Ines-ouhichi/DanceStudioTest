package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.cours;
import com.example.demo.Respository.CoursRepository;

@Service
public class CoursService {
	@Autowired
    private CoursRepository repo;
    
	   public List<cours> getAllcours() {
	       return repo.findAll();
	    }
	   
	   public cours addcours(cours cours) {
	        return repo.save(cours);
	    }
	   
	   public cours getCoursById(int code) {
		   return repo.findById(code).get();
	   }
	   
	   public cours updatecours(cours cours) {
	        return repo.save(cours);
	    }
	   
	   public void deletecours(int id){
	        repo.deleteById(id);
	    }
}

