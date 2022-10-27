package com.example.demo.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@DiscriminatorValue("personne")
public class Personne implements Serializable {
	 @Id
	    @GeneratedValue(strategy = GenerationType.TABLE)
	    private Long id;
	     
	 //@NotBlank(message = "Entrez votre mail")
	 //@Email(message= "Entrez une addresse mail valide ")
       
	    @Column(nullable = false, length = 45)
	    private String email;
	     
	 
	 //@NotBlank (message = "Entrez votre password")
	// @Length (min= 4, message = "Passwords doit avoir au moins 4 caracteres") 
	    @Column(nullable = false, length = 64)
	    private String password;
	    
	// @NotBlank(message = "Entrez votre nom")
	    @Column(name = "NomPers")
	    private String NomPers;
	     
	// @NotBlank(message = "Entrez votre prenom")
	    @Column(name = "PrenomPers")
	    private String PrenomPers;

		public Personne(Long id, String email, String password, String NomPers, String PrenomPers) {
			super();
			this.id = id;
			this.email = email;
			this.password = password;
			this.NomPers = NomPers;
			this.PrenomPers = PrenomPers;
		}

		public Personne() {
			super();
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getEmail() {
			return this.email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return this.password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getNomPers() {
			return this.NomPers;
		}

		public void setNomPers(String NomPers) {
			this.NomPers = NomPers;
		}

		public String getPrenomPers() {
			return this.PrenomPers;
		}

		public void setPrenomPers(String PrenomPers) {
			this.PrenomPers = PrenomPers;
		}

	
	    

	

}
