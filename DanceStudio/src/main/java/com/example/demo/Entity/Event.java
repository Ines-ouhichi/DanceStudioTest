package com.example.demo.Entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;


@Entity
@Table(name = "events")

@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@DiscriminatorValue("events")

public class Event implements Serializable{
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.TABLE)
	 private int numEvent;
	  private String nomEvent;
	 @Column(name = "DateEvent")
	private String DateEvent;
	 @Column(name = "lieuEvent")
	private String lieu;
	 @ManyToOne
	 private Admin admin;
	 

	 @ManyToMany 
	 private Collection<Client> clients=new ArrayList<>();
	 
	public Event(int numEvent, String nomEvent, String dateEvent, String lieu) {
		super();
		this.numEvent = numEvent;
		this.nomEvent = nomEvent;
		DateEvent = dateEvent;
		this.lieu = lieu;
	}
	
	
	public int getNumEvent() {
		return numEvent;
	}


	public void setNumEvent(int numEvent) {
		this.numEvent = numEvent;
	}


	public String getNomEvent() {
		return nomEvent;
	}
	public void setNomEvent(String nomEvent) {
		this.nomEvent = nomEvent;
	}
	public String getDateEvent() {
		return DateEvent;
	}
	public void setDateEvent(String dateEvent) {
		DateEvent = dateEvent;
	}
	public String getLieu() {
		return lieu;
	}
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	
	

	
	

}
