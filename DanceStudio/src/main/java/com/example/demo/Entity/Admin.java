package com.example.demo.Entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "administrateurs")
@DiscriminatorValue("admin")
public class Admin extends Personne implements Serializable{
	
	@OneToMany
	private Collection<Event> evenements=new ArrayList<>();
	
	
	public Admin() {
		super();
	}


	public Admin(Long id, String email, String password, String nom_Pers, String prenom_Pers) {
		super(id, email, password, nom_Pers, prenom_Pers);
	}


	
	
	
}
