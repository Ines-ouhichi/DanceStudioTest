package com.example.demo.Entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "clients")
@DiscriminatorValue("CLIENT")

public class Client  extends Personne implements Serializable{
	
	private String niveau;
    
	 @ManyToMany 
	 private Collection<cours> cours=new ArrayList<>();
	 
	 @ManyToMany
		private Collection<Event> evenements=new ArrayList<>();


	public Client() {
		super();
	}



	public Client(Long id, String email, String password, String nom_Pers, String prenom_Pers) {
		super(id, email, password, nom_Pers, prenom_Pers);
	}



	public Client(Long id, String email, String password, String nom_Pers, String prenom_Pers, String niveau) {
		super(id, email, password, nom_Pers, prenom_Pers);
		this.niveau = niveau;
	}
	

}
