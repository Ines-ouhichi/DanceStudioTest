package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.cours;
import com.example.demo.Service.CoursService;
@RestController
public class CoursController {
	
	 @Autowired   
	    private CoursService service;
	 @GetMapping("/getAllcours")
	
		public  ResponseEntity<List<cours>> getAllcours() {
			 List<cours> cours = service.getAllcours();
		  return new ResponseEntity<>(cours, HttpStatus.OK);
		}
	    //@RequestMapping(value="/get", params="code", method = RequestMethod.GET)
		@GetMapping("/cours/{code}")
		public ResponseEntity<cours> getcoursById(@PathVariable(value = "code") int coursId)
				 {
			cours cours = service.getCoursById(coursId);
			return new ResponseEntity<>(cours, HttpStatus.OK);
		}
		   @PostMapping("/add")
		    public ResponseEntity<cours> addEmployee(@RequestBody cours cours) {
		        cours newCours = service.addcours(cours);
		        return new ResponseEntity<>(newCours, HttpStatus.CREATED);
		    }

		  @PutMapping("/update")
		    public ResponseEntity<cours> updatecours(@RequestBody cours cours) {
		        cours updateCours = service.updatecours(cours);
		        return new ResponseEntity<>(updateCours, HttpStatus.OK);
		    }
		    
		    @DeleteMapping("/delete/{id}")
		    public ResponseEntity<?> deletecours(@PathVariable("id") int id) {
		        service.deletecours(id);
		        return new ResponseEntity<>(HttpStatus.OK);
		    }
}
