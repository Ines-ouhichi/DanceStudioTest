package com.example.demo.Entity;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "spectacles")
@DiscriminatorValue("spectacle")
public class spectacle extends Event implements Serializable{
	
	private String Type_dance;

	public spectacle(int numEvent, String nomEvent, String dateEvent, String lieu, String type_dance) {
		super(numEvent, nomEvent, dateEvent, lieu);
		Type_dance = type_dance;
	}

	public String getType_dance() {
		return Type_dance;
	}

	public void setType_dance(String type_dance) {
		Type_dance = type_dance;
	}
	
	

}
