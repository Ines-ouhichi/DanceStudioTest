package com.example.demo.Entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
//import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "LesCours")
public class cours implements Serializable {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int code;
	
	
	 @Column(name="nom_c",nullable = false, length = 64)
	private String nom_c;
	 
	 
	private float prix_c;
	
	
	 @Column(name="description",nullable = false, length = 120)
	private String desc;
	 
	
	 @ManyToMany 
	 private Collection<Client> clients=new ArrayList<>();
	@ManyToOne
	private choegraphe cheographe;
	
	public cours(int code, String nom_c, float prix_c, String desc) {
		super();
		this.code = code;
		this.nom_c = nom_c;
		this.prix_c = prix_c;
		this.desc = desc;
	}
	public cours() {
		super();
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getNom_c() {
		return nom_c;
	}
	public void setNom_c(String nom_c) {
		this.nom_c = nom_c;
	}
	public float getPrix_c() {
		return prix_c;
	}
	public void setPrix_c(float prix_c) {
		this.prix_c = prix_c;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	@Override
	public String toString() {
		return "cours [code=" + code + ", nom_c=" + nom_c + ", prix_c=" + prix_c + ", desc=" + desc + ", clients="
				+ clients + ", cheographe=" + cheographe + "]";
	}
	
	

}
