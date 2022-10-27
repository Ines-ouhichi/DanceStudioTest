package com.example.demo.Entity;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "competitions")
@DiscriminatorValue("competition")
public class competition extends Event implements Serializable {

	private float prix;


	

	public competition(int numEvent, String nomEvent, String dateEvent, String lieu, float prix) {
		super(numEvent, nomEvent, dateEvent, lieu);
		this.prix = prix;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}
	

}
