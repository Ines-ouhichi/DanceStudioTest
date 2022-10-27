package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Client;
import com.example.demo.Respository.personneRespository;
import com.example.demo.Service.ClientService;

@RestController
public class ClientController {
	 
	@Autowired
	  private ClientService service;
	@Autowired
	private personneRespository repo;
	@GetMapping("/recu")
	@ResponseBody
	public List<Client> recu(){
		return service.listAll();
	}
	
	
	@PostMapping ("/cltEnregistre")
	@CrossOrigin(origins ="http://localhost:4200")
	public Client enregistrerClt (@RequestBody Client clt) throws Exception {
		String tempEmail=clt.getEmail();
		if(tempEmail !=null && !"".equals(tempEmail)) {
			Client cltObj=service.findByEmail(tempEmail);
			if(cltObj !=null) {
				throw new Exception("clt avec "+tempEmail+" deja existe");
			}
		}
		
		
		 Client cltObj;
		    cltObj = service.save(clt);
		    return cltObj;
	}
	
	@PostMapping ("/cltlogin")
	@CrossOrigin(origins ="http://localhost:4200")
	public Client loginClt(@RequestBody Client clt) throws Exception{
		String tempEmail=clt.getEmail();
		String tempPassword=clt.getPassword();
		Client cltObj=null;
		if(tempEmail !=null && tempPassword !=null) {
			cltObj=service.findCltByEmailAndPassword(tempEmail, tempPassword);
		}
		if(cltObj==null) {
			throw new Exception("informations erronées");
		}
		return cltObj;
	}
	   
	
	
	
	/*@GetMapping("/signupClt")
	public String showRegistrationForm() {
	    return "signupClt";
	}
	
	
	
	@RequestMapping( "/saveData")
	//@ResponseBody
	public String savedata(Client clt) {
	
	   service.save(clt);
	     
	    return "signUpOK";
	}
*/
}
